/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristianluis.controller;

import com.cristianluis.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import com.cristianluis.view.LoginView;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
/**
 *
 * @author informatica
 */
public class SceneManager {
    private Stage escenarioPrincipal;
    private Stage escenarioSecunadario;
    private Scene escenaPrincipal;  
    private static SceneManager instanciaSceneManager;
    
    private SceneManager(){
        
    }
    
       public void ventanaLogin() {

        try{
          this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
        LoginView login = LoginView.getInstanciaLoginView();

        cambiarEscena(login, 450, 500);
          this.escenaPrincipal.setFill(Color.TRANSPARENT);
          new LoginController(login);

        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: cambiar escena");
            objetoNulo.printStackTrace(); //muestra todo el camino del error
            
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: metodo cambiar escena");
            errorPadre.printStackTrace();

        }


    }
 
    public void cambiarEscena( Pane panel, int ancho, int alto ){
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();                                                                                        
        }catch (NullPointerException objetoNulo ){
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo . printStackTrace();// mostrar todo el camino del error
           
        }  catch (Exception errorPadre ){
            JOptionPane.showMessageDialog(null, "Error padre: Cambiar Escena");
            errorPadre.printStackTrace();
        }
                
         
                
    }

    public static SceneManager getInstanciaSceneManager() {
        if(instanciaSceneManager == null) 
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    
    
    public Stage getEscenarioPrinsipal() {
        if( instanciaSceneManager == null )
            instanciaSceneManager = new SceneManager ();
        return escenarioPrincipal;
    }

    public void setEscenarioPrinsipal(Stage escenarioPrinsipal) {
        this.escenarioPrincipal = escenarioPrinsipal;
    }

    public Stage getEscenarioSecunadario() {
        return escenarioSecunadario;
    }

    public void setEscenarioSecunadario(Stage escenarioSecunadario) {
        this.escenarioSecunadario = escenarioSecunadario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
    
}
