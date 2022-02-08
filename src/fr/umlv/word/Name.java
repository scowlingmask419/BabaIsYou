package fr.umlv.word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.umlv.ControlGame.Items;
import fr.umlv.attribute.Attribute;
import fr.umlv.drawer.Drawer;



/**
 * Class represent the word at the top or the left
 */
public final class Name extends Items implements Word {
	private Category category;
	private String word;
	
	private static ArrayList<String> names = 
			new ArrayList<>(List.of("Baba", "Flag", "Wall", "Water",
										"Skull", "Lava", "Rock"));	
	
	
	/**
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 * @param name drawer of the word
	 * @param prop proporiety of the word
	 * @param word the word writen in the item
	 */
	public Name(int x, int y, Drawer name, Attribute prop, String word) {
		super(x, y, name, prop);
		
		Objects.requireNonNull(word);
		
		if (names.contains(word)) {
			this.category = Category.NAME;
		}
		
		else {
			throw new IllegalArgumentException("Argument word must be a name");
		}
		
		this.word = word;
	}
	
	@Override
	public Category getCategory () {
		return category;
	}
	
	/**
	 * 
	 * @return the word correspond
	 */
	public String getWord() {
		return word;
	}
	
	@Override
	public boolean isAdjacentTo (Items item) {
		Objects.requireNonNull(item);
		
		/* If the item is at the right of the Name. */
		if (((this.getX() + distance) == item.getX()) && (this.getY() == item.getY())) {
			return true;
		}
		
		/* If the item is at the bottom of the Name. */
		if ((this.getX() == item.getX()) && (this.getY() + distance) == item.getY()) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
