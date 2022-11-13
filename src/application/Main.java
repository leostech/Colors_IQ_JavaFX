package application;
	
import javafx.application.Application;

import javafx.stage.Stage;


public class Main extends Application {
	public Stage s = new Stage();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			s = primaryStage;
			MainView mainView = new MainView();
			mainView.show();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	public Stage get_stage() {
		return s;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
