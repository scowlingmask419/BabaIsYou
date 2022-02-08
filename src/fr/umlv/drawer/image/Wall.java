package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;

/**
 * Wall is a class wich responsable for drawing a green ball wich represent a wall
 */
public class Wall extends DrawIcons {
	
	
	
	/**
	 * initilisation of the class
	 */
	public Wall () {
	
	}
	
		
	@Override
	public String toString() {
		return "Wall";
	}
	

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.gray;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "WALL";
	}
	
}
