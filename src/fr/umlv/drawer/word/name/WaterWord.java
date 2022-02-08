package fr.umlv.drawer.word.name;

import java.awt.Color;

import fr.umlv.drawer.DrawWord;
import fr.umlv.drawer.Drawer;


/**
 * WaterWord is a class wich responsable for drawing a box wich represent the Water 
 */
public class WaterWord extends DrawWord implements Drawer {
	
	
	/**
	 * initilisation of the class
	 */
	public WaterWord() {
	}
	
	
	@Override
	public String toString() {
		return "WATERW";
	}
	
	public Color getColor() {
		return Color.blue;
	}
	
	public String toTextFormat () {
		return "WALLW";
	}
}
