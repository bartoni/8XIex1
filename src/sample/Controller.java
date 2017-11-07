package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textfield1;
    public TextField textfield2;
    public Label label;

    public void handleClick(ActionEvent actionEvent) {
        if (textfield1.getText().equals("") || (textfield2.getText().equals("")))
            label.setText("Error: one of the textfields is empty!");
        else {
            label.setText(textfield1.getText() + textfield2.getText());
        }
    }
}
