package fr.umlv.drawer.word.name;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;



/**
 * WallWord is a class wich responsable for drawing a box wich represent the Wall 
 */
public class WallWord extends DrawWord implements Drawer  {
	
	/**
	 * initilisation of the class
	 */
	public WallWord () {
	}
	
	
	@Override
	public String toString() {
		return "WALLW";
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
		return "WALLW";
	}
}
