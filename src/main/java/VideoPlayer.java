import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class VideoPlayer extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub  
        //Initialising path of the media file, replace this with your file path   
//        String path = "https://www.youtube.com/watch?v=k2EcXmj8uTs";
//
//        //Instantiating Media class
//        Media media = new Media(path);
//
//        //Instantiating MediaPlayer class
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.play();
//
//        //Instantiating MediaView class
//        MediaView mediaView = new MediaView(mediaPlayer);
        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.youtube.com/watch?v=k2EcXmj8uTs"
        );
        //by setting this property to true, the Video will be played   


        //setting group and scene   
        webview.setPrefSize(webview.getWidth(), webview.getHeight());

        primaryStage.setScene(new Scene(webview));
        primaryStage.setTitle("Playing video");
        primaryStage.show();



    }
    public static void main(String[] args) {
        launch(args);
    }

}  