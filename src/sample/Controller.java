package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textfield1;
    public TextField textfield2;
    public Label label;

    public void handleClick(ActionEvent actionEvent) {
        label.setText(textfield1.getText() + " and " + textfield2.getText());
    }
}
