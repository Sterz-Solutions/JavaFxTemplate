import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class sampleController {

    @FXML
    private Button wechsel;

    @FXML
    public void wechsel(ActionEvent e) throws IOException {
        Parent next = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene n = new Scene(next);

        //ziehe Informationen zur Stage
        Stage fenster = (Stage) ((Node) e.getSource()).getScene().getWindow();

        fenster.setScene(n);
        fenster.show();
    }
}