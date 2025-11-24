package application;


import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LE62View {
	
	
	public VBox getContent() {
		
		
		VBox le62Content = new VBox(10);
		le62Content.setAlignment(Pos.CENTER);
		
		Label label52 = new Label("Hangman");
		label52.setFont(Font.font("Times New Roman", 32));
		label52.setTextFill(Color.WHITE);
		
		
		
		Button guessBtn = new Button("Guess");
		ButtonStyler.styleActionButton(guessBtn);
		
		
        
		guessBtn.setOnAction(e -> 
		{
			
		});
		
		
							
		le62Content.getChildren().addAll(label52, guessBtn);
		return le62Content;
	}
	
	

}
