package fr.umlv.drawer.word.propriety;

import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * SinkWord is a class wich responsable for drawing a box wich represent the word "sink" 
 */
public class SinkWord extends DrawWord implements Drawer {
	
	/**
	 * initilisation of the class
	 */
	public SinkWord () {
	
	}
	
	
	@Override
	public String toString() {
		return "SINKW";
	}
	
	
	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.BLUE;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "SINKW";
	}
}
