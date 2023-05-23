package app;

import controller.LoaderController;
import javafx.application.Application;
import javafx.stage.Stage;
import views.LoaderView;

import java.io.IOException;

public class app extends Application {
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