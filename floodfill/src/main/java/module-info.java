//arquivo de módulo do java, começou a existir apenas a partir da versão 9, vai definir quais pacotes o módulo expoorta e quais mósulos ele requer (ou seja, conecta módulos e pacotes)

module floodfill {
    requires javafx.controls; //requer...
    requires javafx.fxml;

    opens floodfill to javafx.fxml;
    exports floodfill;
}
