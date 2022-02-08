package fr.umlv.drawer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


/**
 * Drawer is the class responsable of the words design 
 */
public class DrawWord implements Drawer {
	private Rectangle2D.Float rectangle;
	
	
	/**
	 * initilisation of the class
	 */
	public DrawWord () {
		this.rectangle = new Rectangle2D.Float(500, 500, 100, 100);
	}
	
	/**
	 * @param graphics is reponsable of grapics elements
	 * @param fond contains the color of the background
	 * @param x the first coordinates
	 * @param y the second coordinates
	 0return a boolean which inform if the object can move 
	 */
	public void draw(Graphics2D graphics, Color fond, int x, int y) {
	     
	      
	    	// hide the previous rectangle
		rectangle = new Rectangle2D.Float(x -10, y -30, 50, 50);    
		graphics.setColor(fond);
	        graphics.fill(rectangle);
	        
	        graphics.setColor(Color.black);
	        
	        graphics.fill(rectangle);
	        
	        
	        graphics.setColor(fond);
	        graphics.drawString(this.toString(), x, y);
	        
	        graphics.setColor(this.getColor()); 
	        graphics.drawString(this.toString(), x, y);
	    
	 }
	
	@Override
	public String toString() {
		return "Draw";
	}
	
	
	/**
	 * @return the color the item
	 */
	public Color getColor() {
		return Color.black;
	}
	
	
	/**
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return this.toTextFormat();
	}
	
}
