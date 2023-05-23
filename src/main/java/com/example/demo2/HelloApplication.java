package com.example.demo2;

import controller.LoaderController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Collector;
import views.LoaderView;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    private LoaderController loaderController;

    @Override
    public void init() throws Exception {
        super.init();
        loaderController = new LoaderController(new LoaderView());
    }

    @Override
    public void start(Stage stage) throws IOException {
        loaderController.register();
        loaderController.start();

    }

    public static void main(String[] args) {
        launch();
    }
}