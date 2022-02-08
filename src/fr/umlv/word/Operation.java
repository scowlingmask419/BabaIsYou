package fr.umlv.word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.umlv.ControlGame.Items;
import fr.umlv.attribute.Attribute;
import fr.umlv.drawer.Drawer;


/**
 * Class repent he center word, or the verb in the rule
 */
public class Operation extends Items implements Word {
	Category category;
	
	private static ArrayList<String> operations = new ArrayList<>(List.of("Is"));
	
	
	/**
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 * @param name drawer of the word
	 * @param prop proporiety of the word
	 * @param word the word writen in the item
	 */
	public Operation(int x, int y, Drawer name, Attribute prop, String word) {
		super(x, y, name, prop);
		
		Objects.requireNonNull(word);
		
		if (operations.contains(word)) {
			this.category = Category.OPERATION;
		}
		
		else {
			throw new IllegalArgumentException("Argument word must be an operation");
		}
	}

	@Override
	public Category getCategory () {
		return category;
	}
	@Override
	public boolean isAdjacentTo (Items item) {
		Objects.requireNonNull(item);
		
		/* If the item is at the left of the Operation */
		if (((this.getX() - distance) == item.getX()) && (this.getY() == item.getY())) {
			return true;
		}
		
		/* If the item is at the top of the Operation */
		if ((this.getX() == item.getX()) && ((this.getY() - distance) == item.getY()) ) {
			return true;
		}
		
		/* If the item is at the bottom of the Operation */
		if ((this.getX() == item.getX()) && ((this.getY() + distance) == item.getY()) ) {
			return true;
		}
		
		/* If the item is at the right of the Operation */
		if ((this.getX() + distance == item.getX()) && (this.getY() == item.getY()) ) {
			return true;
		}
		
		return false;
	}
		
}
