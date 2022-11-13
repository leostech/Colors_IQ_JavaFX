package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Levels_cn extends MainView   {
	@FXML private Label lable;
	@FXML
	public void buttonPressed1(ActionEvent event) {
		try {
			sence_name="Level1";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed2(ActionEvent event) {
		try {
			if (level1_v) {
			sence_name="Level2";
			show();
			}
			else {
				lable.setText("You must skip level 1");
				lable.setVisible(true);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed3(ActionEvent event) {
		try {
			if (level2_v) {
			sence_name="Level3";
			show();
			}
			else {
				lable.setText("You must skip level 2");
				lable.setVisible(true);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed4(ActionEvent event) {
		try {
			if (level3_v) {
			sence_name="Level4";
			show();
			}
			else {
				lable.setText("You must skip level 3");
				lable.setVisible(true);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed5(ActionEvent event) {
		try {
			if (level4_v) {
			sence_name="Level5";
			show();
			}
			else {
				lable.setText("You must skip level 4");
				lable.setVisible(true);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed6(ActionEvent event) {
		try {
			sence_name="Start";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
