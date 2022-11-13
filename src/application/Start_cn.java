package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Start_cn extends MainView implements Initializable {
	@FXML private Button score=new Button();
	
	@FXML
	public void buttonPressed(ActionEvent event) {
		try {
			sence_name="Profile";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void buttonPressed1(ActionEvent event) {
		try {
			
			sence_name="Levels";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed3(ActionEvent event) {
		try {
			sence_name="Game";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void limparBotaoMensagem(){
		score.setText("Score: "+score_i );
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		limparBotaoMensagem();
		
	}



}
