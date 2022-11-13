package application;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Open_cn extends MainView {
	
	@FXML
	public void buttonPressed(ActionEvent event) {
		try {
			sence_name="Register";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
