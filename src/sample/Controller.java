package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label ispis;
   

    public void akcija(ActionEvent actionEvent) {

            ispis.setText("Bravo!");
        }

}
