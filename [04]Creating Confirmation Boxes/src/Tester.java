import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tester extends Application {

	Stage window;
	Button button;
	
	public static void main (String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Some Title");
		button = new Button("Click this");
		
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title..", "Are you sure");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 600, 300);
		window.setScene(scene);
		window.show();
		
	}

}
