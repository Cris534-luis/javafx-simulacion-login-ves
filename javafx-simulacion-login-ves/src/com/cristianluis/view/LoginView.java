/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristianluis.view;
import com.cristianluis.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
 

/**
 *
 * @author informatica
 */
public class LoginView extends BorderPane{
    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;

    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;
    private GridPane formulario;
    private ImageView imgLogoLogin;
    private Button btnIniciarSesion;
    private String RUTA_ESTILOS = "/com/cristianluis/style/ ";
 
    
    private LoginView(){
        this.getStylesheets().add(RUTA_ESTILOS +"LoginStyles.css");
        this.setPadding( new Insets(15) );
        
        this.setBorder( new Border(
                new BorderStroke(Paint.valueOf( "#292C8C"), //Color de borde
                        BorderStrokeStyle.SOLID, //Estilo del borde
                        new CornerRadii(22), //pixeles del redondeado
                        new BorderWidths(2)) //Ancho del borde
        ));
        
        this.setBackground( new Background(
                new BackgroundFill(Color.WHITESMOKE, //Color de fondo
                            new CornerRadii(25), //Pixeles del redondeado
                            Insets. EMPTY ) //Ancho del borde
        ));
        
        barraDeOpciones = new HBox(25);
        
        btnCerrarVentana = new Button("x");
        lblTituloVentana = new Label("JAVAFX - SIMULACION LOGIN");
        
        barraDeOpciones.getChildren().addAll(btnCerrarVentana, lblTituloVentana);
        
        this.setTop( barraDeOpciones );
        
        //Objetos del formulario 
        cajaVertical = new VBox();
        
        formulario = new GridPane();
        
        lblNombreUsuario = new Label ("Ingrese su nombre Usuario");
        txtNombreUsuario = new TextField();
        
        lblClave = new Label("Ingrese su contraseña");
        pwdClave = new PasswordField();
        
        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);
        
        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);
        
        // --- SE AGREGA LA INICIALIZACIÓN DEL BOTÓN ---
        btnIniciarSesion = new Button("Iniciar Sesión");
        
        imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setCache(true);
        
        cajaVertical.setAlignment(Pos.CENTER);
        
        // Ahora btnIniciarSesion ya no es null
        cajaVertical.getChildren().addAll(imgLogoLogin, formulario, btnIniciarSesion);
        this.setCenter(cajaVertical );
        
    }

    public static LoginView getInstanciaLoginView() {
        if( instanciaLoginView == null)
            instanciaLoginView = new LoginView();
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCrerrarVentan) {
        this.btnCerrarVentana = btnCrerrarVentan;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }
    
    // Opcional: Getter para acceder al botón de iniciar sesión desde un controlador
    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }
    
    
}