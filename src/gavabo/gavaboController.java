package gavabo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class gavaboController implements Initializable{

	@FXML ImageView ga;
	@FXML ImageView va;
	@FXML ImageView bo;
	@FXML ImageView ima;
	@FXML ImageView imas;
	@FXML Label me;
	@FXML Label com;
	@FXML Button dobal;
	@FXML Button runs;
	
	private Integer count = 0;
	private Integer counts = 0;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		dobal.setOnMouseClicked(e -> {
			System.out.println("도발");
			ima.setImage(new Image(getClass().getResource("사람1도발.png").toString()));
			imas.setImage(new Image(getClass().getResource("사람2반사.png").toString()));
		});
		
		runs.setOnMouseClicked(e -> {
			imas.setImage(new Image(getClass().getResource("사람2화.png").toString()));
			
			Alert as = new Alert(AlertType.WARNING);
			as.setTitle("도망가기 시전");
			as.setHeaderText("상대방이 화를냅니다 \n도망가기를 거부하였습니다.");
			as.setContentText("도망가기를 원하시면 더블클릭을하세요.");
			as.showAndWait();
			
			if(e.getClickCount() > 1) {
				Platform.exit();
			}
		});
		
	}
	
	public void reset() {
		ima.setImage(new Image(getClass().getResource("사람1.png").toString()));
		imas.setImage(new Image(getClass().getResource("사람2.png").toString()));
	}

	@FXML 
	public void gaga(MouseEvent event) {
		//나
		ima.setImage(new Image(getClass().getResource("가위.png").toString()));
		//상대방
		imas.setImage(new Image(getClass().getResource("바위.png").toString()));
		
		System.out.println(imas.getImage().getClass().getCanonicalName().getClass().getModifiers());
		
		if(ima.getImage().toString().equals("가위.png") && imas.getImage().toString().equals("바위.png")) {
			counts++;
			me.setText(count.toString() + "승");
			com.setText(counts.toString() + "승");
		}
		
	}

	@FXML 
	public void vava(MouseEvent event) {
		//나
		ima.setImage(new Image(getClass().getResource("바위.png").toString()));
		
		//상대방
		imas.setImage(new Image(getClass().getResource("보.png").toString()));
	}

	@FXML 
	public void bobo(MouseEvent event) {
		//나
		ima.setImage(new Image(getClass().getResource("보.png").toString()));
		
		//상대방
		imas.setImage(new Image(getClass().getResource("가위.png").toString()));
	}


}
