package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;


/**
 * Baba is a class wich responsable for drawing a green ball wich represent BABA
 */
public class Baba extends DrawIcons {
	
	/**
	 * initilisation of the class
	 */
	public Baba () {
		
	}
	
	
	@Override
	public String toString() {
		return "Baba";
	}
	
	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.green;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "BABA";
	}
	
}
