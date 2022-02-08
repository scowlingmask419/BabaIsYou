package fr.umlv.ControlGame;

import java.util.ArrayList;
import java.util.List;

import fr.umlv.attribute.Attribute;
import fr.umlv.attribute.Defeat;
import fr.umlv.attribute.Nothing;
import fr.umlv.attribute.Push;
import fr.umlv.attribute.Sink;
import fr.umlv.attribute.Stop;
import fr.umlv.attribute.Win;
import fr.umlv.attribute.You;
import fr.umlv.word.Name;
import fr.umlv.word.Operation;
import fr.umlv.word.Propriety;
import fr.umlv.word.Rule;
import fr.umlv.word.Word;



/**
 * Updates is responsible for all updates
 * The Rules with the Word, or the Icons
 */
public class Updates extends Plateau{
	 
	/**
	 * initialise the class
	 */
	public Updates() {
		super();
		
	}


	/**
	 * @param x first coordinate 
	 * @param y second coordinate
	 * @param list of the icons
	 * @return the element in the list wich have the x, y coordinates
	 */
	public Items find(int x, int y, ArrayList<Items> list) {
		
		for (var l : list) {
			
			if(l.getX() == x && l.getY() == y) {
				//System.out.println("****************" + l);
				return l;
			}
				
		}
		
		throw new NullPointerException("Doesn't exist");
			 	
			 	
	}
	
	/**
	 * @param basicList contains list of the element
	 * @return the list of element wich have propriety
	 */
	public ArrayList<Items> updateIcons(ArrayList<Items> basicList) {
		ArrayList<Items> listIcons = new ArrayList<>();
		
		for(Items icon : basicList) {
			if(icon.getAttribute().toString().equals("Nothing"))
				continue;
			listIcons.add(icon);
		}
		
		for (var word : basicList) {
			if(word instanceof Word)
				listIcons.add(word);
		}
		
		return listIcons;
	}
	
	
	/**
	 * @param name contains the word at the left of "is" 
	 * @param prop contains the word at the right of "is"
	 * @param word contains the "is"
	 * @param listWords contains the words
	 * @param listRules contains the rules
	 * add the rules if it respect the conditions of a rule
	 */
	public void ruleIsValid(Items name, Items prop, Items word,
			ArrayList<Items> listWords, ArrayList<Rule> listRules) {
		if(listWords.contains(name) && listWords.contains(prop)) {
			name = this.find(name.getX(), name.getY(), listWords);
			prop = this.find(prop.getX(), prop.getY(), listWords);
			
			if ((name instanceof Name)&&(prop instanceof Propriety))
				listRules.add(new Rule(name, word, prop));
			
		}
		
	}
	
	
	/**
	 * @param listWords contains the words
	 * @return a list contains the rules
	 * 	 */
	public ArrayList<Rule> updateRules(ArrayList<Items> listWords){
		ArrayList<Rule> listRules = new ArrayList<>();
				
		for (var word : listWords) {
			
			if(word instanceof Operation) {
				
				Items name = new Items(word.getX() - this.getDistance(), word.getY());
				Items prop = new Items(word.getX() + this.getDistance(), word.getY());

				Items name2 = new Items(word.getX(), word.getY() - this.getDistance());
				Items prop2 = new Items(word.getX(), word.getY() + this.getDistance());
				
				this.ruleIsValid(name, prop, word, listWords, listRules);
				this.ruleIsValid(name2, prop2, word, listWords, listRules);
					
			}

		}
		
		System.out.println("rulesssssssssssssssssz : " + listRules);
		
		return listRules;
	}
	
	/**
	 *  @param basicList contains list of the element
	 *  @param listRules contains the rules
	 *  apply the rules on all icons
	 **/
	public void applyRule(ArrayList<Items> basicList,
			ArrayList<Rule> listRules) {
		
		ArrayList<Attribute> listAttributes = new ArrayList<>(List.of(new Push(), new Sink(), new You(), new Stop(), new Win(), new Defeat()));
		

			for (Items icon : basicList) {
				if (icon instanceof Word)
					continue;
				
				boolean is_noth = true;
				
				for (Rule rule : listRules) {
					
				
					if (((Name) rule.getName()).getWord().equals(icon.getName().toString())){
						//System.out.println("valid ??   " + ((Name) rule.getName()).getWord() + "//" + icon.getName().toString());
						
						for (Attribute att : listAttributes) {
							
							
							if(((Propriety)rule.getPropriety()).getWord().equals(att.toString())) {
								
								System.out.println("new rule : " + rule);
								System.out.println("att : " + att);
								System.out.println("icon : " + icon);
								icon.setAttribute(att);
								is_noth = false;
								System.out.println("icon : " + icon);
								
							}
							
						}
						
						
					}
			
				
				}
				if (is_noth)
					icon.setAttribute(new Nothing());
					
				
				
				
				
				
				
			
						
		}
		
		
		
	}
	
	
}
