module Colors_IQ {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.media;
	requires java.management;
	
	opens application to javafx.graphics, javafx.fxml;
}
