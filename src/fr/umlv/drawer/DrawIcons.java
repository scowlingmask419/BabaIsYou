package fr.umlv.drawer;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


/**
 * Drawer is the class responsable of the icons design 
 */

public class DrawIcons implements Drawer {
	private Ellipse2D.Float ellipse;
	
	/**
	 * initilisation of the class
	 */
	public DrawIcons () {
		this.ellipse = new Ellipse2D.Float(500, 500, 100, 100);
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
		ellipse = new Ellipse2D.Float(x -10, y -30, 50, 50);    
		graphics.setColor(fond);
	        graphics.fill(ellipse);
	        
	        graphics.setColor(this.getColor());
	        
	        graphics.fill(ellipse);
	        
	        
	        graphics.setColor(fond);
	        graphics.drawString(this.toString(), x, y);
	        
	        graphics.setColor(Color.black);
	        graphics.drawString(this.toString(), x, y);
	        
	    
	 }
	
	@Override
	public String toString() {
		return "Draw";
	}
	

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.black;
	}
	
	public String toTextFormat () {
		return this.toTextFormat();
	}
}
