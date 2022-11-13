package application;







import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class Profile_cn  extends MainView implements Initializable{
	@FXML private TextField password = new TextField() ;
	@FXML private TextField name = new TextField() ;
	@FXML private TextField email = new TextField() ;
	@FXML private ImageView girl ;
	@FXML private ImageView boy ;
	
	@FXML
	public void buttonPressed1(ActionEvent event) {
		try {
			if (girl_v) {
				girl_v=false;
				boy_v = true;
				girl.setVisible(false);
				boy.setVisible(true);
			}
			else if (boy_v) {
				girl_v=true;
				boy_v = false;
				girl.setVisible(true);
				boy.setVisible(false);
			}
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed(ActionEvent event) {
		try {
			user_name = name.getText();
			user_Email = email.getText();
			user_password = password.getText();
			name.setText(name.getText());
			email.setText(email.getText());
			password.setText(password.getText());
			sence_name="Start";    
		    show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name.setText(user_name);
		email.setText(user_Email);
		password.setText(user_password);
		if (girl_v) {
			girl.setVisible(true);
			boy.setVisible(false);
		}
		else if (boy_v) {
			girl.setVisible(false);
			boy.setVisible(true);
		}
		
		
	}
	
	
}
