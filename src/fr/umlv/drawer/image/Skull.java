package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;

/**
 * Skull is a class wich responsable for drawing a green ball wich represent a squelet
 */
public class Skull extends DrawIcons {

	
	
	/**
	 * initilisation of the class
	 */
	public Skull () {

	}
	
		
	@Override
	public String toString() {
		return "Skull";
	}
	

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.red;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "SKULL";
	}
}
