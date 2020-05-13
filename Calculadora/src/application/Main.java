package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			 Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			 Scene scene = new Scene(parent);
			 scene.getStylesheets().add("/application/application.css");
			 stage.setScene(scene);
			 stage.setTitle("Calculadora JFX");
			 Image image = new Image("/icons/icon.png");
			 stage.getIcons().add(image);
			 stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
