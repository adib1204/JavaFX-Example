import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Tester extends Application{

	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("This is a Title");
		button = new Button();
		button.setText("Something something");
		
		//This class will handle the button events
		// e -> is a lambda expression used in java8
		button.setOnAction(e -> {
			System.out.println("Print First Line");
			System.out.println("Print Second Line");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,800,640);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	

}
