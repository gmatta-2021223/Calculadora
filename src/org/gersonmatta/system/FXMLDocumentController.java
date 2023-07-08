/*
    Nombre: Gerson Aaròn Matta Aguilar
    Codigo Tecnico: IN5AV
    Carnè: 2021223
    Fecha de Creacion: 21/03/2022
    Fecha de Modificacion: 28/03/2022
*/

package org.gersonmatta.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    double dato1=0, dato2=0, dato3=0;
    String signo, comprobacion;
    int contadorSigno=0;
    
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnRaiz;
    @FXML private Button btnCuadrado;
    @FXML private Button btnUnoX;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnPorcentaje;
    @FXML private TextField txtPantalla;
    @FXML private Button btnIgual;
    @FXML private Button btnBorrar;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        txtPantalla.setEditable(false);
        
        if (event.getSource() == btnUno ){

            txtPantalla.setText(txtPantalla.getText()+"1");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);
            
        }else if (event.getSource() == btnDos ) {
            
            txtPantalla.setText(txtPantalla.getText()+"2");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);
            
        }else if (event.getSource() == btnTres ) {
            
            txtPantalla.setText(txtPantalla.getText()+"3");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnCuatro ) {

            txtPantalla.setText(txtPantalla.getText()+"4");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnCinco ) {
            
            txtPantalla.setText(txtPantalla.getText()+"5");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnSeis ) {
            
            txtPantalla.setText(txtPantalla.getText()+"6");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnSiete ) {
            
            txtPantalla.setText(txtPantalla.getText()+"7");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnOcho ) {
            
            txtPantalla.setText(txtPantalla.getText()+"8");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnNueve ) {

            txtPantalla.setText(txtPantalla.getText()+"9");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnCero ) {
            
            txtPantalla.setText(txtPantalla.getText()+"0");
            btnMas.setDisable(false);
            btnMenos.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);

        }else if (event.getSource() == btnMas ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
                
                contadorSigno++;
                
                if ( contadorSigno == 1) {
                    
                    btnMas.setDisable(true);
                    signo ="+";
                    dato1= Double.parseDouble( txtPantalla.getText() );
                    txtPantalla.clear();
                    
                }else{
                    
                    switch(signo){
                    
                        case "-":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" - "+dato1);
                            dato1=dato2-dato1;
                            System.out.println(dato1);
                            break;
                        case "+":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" + "+dato1);
                            dato1=dato2+dato1;
                            System.out.println(dato1);
                            break;
                        case "/":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" / "+dato1);
                            dato1=dato2/dato1;
                            System.out.println(dato1);
                            break;
                        case "*":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" * "+dato1);
                            dato1=dato2*dato1;
                            System.out.println(dato1);
                            break;
                    
                    }
                    
                    signo="+";
                    txtPantalla.clear();
                
                } 
            
            }
        }else if ( event.getSource() == btnMenos ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                contadorSigno++;
                
                if ( contadorSigno == 1) {
                    
                    btnMenos.setDisable(true);
                    signo ="-";
                    dato1= Double.parseDouble( txtPantalla.getText() );
                    txtPantalla.clear();
                    
                }else{
                    
                    switch(signo){
                    
                        case "-":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" - "+dato1);
                            dato1=dato2-dato1;
                            System.out.println(dato1);
                            break;
                        case "+":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" + "+dato1);
                            dato1=dato2+dato1;
                            System.out.println(dato1);
                            break;
                        case "/":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" / "+dato1);
                            dato1=dato2/dato1;
                            System.out.println(dato1);
                            break;
                        case "*":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" * "+dato1);
                            dato1=dato2*dato1;
                            System.out.println(dato1);
                            break;
                    
                    }
                    
                    signo="-";
                    txtPantalla.clear();
                
                }
            
            }
        }else if ( event.getSource()  == btnMulti ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                contadorSigno++;
                
                if ( contadorSigno == 1) {
                    
                    btnMulti.setDisable(true);
                    signo ="*";
                    dato1= Double.parseDouble( txtPantalla.getText() );
                    txtPantalla.clear();
                    
                }else{
                    
                    switch(signo){
                    
                        case "-":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" - "+dato1);
                            dato1=dato2-dato1;
                            System.out.println(dato1);
                            break;
                        case "+":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" + "+dato1);
                            dato1=dato2+dato1;
                            System.out.println(dato1);
                            break;
                        case "/":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" / "+dato1);
                            dato1=dato2/dato1;
                            System.out.println(dato1);
                            break;
                        case "*":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" * "+dato1);
                            dato1=dato2*dato1;
                            System.out.println(dato1);
                            break;
                    
                    }
                    
                    signo="*";
                    txtPantalla.clear();
                    
                }
            
            }
        }else if ( event.getSource() == btnDivi ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                contadorSigno++;
                
                if ( contadorSigno == 1) {
                    
                    btnDivi.setDisable(true);
                    signo ="/";
                    dato1= Double.parseDouble( txtPantalla.getText() );
                    txtPantalla.clear();
                    
                }else{
                    
                    switch(signo){
                    
                        case "-":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" - "+dato1);
                            dato1=dato2-dato1;
                            System.out.println(dato1);
                            break;
                        case "+":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" + "+dato1);
                            dato1=dato2+dato1;
                            System.out.println(dato1);
                            break;
                        case "/":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" / "+dato1);
                            dato1=dato2/dato1;
                            System.out.println(dato1);
                            break;
                        case "*":
                            dato2=dato1;
                            dato1= Double.parseDouble( txtPantalla.getText() );
                            System.out.println(dato2+" * "+dato1);
                            dato1=dato2*dato1;
                            System.out.println(dato1);
                            break;
                    
                    }
                    
                    signo="/";
                    txtPantalla.clear();
                
                }
            
            }  
        }else if (event.getSource() == btnIgual){
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                switch (signo){
            
                case "+":
                    
                    dato2= Double.parseDouble( txtPantalla.getText() );
                    System.out.println(dato1+" + "+dato2);
                    dato1 = dato1+dato2;
                    
                    txtPantalla.setText( String.valueOf(dato1) );
                    System.out.println("Resultado: "+dato1);
                    
                    contadorSigno=0;
                    
                    break;
                    
                case "-":
                    
                    dato2= Double.parseDouble( txtPantalla.getText() );
                    System.out.println(dato1+" - "+dato2);
                    dato1 = dato1-dato2;
                    
                    txtPantalla.setText( String.valueOf(dato1) );
                    System.out.println("Resultado: "+dato1);
                    
                    contadorSigno=0;
                    
                    break;
                    
                case "*":
                    
                    dato2= Double.parseDouble( txtPantalla.getText() );
                    System.out.println(dato1+" * "+dato2);
                    dato1 = dato1*dato2;
                    
                    txtPantalla.setText( String.valueOf(dato1) );
                    System.out.println("Resultado: "+dato1);
                    
                    contadorSigno=0;
                    
                    break;
                    
                case "/":
                    
                    dato2= Double.parseDouble( txtPantalla.getText() );
                    System.out.println(dato1+" / "+dato2);
                    dato1 = dato1/dato2;
                    
                    txtPantalla.setText( String.valueOf(dato1) );
                    System.out.println("Resultado: "+dato1);
                    
                    contadorSigno=0;
                    
                    break;
                }
            }       
        }else if( event.getSource() == btnPunto ){
        
            comprobacion = txtPantalla.getText();
            
            if ( comprobacion.length() <= 0 ) {
                
                txtPantalla.setText("0.");
                
            }else if ( !(txtPantalla.getText().contains(".") )  ) {
                
                txtPantalla.setText( txtPantalla.getText()+"." );
                
            }
        }else if ( event.getSource() == btnMasMenos ){
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                dato3 = Double.parseDouble( txtPantalla.getText() );
                dato3 = dato3*-1;

                txtPantalla.setText( String.valueOf(dato3) );
            
            }
        }else if ( event.getSource() == btnRaiz ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                dato3 = Double.parseDouble(txtPantalla.getText());
                System.out.println("√"+dato3);
                dato3 = Math.sqrt(dato3);
                System.out.println(dato3);

                txtPantalla.setText( String.valueOf(dato3) );
            
            }   
        }else if (event.getSource() == btnCuadrado){
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                dato3 = Double.parseDouble( txtPantalla.getText() );
                System.out.println(dato3+"^2");
                dato3 = dato3*dato3;

                System.out.println(dato3);
                txtPantalla.setText( String.valueOf( dato3 ) );
            
            }
        }else if (event.getSource() == btnUnoX){
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
                
                dato3 = Double.parseDouble( txtPantalla.getText() );
                System.out.println("1/"+dato3);
                dato3 = 1/dato3;

                System.out.println(dato3);
                txtPantalla.setText( String.valueOf( dato3 ) );
                
            }
        }else if ( event.getSource() == btnC ) {
            
            txtPantalla.clear();
            dato1 = 0.00;
            dato2 = 0.00;
            dato3 = 0.00;
            contadorSigno = 0;
            signo = " ";
            System.out.println("Se ha borrado todo el calculo");
            
            
        }else if ( event.getSource() == btnCE ) {
            
            txtPantalla.clear();
            System.out.println("Se ha borrado el numero mostrado");
            
        }else if ( event.getSource() == btnBorrar ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
            
                String cadena;
                
                cadena =  txtPantalla.getText().substring(0, txtPantalla.getText().length()-1);
                txtPantalla.setText( String.valueOf(cadena)  );
                    
            }
        }else if ( event.getSource() == btnPorcentaje ) {
            
            if ( !(txtPantalla.getText().length() <= 0 )) {
                
                dato3 = Double.parseDouble( txtPantalla.getText() );
                System.out.println(dato3+"%");
                //dato3 = dato3/100;
                dato3 = dato1*dato3/100;

                System.out.println(dato3);
                txtPantalla.setText( String.valueOf( dato3 ) );
                
            }   
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}

/*
else if (event.getSource() == btnPorcentaje ){

    Double valPantalla, valPorciento;
    valPantalla = Double.parseDouble( txtPantalla.getText() );
    txtPantalla.clear();
    valPorciento = dato1 * valPantalla/100
    txtPantalla.setText( String.valueOf( valPorciento ) );

}
*/
