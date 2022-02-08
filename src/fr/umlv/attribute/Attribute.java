package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.zen5.KeyboardKey;


/**
 * interface for the attributes of the objects
 * the different "reaction" of the onbject when it in contact of others objects 
 */
public interface Attribute {
	

	
	/**
	 * @param x the first coordinates
	 * @param y the second coordinates
	 * @param distance of the movement
	 * @param touch receive the touch pressed
	 * @param listIcons receive the list of the Icons
	 * @return a boolean which inform if the object can move 
	 */
	boolean react(int x, int y, int distance, KeyboardKey touch, ArrayList<Items> listIcons);
	
	
	
	/**
	 * 
	 * @return the text in a specific form
	 */
	String toTextFormat ();
}
