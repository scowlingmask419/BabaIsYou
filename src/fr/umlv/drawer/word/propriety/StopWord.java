package fr.umlv.drawer.word.propriety;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * StopWord is a class wich responsable for drawing a box wich represent the word "stop" 
 */
public class StopWord extends DrawWord implements Drawer  {
	
	
	
	/**
	 * initilisation of the class
	 */
	public StopWord () {
	
	}
	
	
	@Override
	public String toString() {
		return "STOP";
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
		return "STOPW";
	}
}
