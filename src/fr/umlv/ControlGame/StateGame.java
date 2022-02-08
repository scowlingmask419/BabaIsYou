package fr.umlv.ControlGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import fr.umlv.attribute.Win;
import fr.umlv.attribute.You;


/**
 * State GAme verify if the GAme is finished
 *If You Win or if you Lost
 */
public class StateGame{
		
	
	/**
	 * initialise objects wich control the game
	 */
	public StateGame() {
				
	}

	
	/**
	 * @param graphics control graphics elements 
	 * @param list the list of the elements
	 * @return true if the the win element touched
	 */
	public boolean isWin(Graphics2D graphics, ArrayList<Items> list) {
		
		for(var you : list) {
			for(var win : list) {
				if(you.getAttribute() instanceof You
						&& win.getAttribute() instanceof Win
						&& you.equals(win)) {
					
					graphics.setColor(Color.black);
			        graphics.drawString("WIIIIIIIIIIIIIIIIIN", 500, 500);
			        
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	

	/**
	 * @param graphics control graphics elements 
	 * @param list contains the list of the elements
	 * @return true if the all elements with attribute "you" disaperead
	 */
	public boolean isDefeat(Graphics2D graphics, ArrayList<Items> list) {
		for(var you : list) {
			if(you.getAttribute() instanceof You 
					&& you.getX() >= 0)
				
				return false;
		}
		
		
		graphics.setColor(Color.black);
        graphics.drawString("DIIIIIIIIIIIIE", 500, 500);
        
		
		return true;
		
		
	}
	

}
