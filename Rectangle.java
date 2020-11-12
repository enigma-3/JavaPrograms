
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

public class Assignment6b extends Application {
  private RectanglePane rectanglePane = new RectanglePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    // Create and register the handler
    btEnlarge.setOnAction(new EnlargeHandler());
    btShrink.setOnAction(new ShrinkHandler());

    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(rectanglePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("ControlRectangle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      rectanglePane.enlarge();
    }
  }
  
  class ShrinkHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent d) {
      rectanglePane.shrink();
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

class RectanglePane extends StackPane {
  private Rectangle rectangle = new Rectangle(100,50); 
  
  public RectanglePane() {
    getChildren().add(rectangle);
    rectangle.setStroke(Color.BLACK);
    rectangle.setFill(Color.WHITE);
  }
  
  public void enlarge() {
    rectangle.setHeight(rectangle.getHeight() + 2);
    rectangle.setWidth(rectangle.getWidth() + 2);
  }
  
  public void shrink() {
    rectangle.setHeight(rectangle.getHeight() > 2 ? 
      rectangle.getHeight() - 2 : rectangle.getHeight());
    rectangle.setWidth(rectangle.getWidth() > 2 ? 
      rectangle.getWidth() - 2 : rectangle.getWidth());
  }
}