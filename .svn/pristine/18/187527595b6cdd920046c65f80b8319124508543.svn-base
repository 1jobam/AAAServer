package video;
 
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class Controller implements Initializable{

	@FXML MediaView video;
	
    MediaPlayer mp;
    Media me;



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
        String path = new File("src/video/movie.mp4").getAbsolutePath();
        
        me = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(me);
        video.setMediaPlayer(mp);
        mp.setAutoPlay(true);
        DoubleProperty width = video.fitWidthProperty();
        DoubleProperty height = video.fitHeightProperty();
        width.bind(Bindings.selectDouble(video.sceneProperty(), "width"));
        height.bind(Bindings.selectDouble(video.sceneProperty(), "height"));


	}

}
