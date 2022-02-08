package fr.umlv.drawer;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Drawer is the class responsable of the items design 
 */
public interface Drawer {
	/**
	 * @param graphics is reponsable of grapics elements
	 * @param fond contains the color of the background
	 * @param x the first coordinates
	 * @param y the second coordinates 
	 */
	void draw(Graphics2D graphics, Color fond, int x, int y);
	
	/**
	 * @return the color
	 */
	public Color getColor();
	
	/**
	 * 
	 * @return a text with a specific form
	 */
	String toTextFormat ();
}