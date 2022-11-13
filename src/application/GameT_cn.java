package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class GameT_cn extends MainView  {
	@FXML
	public void buttonPressed(ActionEvent event) {
		try {
			sence_name="Start";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
