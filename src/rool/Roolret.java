package rool;


import javax.swing.JFrame;

import java.awt.Dimension;

import java.awt.Point;



import javafx.application.Platform;

import javafx.embed.swing.JFXPanel;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.web.WebEngine;

import javafx.scene.web.WebView;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.SwingUtilities;
import javafx.fxml.FXML;




public class Roolret {
	
	@FXML
	static 
	WebView webview;



	private static void initFX() {

		JFrame frame = new JFrame("룰렛");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		frame.getContentPane().setLayout(null);

		//frame.setBackground(Color.BROWN);


//		final JButton jButton = new JButton("Button");

		final JFXPanel fxPanel = new JFXPanel();


//		frame.add(jButton);

		frame.add(fxPanel);

		frame.setVisible(true);



//		jButton.setSize(new Dimension(200, 27));

		fxPanel.setSize(new Dimension(600, 700));

		fxPanel.setLocation(new Point(0, 27));



		frame.getContentPane().setPreferredSize(new Dimension(600, 700));

		frame.pack();

		frame.setResizable(false);



		Platform.runLater(new Runnable() {

			public void run() {

				initAndLoadWebView(fxPanel);

			}

		});

	}

		

	private static void initAndLoadWebView(final JFXPanel fxPanel) {

		Group group = new Group();

		Scene scene = new Scene(group);
		
//		fxPanel.setSize(8000, 8000);
		fxPanel.setScene(scene);
		



		webview = new WebView();



		group.getChildren().add(webview);

		webview.setMinSize(900, 900);

		webview.setMaxSize(900, 900);
		
		
		

		WebEngine webEngine = webview.getEngine();

		webEngine.load("http://192.168.205.29/jqpro/0217/rool.html");

	}



//	Rotate rt = new Rotate();
//	
//	Image img = new Image("");
	public static void main(String[] args) {
		new Roolret().initFX();
	}
}
