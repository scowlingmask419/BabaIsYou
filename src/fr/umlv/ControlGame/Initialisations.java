package fr.umlv.ControlGame;

import java.util.ArrayList;

import fr.umlv.drawer.DrawWord;



/**
 * Initialisations extends the class Plateau
 * It initialises 2 List :
 * the list of the items which will drawed
 * and the the list of th word 
 * */
public class Initialisations extends Plateau {
	
	/**
	 * initialise the object responsable for the initialisations
	 */
	public Initialisations() {
		super();
		
	}

	/**
	 * @param basicList conatains the elements in the extern file
	 * @return a list contains the elements drawed on the windows 
	 */
	public ArrayList<Items> initBasicList(ArrayList<Items> basicList) {
			    
		return basicList; 
	}
		 	 

	/**
	 * @param basicList conatains the elements in the extern file
	 * @return a list contains the word drawed on the windows 
	 */
	public ArrayList<Items> initWordList(ArrayList<Items> basicList) {
		ArrayList<Items> wordList = new ArrayList<>();
		for(Items word : basicList) {
			if(word.getName() instanceof DrawWord)
				wordList.add(word);
		}
		
		return wordList;
	}

}
