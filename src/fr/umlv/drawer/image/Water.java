package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;


/**
 * Water is a class wich responsable for drawing a green ball wich represent the water
 */
public class Water extends DrawIcons {
	
	
	/**
	 * initilisation of the class
	 */
	public Water () {
		
	}
	
	
	@Override
	public String toString() {
		return "Water";
	}

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.blue;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "WATER";
	}
}
