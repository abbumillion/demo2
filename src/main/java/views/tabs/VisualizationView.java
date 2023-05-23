package views.tabs;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import views.View;

public class VisualizationView extends View {
    private Circle circle1,circle2;
    private HBox hBox;
    @Override
    public void init() {
        circle1 = new Circle();
        circle2 = new Circle();
        hBox = new HBox();
    }

    @Override
    public void build() {
        hBox.getChildren().addAll(circle1,circle2);
        getChildren().addAll(hBox);
    }

    @Override
    public void align() {
        hBox.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);
    }

    @Override
    public void sizing() {
        hBox.prefWidthProperty().bind(widthProperty());
        hBox.prefHeightProperty().bind(heightProperty());
    }

    public Circle getCircle1() {
        return circle1;
    }

    public Circle getCircle2() {
        return circle2;
    }
}
