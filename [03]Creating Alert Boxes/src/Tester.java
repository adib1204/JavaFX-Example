import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Tester extends Application {
	
	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Put Title Here");
		
		button = new Button("Click this");
		button.setOnAction(e -> AlertBox.display("New Title", "Show some message"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 600, 300);
		window.setScene(scene);
		window.show();
		
	}
}
