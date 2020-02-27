package eggTest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class eggController implements Initializable {

	@FXML 
	private ImageView ima;

	private int count = 1;
	private Integer result = 1000;
	private boolean gs;

	@FXML Image change;

	@FXML Label counts;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Test");
		counts.setText(result.toString());;
		ima.setImage(new Image(getClass().getResourceAsStream("egg.png")));
	}

	@FXML 
	public void eggclick(MouseEvent event) {
		count++;
		result--;

		counts.setText(result.toString());;
		
		System.out.println(count + "," + result);
		
		if(count == 5) {
			ima.setImage(new Image(getClass().getResourceAsStream("egg2.png")));
		}else if(count == 10){
			ima.setImage(new Image(getClass().getResourceAsStream("egg3.png")));
		}else if(count == 15){
			ima.setImage(new Image(getClass().getResourceAsStream("egg4.png")));
		}else if(count == 20){
			ima.setImage(new Image(getClass().getResourceAsStream("egg5.png")));
		}else if(count == 25){
			ima.setImage(new Image(getClass().getResourceAsStream("egg6.png")));
		}
		
		

	}

}
