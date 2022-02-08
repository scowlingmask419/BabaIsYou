package fr.umlv.drawer.word.name;

import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;



/**
 * SkullWord is a class wich responsable for drawing a box wich represent the Skull 
 */
public class SkullWord extends DrawWord implements Drawer {
	
	
	/**
	 * initilisation of the class
	 */
	public SkullWord () {
	}
	
	
	@Override
	public String toString() {
		return "SKULLW";
	}
	
	
	/** 
	 * @return the color
	 */
	public Color getColor() {
		return Color.red;
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "SKULLW";
	}
}
