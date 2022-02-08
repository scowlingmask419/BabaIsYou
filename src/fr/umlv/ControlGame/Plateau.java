package fr.umlv.ControlGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.stream.Collectors;

import fr.umlv.attribute.You;
import fr.umlv.drawer.image.Empty;
import fr.umlv.zen5.KeyboardKey;




/**
 * Plateau is responsable of drawing the background
 * The movements of the items
 * but also the distance of this movements
 */
public class Plateau {
	ArrayList<ArrayList<Items>> list_items;
	private final int taille = 20;
	 
	private final int getDistance = 50;
	
	/**
	 * Initialisation of the list wich draw the background
	 */
	public Plateau() {
	    
		ArrayList<ArrayList<Items>> list =  new ArrayList<ArrayList<Items>>() ;

		int i, j;
		for(i = 0; i < taille; i++){
			ArrayList<Items> li = new ArrayList<Items>() ;
			for(j = 0; j < taille; j++){
				li.add(new Items(i*100, j*100, new Empty(), new You()));
			}
			list.add(li);
		}

		
		this.list_items = list;
	}
	
	
	@Override
	public String toString() {		
		
		return list_items.stream()
				.map(e -> e + "\n")
				.collect(Collectors.joining());
	}
	
	
	
	/**
	 * @param graphics is reponsable of grapics elements
	 * @param fond contains the color of the background
 	 * draw an the white background of the game
	 */
	public void draw_plateau(Graphics2D graphics, Color fond) {
		int i, j;
		for(i = 0; i < list_items.size(); i++) {
			ArrayList<Items> it = list_items.get(i);
			for(j = 0; j < it.size(); j++) {
				Items ic = (Items) it.get(j);
				
				ic.getName().draw(graphics, fond, ic.getX(), ic.getY());
			}
		}
		
	}
	
	/**
	 * @return the distance
	 */
	public int getDistance() {
		return getDistance;
	}

	/**
	 * @param it contains the item
	 * @param touch contains the touch pressed
	 * moves the items in the window
	 */
	public void move(Items it, KeyboardKey touch) {
	     int distance = this.getDistance();	
		 
		 switch (touch) {
	        case UP :
	        	it.setY(it.getY() - distance);
	        	break;
	        case DOWN :
	        	it.setY(it.getY() + distance);
	        	break;
	        case LEFT :
	        	it.setX(it.getX() - distance);
	        	break;
	        case RIGHT :
	        	it.setX(it.getX() +  distance);
	        	break;
	        default :
	        	System.out.println("rien");
	        	break;
	        }
	    
	}
		
}
