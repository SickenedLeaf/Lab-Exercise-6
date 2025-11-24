package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends DrawableShape {
	
	private int sideLength;
	
	public Square(int centerX, int centerY, String color, int sideLength) {
		super(centerX, centerY, color);
		this.sideLength = sideLength;
	}
	
	public int getSideLength() { return sideLength;	}
	public void setSideLength(int sideLength) { this.sideLength = sideLength; }
	
	public int getArea() { return sideLength * sideLength; }
	public int getPerimeter() { return 4 * sideLength; }
	
	@Override
	public Rectangle draw() {
		
		Rectangle rect = new Rectangle(getCenterX(), getCenterY(), sideLength, sideLength);
		rect.setFill(Color.web(getColor()));
		rect.setStroke(Color.BLACK);
		return rect;
		
	}

}
