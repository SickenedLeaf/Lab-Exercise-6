package application;

import javafx.scene.shape.Shape;

public abstract class DrawableShape {
	
	private int centerX;
	private int centerY;
	private String color;
	
	public DrawableShape(int centerX, int centerY, String color) {
		
		this.centerX = centerX;
		this.centerY = centerY;
		this.color = color;
	
	}
	
	// Accessors
	
	public int getCenterX() { return centerX; }
	public int getCenterY() { return centerY; }
	public String getColor() { return color; }
	
	// Mutators: move shape
	public void move (int dx, int dy) {
		centerX += dx;
		centerY += dy;
	}
	
	// Abstract method: must be implemented by subclasses
	public abstract Shape draw();

}
