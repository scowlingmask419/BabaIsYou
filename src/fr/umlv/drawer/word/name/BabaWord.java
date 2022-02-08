package fr.umlv.drawer.word.name;
import java.awt.Color;

import fr.umlv.drawer.DrawWord;


/**
 * BabaWord is a class wich responsable for drawing a box wich represent the word BABA 
 */
public class BabaWord extends DrawWord  {
	
	/**
	 * initilisation of the class
	 */
	public BabaWord () {
	}
	
	
	@Override
	public String toString() {
		return "BABAW";
	}
	
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return Color.GREEN;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "BABAW";
	}
}
