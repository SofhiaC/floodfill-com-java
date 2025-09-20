//aqui fica o controlador igado ao secondary.fxml (pq q tem 2?)

package floodfill;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}