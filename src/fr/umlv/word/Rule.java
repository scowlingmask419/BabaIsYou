package fr.umlv.word;

import java.util.Objects;

import fr.umlv.ControlGame.Items;


/**
 * Class represent the rules of the level
 */
public class Rule {
	private Items name;
	private Items operation;
	private Items propriety;
	
	
	/**
	 * @param name2 the word at the left or at the top
	 * @param word the word "is" or other word
	 * @param prop the word at the right or down
	 */
	public Rule (Items name2, Items word, Items prop) {
		Objects.requireNonNull(name2);
		Objects.requireNonNull(word);
		Objects.requireNonNull(prop);

		if ((name2 instanceof Name)
		&& (word instanceof Operation)
		&& (prop instanceof Propriety))
			{
			this.name = name2;
			this.operation = word;
			this.propriety = prop;
			
		}
		
		else 
			throw new IllegalArgumentException("Error types of Word");
	}

	
	/**
	 * 
	 * @return the name
	 */
	public Items getName() {
		return name;
	}


	/**
	 * @return the operation
	 */
	public Items getOperation() {
		return operation;
	}

	
	/**
	 * 
	 * @return the propriety
	 */
	public Items getPropriety() {
		return propriety;
	}

	@Override
	public String toString() {
		return  name.getName() + " "+ operation.getName() + " "+ propriety.getName();
	}
	
	/*
	public void setName (Word word) {
		Objects.requireNonNull(word);
		
		if (word.getCategory() != Category.NAME) {
			throw new IllegalArgumentException("word.getCategory() != Category.NAME");
		}
		
		this.name = word;
	}

	public void setOperation (Word word) {
		Objects.requireNonNull(word);
		
		if (word.getCategory() != Category.OPERATION) {
			throw new IllegalArgumentException("word.getCategory() != Category.OPERATION");
		}
		
		this.operation = word;
	}
	
	public void setAttribute (Word word) {
		Objects.requireNonNull(word);
		
		if (word.getCategory() != Category.ATTRIBUTE) {
			throw new IllegalArgumentException("word.getCategory() != Category.ATTRIBUTE");
		}
		
		this.attribute = word;
	}
	*/
	
	

}
