package fr.umlv.attribute;

import java.util.ArrayList;

import fr.umlv.ControlGame.Items;
import fr.umlv.ControlGame.Updates;
import fr.umlv.zen5.KeyboardKey;


/**
 * Attribute wich push the icons behind and the others
 */
public class Push implements Attribute {
	
	
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

		
		Updates u = new Updates();
		Items next = this.direction(touch, x, y, distance);
		
		if (listIcons.contains(next) == true) {
			next = u.find(next.getX(), next.getY(), listIcons);
			
			if(next.getAttribute()
					.react(next.getX(), next.getY(), distance, touch, listIcons) == false)
				return false;
		}
		
		
		
		Items pushable = new Items(x, y);
		if(listIcons.contains(pushable)) {
			pushable = u.find(x, y, listIcons);
			u.move(pushable, touch);
		
		}
		return true;
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
		return "Push";
	}

	@Override
	public String toTextFormat () {
		return "PUSH";
	}

}
