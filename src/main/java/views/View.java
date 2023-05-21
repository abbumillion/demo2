package views;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public abstract class View extends VBox implements Viewable {

    public View(){
        getReady();
    }
    public void getReady()
    {
        init();
        build();
        align();
        sizing();
    }
    public void show()
    {
        Scene scene = new Scene(this,WIDTH,HEIGHT);
        MAINSTAGE.setScene(scene);
        MAINSTAGE.show();
    }
}
