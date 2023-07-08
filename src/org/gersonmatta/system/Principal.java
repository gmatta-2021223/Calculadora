/*
    Nombre: Gerson Aaròn Matta Aguilar
    Codigo Tecnico: IN5AV
    Carnè: 2021223
    Fecha de Creacion: 21/03/2022
    Fecha de Modificacion: 28/03/2022
*/

package org.gersonmatta.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        
        
        Scene scene = new Scene(root);
        escenarioPrincipal.getIcons().add(new Image("/org/gersonmatta/system/CalculadoraImagen.jpg") );
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
