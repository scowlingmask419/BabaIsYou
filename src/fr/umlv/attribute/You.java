package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.zen5.KeyboardKey;

/**
 * You is the class wich permit object to move with the arrows
 */
public class You implements Attribute {
	
	/**
	 * @param x the first coordinates
	 * @param y the second coordinates
	 * @param touch receive the touch pressed
	 * @param listIcons receive the list of the Icons
	 * 0return a boolean which inform if the object can move 
	 */
	public boolean react(int x, int y, int distance, KeyboardKey touch, ArrayList<Items> listIcons) {

		Items next = this.direction(touch, x, y, distance);
		int newX = next.getX();
		int newY = next.getY();
		
		final int  X = newX, Y = newY;
		
		if (listIcons.contains(next) == false)
			return true;
		else { 	
			 var h = listIcons.stream()
			 	.filter(e -> (e.getX() == X) && (e.getY() == Y) )
			 	.findAny();
			 
			 return h.get().getAttribute().react(newX, newY, distance, touch, listIcons);
			 
		}
	}
	
	
	/**
	 * 
	 * @param touch contains the touch pressed
	 * @param newX contains the new X coordinate
	 * @param newY contains the new Y coordinate
	 * @param distance distance of movement
	 * @return the item corespond to the parameters
	 */
	public Items direction (KeyboardKey touch, int newX, int newY, int distance) {
		switch (touch) {
		case UP :
			newY -= distance;
			break;
		case DOWN :
			newY += distance;
			break;
		case LEFT :
			newX -= distance;
			break;
		case RIGHT :
			newX += distance;
			break;
		default :
			System.out.println("rien");
			break;
		}
		
		return new Items(newX, newY);
	
	}
	

	
	@Override
	public String toString() {
		return "You";
	}
	
	@Override
	public String toTextFormat () {
		return "YOU";
	}
}
