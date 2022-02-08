package fr.umlv.main;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import fr.umlv.ControlGame.Initialisations;
import fr.umlv.ControlGame.Items;
import fr.umlv.ControlGame.Plateau;
import fr.umlv.ControlGame.StateGame;
import fr.umlv.ControlGame.Updates;
import fr.umlv.attribute.You;
import fr.umlv.drawer.image.Baba;
import fr.umlv.file.*;
import fr.umlv.word.Rule;
import fr.umlv.word.Word;
import fr.umlv.zen5.Application;

import fr.umlv.zen5.Event;
import fr.umlv.zen5.KeyboardKey;
import fr.umlv.zen5.ScreenInfo;
import fr.umlv.zen5.Event.Action;


/**
 * Main class
 */
public class Main {
	
	
	/**
	 * 
	 * @param args arguments enter in the terminal
	 */
	public static void main(String[] args) {
		
		ArrayList<Items> items = new ArrayList<>();
		var levels = List.of("levels/level1.txt",
							 "levels/level2.txt",
				             "levels/level3.txt",
				             "levels/level4.txt",
				             "levels/level5.txt");
		for (var level : levels) {
			var filePath = Path.of(level);
			 
			try (var reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
		    	items = (ArrayList<Items>) LoadLevel.readFromFile(reader);
		    	System.out.println(items);
			} catch (IOException e) {
				System.err.println(e.getMessage() + " n'est pas l�");
				System.exit(1);
			}
			
			System.out.println("items :" + items);
			
			//INITIALISATIONS
			
			Plateau p = new Plateau();
			StateGame stateGame = new StateGame();
			
			Initialisations init = new Initialisations();	
			Updates updates = new Updates();	
			ArrayList<Items> basicList = init.initBasicList(items);
			
			for(var l : items) {
				System.out.println(l.getName() + " instanceof Word =  " + (l instanceof Word));
				
			}
			//System.exit(1);	
			
			Color fond = Color.black;
			Application.run(fond, context -> {
			      
			      // get the size of the screen
			      ScreenInfo screenInfo = context.getScreenInfo();
			      float width = screenInfo.getWidth();
			      float height = screenInfo.getHeight();
			      System.out.println("size of the screen (" + width + " x " + height + ")");
			      
			      context.renderFrame(graphics -> {
			        graphics.setColor(fond);
			        graphics.fill(new  Rectangle2D.Float(0, 0, width, height));
			      });
			      
			    
			      //START
			      for(;;) {
			    	  System.out.println("#############################################");
		    		  ArrayList<Items> listWords =  init.initWordList(basicList);
		        	  ArrayList<Rule> listRules = updates.updateRules(listWords);
			    	  
		        	  updates.applyRule(basicList, listRules);
			    	  ArrayList<Items> listIcons = updates.updateIcons(basicList);
			    	  
			          Event event = context.pollOrWaitEvent(1);
			     
			          if (event == null) {  // no event
			            continue;
			             
			            
			          }
			          
			          
			          Action action = event.getAction();
			          
			          
			          //EVENT_TOUCH
			          if (action == Action.KEY_RELEASED)
			        	  continue;
			          
			           
			          
			          KeyboardKey touch = event.getKey();
			          if(touch == KeyboardKey.Q) {
			          	System.out.println(touch + "uit");
			          	context.exit(0);
			          	
			          }
			          else if (touch != KeyboardKey.UP 
			        		  && touch != KeyboardKey.DOWN 
			        		  && touch != KeyboardKey.LEFT 
			        		  && touch != KeyboardKey.RIGHT)
			        	  
			        	  continue;
			          
			          else {
				         for (Items l : listIcons) {
			                if (l.getAttribute() instanceof You) {
			                	boolean possible = l.getAttribute().
			                			react(l.getX(), l.getY(),
			                					p.getDistance(), touch, listIcons);
			          			
			                	if (possible)
			                		p.move(l, touch);	
			                	
			                 }
					   	 }
				         
				         			         
				         //DRAW
				         context.renderFrame(graphics -> {
			        		  
				        	 
			        		 p.draw_plateau(graphics, fond);
				      
				          	 for (Items l : basicList) {
				          		 l.getName().draw(graphics, fond, l.getX(), l.getY());
				          		
				          	 }
				          	
				          	 
				          	 
				          	 for (Items l : basicList) {
				          		if(l.getName() instanceof Baba)
				          			System.out.println(l.getName() + " iiss" + l.getAttribute() );
				          	 }
				          	 
				          	 
	
				        	 if(stateGame.isWin(graphics, listIcons)) {
			                		System.out.println("WIIIIIIIIIIIIN");
			                		
			                		//context.exit(0);
			                 }
			                	
			                	
		                	 if(stateGame.isDefeat(graphics, listIcons)) {
		                		System.out.println("LOOOOST");
		                		for (var l : listRules)
		                			System.out.println("rules final : " + l);
		                		for(var icons : listIcons)
		                			System.out.println("encore pr�sent : " + icons);
		                		
		                		for(var icons : basicList)
		                			System.out.println("TOUT : " + icons);
		                		
		                		
		                		context.exit(0);
		                	 }
				         
		                	 
				          	 
			        	  });
				         
				         
	          	 
			        } 
			         
			         
			      }  
			      
			      
			      
			      
			});
			
			
			
		}
	}
}
