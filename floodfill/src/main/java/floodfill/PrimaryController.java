//aqui os controladores ligados ao arquivo primary.fxml (mas o q são eles?)

package floodfill;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
