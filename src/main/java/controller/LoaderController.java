package controller;

import javafx.concurrent.Task;
import views.LoaderView;
import views.View;

public class LoaderController extends Controller{
    private final LoaderView loaderView;
    public LoaderController(View view) {
        super(view);
        loaderView = (LoaderView) view;
    }

    @Override
    public void register() {
        Task task = new Task() {
            @Override
            protected Object call() throws Exception {
                for (int i = 0; i < 1000; i+=5) {
//                    this.updateMessage((getProgress() * 100) + "%");
                    this.updateProgress(i,1000);
                    Thread.sleep(100);
                }
                return null;
            }
        };
        loaderView.getProgressBar().progressProperty().bind(task.progressProperty());
        loaderView.getProgressMessageLabel().textProperty().bind(task.messageProperty());
        new Thread(task).start();
    }



    @Override
    public void start() {
        loaderView.show();
    }
}
