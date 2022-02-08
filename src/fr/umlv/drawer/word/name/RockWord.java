package fr.umlv.drawer.word.name;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;



/**
 * RockWord is a class wich responsable for drawing a box wich represent the rock 
 */
public class RockWord extends DrawWord implements Drawer  {
	
	/**
	 * initilisation of the class
	 */
	public RockWord () {
	}
	
	
	@Override
	public String toString() {
		return "ROCKW";
	}
	
	
	/** 
	 * @return a the color
	 */
	public Color getColor() {
		return Color.orange;
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "ROCKW";
	}
}
