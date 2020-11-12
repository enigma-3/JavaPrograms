package clickerapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ClickerApp extends Application {
  private EllipsePane ellipsePane = new EllipsePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlargeX = new Button("Enlarge X");
    Button btShrinkX = new Button("Shrink X");
    Button btEnlargeY = new Button("Enlarge Y");
    Button btShrinkY = new Button("Shrink Y");
    hBox.getChildren().add(btEnlargeX);
    hBox.getChildren().add(btShrinkX);
    hBox.getChildren().add(btEnlargeY);
    hBox.getChildren().add(btShrinkY);
    
    // Create and register the handler
    btEnlargeX.setOnAction(new EnlargeXHandler());
    btShrinkX.setOnAction(new ShrinkXHandler());
    btEnlargeY.setOnAction(new EnlargeYHandler());
    btShrinkY.setOnAction(new ShrinkYHandler());

    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(ellipsePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("ControlRectangle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  class EnlargeXHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      ellipsePane.enlargeX();
    }
  }
  
  class ShrinkXHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent d) {
      ellipsePane.shrinkX();
    }
  }
  
  class EnlargeYHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent f) {
      ellipsePane.enlargeY();
    }
  }
  
  class ShrinkYHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent g) {
      ellipsePane.shrinkY();
    }
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

class EllipsePane extends StackPane {
    Ellipse ellipse = new Ellipse(); {
    ellipse.setCenterX(50.0f);
    ellipse.setCenterY(50.0f);
    ellipse.setRadiusX(50.0f);
    ellipse.setRadiusY(25.0f);
}
    
  
  public EllipsePane() {
    getChildren().add(ellipse);
    ellipse.setStroke(Color.BLACK);
    ellipse.setFill(Color.WHITE);
  }
  
  public void enlargeX() {
    ellipse.setCenterX(ellipse.getCenterX() + 2);
    ellipse.setRadiusX(ellipse.getRadiusX() + 2);
  }
  
  public void shrinkX() {
    ellipse.setCenterX(ellipse.getCenterX() - 2);
    ellipse.setRadiusX(ellipse.getRadiusX() - 2);
  }
  
  public void enlargeY() {
    ellipse.setCenterY(ellipse.getCenterY() + 2);
    ellipse.setRadiusY(ellipse.getRadiusY() + 2);
  }
  
  public void shrinkY() {
    ellipse.setCenterY(ellipse.getCenterY() - 2);
    ellipse.setRadiusY(ellipse.getRadiusY() - 2);
  }
}