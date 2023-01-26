package MainSystem;
import java.awt.GridBagLayout;
import java.io.File;
import java.util.ArrayList;
import java.awt.GridBagConstraints;  
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class CourseDetailViewer extends Viewer 
{
    JButton backBtn, applyBtn;
    JLabel lCourseName, lEntry;
    JTextArea taDesc;
    JComboBox cbCourse;
    JPanel panelBTN, panelDropdown, panelVid, panelDesc, pCentre, pTop;
    JFXPanel pfxVideo;
    Button playButton;

    String [] courses;

    String name, desc, videoFilePath;

    public CourseDetailViewer()
    {
        

        setBackground(java.awt.Color.WHITE);
        backBtn = new JButton("Go back");
        
        applyBtn = new JButton("Apply course!");
        taDesc = new JTextArea(desc, 15, 56);

        panelBTN = new JPanel();
        panelDropdown = new JPanel();
        panelDesc = new JPanel();
        pfxVideo = new JFXPanel();
        pCentre = new JPanel();
        pTop = new JPanel();

        
        taDesc.setLineWrap(true);
        taDesc.setWrapStyleWord(true);
        taDesc.setEditable(false);
        taDesc.setAlignmentX(50);
   
        panelBTN.add(backBtn);
    
        panelDesc.add(taDesc);
        pTop.setLayout(new BorderLayout());
        pTop.add(panelBTN, BorderLayout.NORTH);
        pTop.add(panelDropdown, BorderLayout.CENTER);
        pCentre.add(pfxVideo);
        pCentre.add(panelDesc);
        setLayout(new BorderLayout());
        this.add(pTop, BorderLayout.NORTH);
        this.add(pCentre, BorderLayout.CENTER);
        this.add(applyBtn, BorderLayout.SOUTH);
    

        setVisible(true);


    }

    public void dropDown(ArrayList<String> coursesList)
    {
        this.courses = coursesList.toArray(new String[0]);
        this.cbCourse = new JComboBox<>(this.courses);
       
        panelDropdown.add(this.cbCourse);
    }

    public void videoPanel(String videoFilePath)
    {
            File file = new File(videoFilePath);
            Media media = new Media(file.toURI().toString());  
                
            //Instantiating MediaPlayer class   
            MediaPlayer mediaPlayer = new MediaPlayer(media);  
            
            //Instantiating MediaView class   
            MediaView mediaView = new MediaView(mediaPlayer);  

            Button playButton = new Button(">");
            playButton.setOnAction(e -> {
              if (playButton.getText().equals(">")) {
                mediaPlayer.play();
                playButton.setText("||");
              } else {
                mediaPlayer.pause();
                playButton.setText(">");
              }
            });

            Button rewindButton = new Button("<<");
            rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
            
            Slider slVolume = new Slider();
            slVolume.setPrefWidth(150);
            slVolume.setMaxWidth(Region.USE_PREF_SIZE);
            slVolume.setMinWidth(30);
            slVolume.setValue(100);
            mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));
        
            HBox hBox = new HBox(10);
            hBox.setAlignment(Pos.CENTER);
            hBox.getChildren().addAll(playButton, rewindButton, new Label("Volume"), slVolume);
            
            //by setting this property to true, the Video will be played   
            mediaPlayer.setAutoPlay(false);  
            mediaView.setFitWidth(500);
            mediaView.setFitHeight(500);

            GridPane pane = new GridPane();
            
             
            Scene scene = new Scene(pane,500,320);  
            pane.addRow(0, mediaView);
            pane.addRow(1, hBox);
            pane.setStyle("-fx-background-color: none;");
            
            this.pfxVideo.setScene(scene);  
            
    }

}
    

