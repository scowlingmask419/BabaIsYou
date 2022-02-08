package fr.umlv.drawer.word.name;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * FlagWord is a class wich responsable for drawing a box wich represent the flag 
 */
public class FlagWord extends DrawWord implements Drawer {
	
	/**
	 * initilisation of the class
	 */
	public FlagWord () {
	}
	
	
	@Override
	public String toString() {
		return "FLAGW";
	}
	
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return Color.yellow;
	}
	
	
	/**
	 * @return the word in a specific form
	 */
	public String toTextFormat () {
		return "FLAGW";
	}
}
