package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.zen5.KeyboardKey;

/**
 * Win represent the attribute wich make the player win the game
 */
public class Win implements Attribute{
	
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

		return true;
	}
	
	
	@Override
	public String toString() {
		return "Win";
	}

	@Override
	public String toTextFormat () {
		return "WIN";
	}
	
}
