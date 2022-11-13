package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignIn_cn extends MainView{
	@FXML private TextField name;
	@FXML private TextField password;
	@FXML private Label user_lable;
	@FXML private Label password_lable;
	@FXML private Label user_password_lable;
	@FXML private Button btn;
	
	@FXML
	public void buttonPressed(ActionEvent event) {
		
		try {
			
			 user_lable.setVisible(false);
			 password_lable.setVisible(false);
			 btn.setVisible(false);
			 
			 if (user_name.equals(null) && user_password.equals(null) ) {
					user_password_lable.setVisible(true);
					btn.setVisible(true);
					
				}
			 else if (!user_name.equals(name.getText().toString())) {
				
				user_lable.setVisible(true);
				btn.setVisible(true);
				
			}
			else if (!user_password.equals( password.getText().toString())) {
				password_lable.setVisible(true);
				btn.setVisible(true);
	
			}
			
			else  {
				sence_name="Start";
				show();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed2(ActionEvent event) {
		sence_name="SignIn";
		show();
		
	}

	

}
