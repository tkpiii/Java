package com.example.tgpsi_m08_joao_trindade;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //1º PASSO - O método Start associa este Layout a um objeto da classe Parent.
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle(null);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        Settings.setPrimaryStage(primaryStage);
        Settings.ListaProduto();
        Settings.ListaCiente();
        Settings.ListaFuncionario();
        Settings.ListaContas();
        primaryStage.show();
    }
}
