/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/

package com.cristianluis.controller;
import com.cristianluis.model.Usuario;
import com.cristianluis.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController {
   private final LoginView LOGIN_VIEW;
   private double ejeX=0;
   private double ejeY=0;
   private AuthSistema authSistema = new AuthSistema();
   
   public LoginController(LoginView loginView){
       this.LOGIN_VIEW = loginView;
       construirAcciones();

   }
 
   private Stage escenarioPrincipal = SceneManager
                                        .getInstanciaSceneManager().getEscenarioPrinsipal();
   
   public void iniciarSesion(){
       String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
       String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();
       
       if( nombreUsuario.isEmpty()){
           this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass(). add("empty");
           JOptionPane.showMessageDialog(null, "NO DEJES VACIO EL NOMBRE USUARIO");
           
       }else if( clave.isEmpty()){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass(). remove("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
           JOptionPane.showMessageDialog(null, "NO DEJES VACIO LA CONTRASEÑA");
          
       }else{
               //Metodo login
               Usuario usuario = authSistema.login(nombreUsuario, clave);
               
               if(usuario == null){
                    JOptionPane.showMessageDialog(null, "VERIFICA TUS CREDENCIALES");
                
               }else{
                    JOptionPane.showMessageDialog(null, "HOLAS");
               }
               }

       
   }
   public void construirAcciones(){
       this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
               (evento)-> {
                   iniciarSesion();
               }
       );
       
       
       this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
               (evento)->{
                   System.exit(0);
        
               }
       );
       
        this.LOGIN_VIEW.setOnMouseClicked(
                (evento)->{
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();
                    
           
                }
        );
        this.LOGIN_VIEW.setOnMouseDragged(
                (evento)->{
                    double ejeXDesplazamientoVentana = evento.getScreenX();
                    double ejeYDesplazamientoVentana = evento.getSceneY();
                    
                    escenarioPrincipal.setX(ejeXDesplazamientoVentana - ejeX );
                    escenarioPrincipal.setY(ejeYDesplazamientoVentana - ejeY );

                }
        );
        
        
        
        
        
   }
   
   
}

 
