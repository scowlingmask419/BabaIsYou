package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.zen5.KeyboardKey;


/**
 * Attribute wich block the icons behind
 */
public class Stop implements Attribute {
	
	/**
	 * @param x the first coordinates
	 * @param y the second coordinates
	 * @param touch receive the touch pressed
	 * @param listIcons receive the list of the Icons
	 * 0return a boolean which inform if the object can move 
	 */
	public boolean react(int x, int y, 
			int distance, KeyboardKey touch,
			ArrayList<Items> listIcons) {
		
		return false;		 
			 
	}
	
	@Override
	public String toString() {
		return "Stop";
	}

	@Override
	public String toTextFormat () {
		return "STOP";
	}
	
}
	
