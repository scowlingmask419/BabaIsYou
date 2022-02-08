package fr.umlv.drawer.word.propriety;

import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;



/**
 * DefeatWord is a class wich responsable for drawing a box wich represent the word defeat 
 */
public class DefeatWord extends DrawWord implements Drawer {
	
	
	/**
	 * initilisation of the class
	 */
	public DefeatWord () {
	}
	
	
	@Override
	public String toString() {
		return "DEFEAT";
	}
	
	
	/**
	 * @return the color's item
	 */
	public Color getColor() {
		return Color.RED;
	}
	
	/** 
	 * @return a text with a specific form
	 */
	public String toTextFormat () {
		return "DEFEATW";
	}
}
