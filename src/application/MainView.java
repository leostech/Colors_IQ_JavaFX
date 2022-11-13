package application;


import java.io.File;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;


public class MainView{
	static Stage stage;
	private Scene scene;
	public String sence_name;
	static String user_name;
	static String user_Email;
	static String user_password;
	static int score_i = 0;
	static boolean level1_v =false ;
	static boolean level2_v =false;
	static boolean level3_v =false;
	static boolean level4_v =false;
	static boolean level5_v =false;
	static boolean girl_v =false;
	static boolean boy_v =true;
	static  Clip clip;
	static AudioInputStream audioStream;
	
	
	

	
	public MainView( ) {
		
		Main main = new Main();
		stage=main.get_stage();
		show2();
		
	}
	public void show2(){
		 try {
		File file = new File("src/1.wav");
		audioStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioStream);
		 } catch(Exception e) {
				e.printStackTrace();
				
			}
	      
	}

	
	public void show() {
		
      try {
    	  
    	  clip.start();
    	 
		    if (sence_name=="Register") {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Register.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="SignIn") {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/SignIn.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Start") {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Start.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Profile") {
		    	clip.stop();
		    	stage.close();
		    	//FXMLLoader j = new FXMLLoader(getClass().getResource("/Interfaces/Profile.fxml"));
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Profile.fxml"));
				//Profile_cn p = new Profile();
				//((Profile_cn) j.getController()).Profile_cn1();
				//p.Profile_cn1();
				//AnchorPane pan1 = j.load();
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Levels") {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Levels.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Game" ) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Game.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Level1" ) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Level1.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Level2" && level1_v) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/level2.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Level3" && level2_v) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/level3.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Level4" && level3_v) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/level4.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    else if (sence_name=="Level5" && level4_v) {
		    	clip.stop();
		    	stage.close();
				AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/level5.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
			
			}
		    
		    else {
		    	
		    	AnchorPane pan1= FXMLLoader.load(getClass().getResource("/Interfaces/Open.fxml"));
				scene = new Scene(pan1);
				stage.setScene(scene);
				stage.show();
		    }
		    
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
      
		
	}

}
