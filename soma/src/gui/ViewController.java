package gui;
import gui.util.Alerts;
import gui.util.Constraints;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;



public class ViewController implements Initializable{

    @FXML
    private TextField txtNumero1; 
     @FXML
    private TextField txtNumero2; 

    @FXML
    private Label labelResult;

    @FXML
    private Button btsum;

    @FXML
    public void onBtSumClick() {
        try{
        
        double number1 = Double.parseDouble(txtNumero1.getText());
        double number2 = Double.parseDouble(txtNumero2.getText());
        double soma = number1 + number2;

        labelResult.setText(String.format("%.2f", soma));

        }catch(NumberFormatException e ){
            
            Alerts.showAlert("Error", "Parse error" ,e.getMessage(), AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Constraints.setTextFieldDouble(txtNumero1);
        Constraints.setTextFieldDouble(txtNumero2);
        Constraints.setTextFieldMaxLength(txtNumero1, 12);
        Constraints.setTextFieldMaxLength(txtNumero2, 12); 
    }

}
