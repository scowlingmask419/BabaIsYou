package fr.umlv.drawer.image;
import java.awt.Color;

import fr.umlv.drawer.DrawIcons;


/**
 * rock is a class wich responsable for drawing a green ball wich represent a rock
 */
public class Rock extends DrawIcons {
	
	
	/**
	 * initilisation of the class
	 */
	public Rock () {
	
	}
	
		
	@Override
	public String toString() {
		return "Rock";
	}
	

	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.orange;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "ROCK";
	}
}
