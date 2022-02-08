package fr.umlv.drawer.image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import fr.umlv.drawer.Drawer;


/**
 * Empty is a class wich responsable for drawing a white ball wich will used for the design
 */
public class Empty implements Drawer {
	private Rectangle2D.Float ellipse;
	
	
	/**
	 * initilisation of the class
	 */
	public Empty () {
		this.ellipse = new Rectangle2D.Float(500, 500, 100, 100);
	}
	
	public void draw(Graphics2D graphics, Color fond, int x, int y) {
	  
	    	// hide the previous rectangle
	        graphics.setColor(fond);
	        graphics.fill(ellipse);
	        
	        graphics.setColor(Color.white);
	        ellipse = new Rectangle2D.Float(x -10, y -30, 99, 99);
	        graphics.fill(ellipse);
	        
	        
	        graphics.setColor(fond);
	        graphics.drawString("---", x, y);
	        
	        graphics.setColor(Color.black);
	        graphics.drawString("---", x, y);
	        
	    
	 }
	
	@Override
	public String toString() {
		return "Empty";
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "EMPTY";
	}


	@Override
	public Color getColor() {
		return null;
	}
	
}