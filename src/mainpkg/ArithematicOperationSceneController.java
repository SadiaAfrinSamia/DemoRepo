/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ArithematicOperationSceneController implements Initializable {

    @FXML private TextField xTextField;
    @FXML private TextField yTextField;
    @FXML private Label resultLabel;
    @FXML private Button addButton;
    @FXML
    private Button subtractButton;
    @FXML
    private Button multiplyButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void addButtonOnMouseClicked(MouseEvent event) {
        String xStr=xTextField.getText(); //"12"
        String yStr=yTextField.getText(); //"13"
        
        int xVal=Integer.parseInt(xStr);
        int yVal=Integer.parseInt(yStr);
        
        //xStr+yStr; concatenation
        int sum=xVal+yVal;
        //resultLabel.setText(sum); sum is an integer and context of label is a text
        String resultStr=Integer.toString(sum); //so we need to convert the string to a text
        resultLabel.setText("X+Y="+resultStr);
    }

    @FXML
    private void subtractButtonOnMouseClicked(ActionEvent event) {
        
        resultLabel.setText(
            "X-Y="
            +
            Integer.toString(
                Integer.parseInt(
                    xTextField.getText()
                )
                -
                Integer.parseInt(
                    yTextField.getText()
                )
            )
        );
    }

    @FXML
    private void multiplyButtonOnMouseClicked(MouseEvent event) {
        resultLabel.setText(
            "X*Y="
            +
            Integer.toString(
                Integer.parseInt(
                    xTextField.getText()
                )
                -
                Integer.parseInt(
                    yTextField.getText()
                )
            )
        );
        
    }

    @FXML
    private void addButtonOnMouseExited(MouseEvent event) {
        addButton.setText("ADD");
    }

    @FXML
    private void addButtonOnMouseEntered(MouseEvent event) {
        addButton.setText("GET OUT OF ME");
    }

    @FXML
    private void subtractButtonOnMouseExited(MouseEvent event) {
        subtractButton.setText("SUBTRACT");
    }

    @FXML
    private void subtractButtonOnMouseEntered(MouseEvent event) {
        subtractButton.setText("GET OUT OF ME");
    }

    @FXML
    private void multiplyButtonOnMouseExited(MouseEvent event) {
        multiplyButton.setText("MULTIPLY");
    }

    @FXML
    private void multiplyButtonOnMouseEntered(MouseEvent event) {
        multiplyButton.setText("GET OUT OF ME");
    }
    
}
