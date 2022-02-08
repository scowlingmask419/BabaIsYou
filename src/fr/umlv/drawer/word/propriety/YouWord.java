package fr.umlv.drawer.word.propriety;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * YouWord is a class wich responsable for drawing a box wich represent the word "You" 
 */
public class YouWord extends DrawWord implements Drawer {
	
	/**
	 * initilisation of the class
	 */
	public YouWord () {
	
	}
	
	
	@Override
	public String toString() {
		return "YOU";
	}
	
	
	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.white;
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "YOUW";
	}
}
