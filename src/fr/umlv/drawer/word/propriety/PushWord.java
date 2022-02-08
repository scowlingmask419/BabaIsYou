package fr.umlv.drawer.word.propriety;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * PushWord is a class wich responsable for drawing a box wich represent the word "push" 
 */
public class PushWord extends DrawWord implements Drawer {
	
	/**
	 * initilisation of the class
	 */
	public PushWord () {
	}
	
	
	@Override
	public String toString() {
		return "PUSHW";
	}
	
	
	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.WHITE;
	}
	
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "PUSHW";
	}
}
