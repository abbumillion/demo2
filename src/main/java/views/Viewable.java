package views;

import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;

public interface Viewable {
    Stage MAINSTAGE = new Stage();
    Stage SECONDARYSTAGE = new Stage();
    Popup POPUP = new Popup();
    double WIDTH = Screen.getPrimary().getBounds().getWidth();
    double HEIGHT = Screen.getPrimary().getBounds().getHeight();
    void init();
    void build();
    void align();
    void sizing();
}
