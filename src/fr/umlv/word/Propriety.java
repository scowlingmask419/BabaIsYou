package fr.umlv.word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.umlv.ControlGame.Items;
import fr.umlv.attribute.Attribute;
import fr.umlv.drawer.Drawer;



/**
 * Class represent the word at down or the right
 */
public class Propriety extends Items implements Word {
	Category category;
	String word;
	private static ArrayList<String> propreties = new ArrayList<>(List.of("You", "Win", "Stop", "Push", "Melt", "Hot", "Defeat", "Sink"));
	
	
	
	/**
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 * @param name drawer of the word
	 * @param prop proporiety of the word
	 * @param word the word writen in the item
	 */
	
	public Propriety(int x, int y, Drawer name, Attribute prop, String word) {
		super(x, y, name, prop);
		
		Objects.requireNonNull(word);
		
		if (propreties.contains(word)) {
			this.category = Category.ATTRIBUTE;
		}
		
		else {
			throw new IllegalArgumentException("Argument word must be a propriety");
		}
		
		this.word = word;
	}
	
	@Override
	public Category getCategory () {
		return category;
	}
	
	/**
	 * @return the word correspond
	 */
	public String getWord() {
		return word;
	}
	
	@Override
	public boolean isAdjacentTo (Items item) {
		Objects.requireNonNull(item);
		
		/* If the item is at the left of the Propriety */
		if (((this.getX() - distance) == item.getX()) && (this.getY() == item.getY())) {
			return true;
		}
		
		/* If the item is at the top of the Propriety */
		if ((this.getX() == item.getX()) && ((this.getY() - distance) == item.getY()) ) {
			return true;
		}
		
		return false;
	}
}
