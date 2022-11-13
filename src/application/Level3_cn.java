package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioSystem;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Level3_cn extends MainView implements Initializable {
	@FXML private Button btn;
	@FXML private ImageView close2;
	@FXML private ImageView close3;
	@FXML private ImageView close1;
	@FXML private ImageView close4;
	@FXML private ImageView close5;
	@FXML private ImageView close6;
	@FXML private ImageView close7;
	@FXML private ImageView right;
	@FXML private Label Score = new Label() ;
	private boolean btn_v = false;
	private boolean Cheak = false;
	private boolean tryagain = false;
	private int second2 = 15;
	@FXML private Button second;
	@FXML
	public void buttonPressed1(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close1.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed2(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close2.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed3(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close3.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed4(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close4.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed5(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close5.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed6(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close6.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed7(ActionEvent event) {
		try {
			File file = new File("src/close.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			close7.setVisible(true);
			btn.setVisible(true);
			btn.setText("Try Again!");
			btn_v=true;
			
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void buttonPressedr(ActionEvent event) {
		try {
			File file = new File("src/right.wav");
			audioStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			if(!btn_v) {
			right.setVisible(true);
			btn.setVisible(true);
			if (!level3_v) {
				score_i+=100;
				Score.setText("Score: "+score_i );
				level3_v = true;
			}
			btn.setText(" Next Level");
			btn_v=true;
			Cheak =true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed9(ActionEvent event) {
		try {
			sence_name="Levels";
			show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void buttonPressed8(ActionEvent event) {
		try {
			if (Cheak) {
				
			sence_name="Level4";
			show();
			}
			else {
				sence_name="Level3";
				show();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Score.setText("Score: "+score_i );
		 Timer timer = new Timer();
		    timer.scheduleAtFixedRate(new TimerTask() {
		        @Override
		        public void run() {
		            Platform.runLater(() -> {
		            	
		            	if(!tryagain && !btn_v) {
		            	
						//System.out.println(second2);
						second.setText("00:00:" +second2 );
						second2--;
						if (second2==0) {
							
							tryagain=true;
							btn.setVisible(true);
							btn.setText("Try Again!");
							btn_v=true;
						}
		            	}
		            });
		            
		        }
		    }, 1000, 1000);
		
	}
	


}
