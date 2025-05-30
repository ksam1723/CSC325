module edu.farmingdale.csc325 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325 to javafx.fxml;
    exports edu.farmingdale.csc325;
}