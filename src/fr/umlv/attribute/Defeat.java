package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.zen5.KeyboardKey;


/**
 * Attribute wich kill "you"
 */
public class Defeat implements Attribute {
	
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
		
		
		int oldX = x, oldY = y;
		switch (touch) {
        case UP :
        	oldY += distance;
        	break;
        case DOWN :
        	oldY -= distance;
        	break;
        case LEFT :
        	oldX += distance;
        	break;
        case RIGHT :
        	oldX -= distance;
        	break;
		default:
			break;
        }
		
		final int  X = oldX, Y = oldY;
		int i;
		
		for (i = 0; i < listIcons.size(); i++) {
			var l = listIcons.get(i);
			
			if ((l.getX() == X)&& (l.getY() == Y) && (l.getAttribute() instanceof You))
				l.setX(-100000000);
			
		}
		 
		 return true;
		 
	}
	
	
	@Override
	public String toString() {
		return "Defeat";
	}
	
	@Override
	public String toTextFormat () {
		return "DEFEAT";
	}
}
