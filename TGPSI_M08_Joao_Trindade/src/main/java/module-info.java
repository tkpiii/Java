module com.example.tgpsi_m08_joao_trindade {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tgpsi_m08_joao_trindade to javafx.fxml;
    exports com.example.tgpsi_m08_joao_trindade;
}