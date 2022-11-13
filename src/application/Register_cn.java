package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Register_cn extends MainView  {
	@FXML private TextField name;
	@FXML private TextField email;
	@FXML private TextField password;
	@FXML private Label user_lable;
	@FXML private Label email_lable;
	@FXML private Label password_lable;
	@FXML private Button btn;
	private static final String regex = "^(.+)@(.+)$";
	
	@FXML
	public void buttonPressed(ActionEvent event) {
		try {
			user_name = name.getText().toString();
			user_Email = email.getText().toString();
			user_password = password.getText().toString();
			
		 if(!user_Email.equals(null) && !user_password.equals(null) && !user_name.equals(null)) {
				Pattern pattern = Pattern.compile(regex);  
			    Matcher matcher = pattern.matcher(user_Email);
			    if(!matcher.matches()) {
			    	email_lable.setText("Email is invalid try again!");
					email_lable.setVisible(true);
					btn.setVisible(true);
			    }
			    else {
			    	sence_name="SignIn";    
				    show();
			    }
				
			}	
	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void buttonPressed2(ActionEvent event) {
		sence_name="Register";
		show();
		
	}


}
