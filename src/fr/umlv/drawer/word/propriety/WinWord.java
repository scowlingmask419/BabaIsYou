package fr.umlv.drawer.word.propriety;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * WinWord is a class wich responsable for drawing a box wich represent the word "win" 
 */
public class WinWord extends DrawWord implements Drawer {
	
	
	
	/**
	 * initilisation of the class
	 */
	public WinWord () {
	
	}
	
	
	@Override
	public String toString() {
		return "WIN";
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
		return "WINW";
	}
}
