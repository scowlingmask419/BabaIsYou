package fr.umlv.word;

import fr.umlv.ControlGame.Items;


/**
 * interface wich resents all the items of type words
 */
public interface Word {
	
	/**
	 * distance of the adjacent
	 */
	static final int distance = 50;
	
	
	/**
	 * 
	 * @param item the item at right or left or other direction
	 * @return if it's adjacent
	 */
	boolean isAdjacentTo (Items item);
	
	
	/**
	 * 
	 * @return the category of the word (name, operation or proporeity)
	 */
	Category getCategory ();
}
