package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;


/**
 * Flag is a class wich responsable for drawing a yellow ball wich represent the flag of the end
 */
public class Flag extends DrawIcons {
	
	
	
	/**
	 * initilisation of the class
	 */
	public Flag () {
		
	}
	
	
	@Override
	public String toString() {
		return "Flag";
	}
	

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.yellow;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "FLAG";
	}
}
