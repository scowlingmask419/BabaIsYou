package fr.umlv.drawer.word.operation;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;



/**
 * IsWord is a class wich responsable for drawing a box wich represent the word is 
 */
public class IsWord extends DrawWord implements Drawer  {
	
	/**
	 * initilisation of the class
	 */
	public IsWord () {
	}
	
	
	@Override
	public String toString() {
		return "ISW";
	}
	
	
	/** 
	 * @return the color
	 */
	public Color getColor() {
		return Color.orange;
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "ISW";
	}
}
