package fr.umlv.file;

import java.io.BufferedReader;

import java.util.List;
import java.util.stream.Collectors;

import fr.umlv.ControlGame.Items;
import fr.umlv.attribute.*;
import fr.umlv.drawer.image.*;
import fr.umlv.drawer.word.name.BabaWord;
import fr.umlv.drawer.word.name.FlagWord;
import fr.umlv.drawer.word.name.RockWord;
import fr.umlv.drawer.word.name.SkullWord;
import fr.umlv.drawer.word.name.WallWord;
import fr.umlv.drawer.word.name.WaterWord;
import fr.umlv.drawer.word.operation.IsWord;
import fr.umlv.drawer.word.propriety.DefeatWord;
import fr.umlv.drawer.word.propriety.PushWord;
import fr.umlv.drawer.word.propriety.SinkWord;
import fr.umlv.drawer.word.propriety.StopWord;
import fr.umlv.drawer.word.propriety.WinWord;
import fr.umlv.drawer.word.propriety.YouWord;
import fr.umlv.word.Name;
import fr.umlv.word.Operation;
import fr.umlv.word.Propriety;


/**
 * LoadLevel is responsable for reading the level in file
 */
public class LoadLevel {
	private static final String FIELD_SEPARATOR = " ";
	
	
	/**
	 * @param attribute represent the propriety read in the file
	 * @return the attribute correspond to the word read
	 */
	public static Attribute instantAttribute (String attribute) {
		return switch (attribute) {
					case "DEFEAT" -> new Defeat();
					case "NOTHING" -> new Nothing();
					case "PUSH" -> new Push();
					case "SINK" -> new Sink();
					case "STOP" -> new Stop();
					case "WIN" -> new Win();
					case "YOU" -> new You();
					default -> throw new IllegalStateException("Unknown attribute " + attribute);
		};
	}
	
	

	/**
	 * @param line represent the line read in the file
	 * @return the Items correspond to the word read with his paramaters
	 */	
	public static Items parseLine (String line) {
	
		/* We suppose that the file has been written based on format : [CORDINATE_X] [CORDINATE_Y] [DRAWER] [ATTRIBUTE]	*/
		var tokens = line.split(FIELD_SEPARATOR);
		var cordX = Integer.parseInt(tokens[0]);
		var cordY = Integer.parseInt(tokens[1]);
		var drawer = tokens[2];
		var attribute = tokens[3];
		return switch (drawer) {
			case "FLAG" -> new Items(cordX, cordY, new Flag(), instantAttribute(attribute));
			case "BABA" -> new Items(cordX, cordY, new Baba(), instantAttribute(attribute));
			case "ROCK" -> new Items(cordX, cordY, new Rock(), instantAttribute(attribute));
			case "EMPTY" -> new Items(cordX, cordY, new Empty(), instantAttribute(attribute));
			case "WALL" -> new Items(cordX, cordY, new Wall(), instantAttribute(attribute));
			case "WATER" -> new Items(cordX, cordY, new Water(), instantAttribute(attribute));
			case "SKULL" -> new Items(cordX, cordY, new Skull(), instantAttribute(attribute));

			/* Only attributes words are pushable items */
			case "ISW" -> new Operation(cordX, cordY, new IsWord(), instantAttribute(attribute), "Is");
			
			case "FLAGW" -> new Name(cordX, cordY, new FlagWord(), instantAttribute(attribute), "Flag");
			
			case "BABAW" -> new Name(cordX, cordY, new BabaWord(), instantAttribute(attribute), "Baba");
			case "ROCKW" -> new Name(cordX, cordY, new RockWord(), instantAttribute(attribute), "Rock");
			case "WALLW" -> new Name(cordX, cordY, new WallWord(), instantAttribute(attribute), "Wall");
			case "WATERW" -> new Name(cordX, cordY, new WaterWord(), instantAttribute(attribute), "Water");
			case "SKULLW" -> new Name(cordX, cordY, new SkullWord(), instantAttribute(attribute), "Skull");

			
			case "PUSHW" -> new Propriety(cordX, cordY, new PushWord(), instantAttribute(attribute), "Push");
			case "STOPW" -> new Propriety(cordX, cordY, new StopWord(), instantAttribute(attribute), "Stop");
			case "YOUW" -> new Propriety(cordX, cordY, new YouWord(), instantAttribute(attribute), "You");
			case "WINW" -> new Propriety(cordX, cordY, new WinWord(), instantAttribute(attribute), "Win");
			case "SINKW" -> new Propriety(cordX, cordY, new SinkWord(), instantAttribute(attribute), "Sink");
			case "DEFEATW" -> new Propriety(cordX, cordY, new DefeatWord(), instantAttribute(attribute), "Defeat");

			
			
			default -> throw new IllegalStateException("Unknown drawer " + drawer);
		};
	}
	
	
	/**
	 * @param reader contains the buffer wich read the file
	 * @return the list of element with his paramaters
	 */
	public static List<Items> readFromFile (BufferedReader reader) {
		return reader.lines()
					 .map(line -> parseLine(line))
					 .collect(Collectors.toList());
	}
	
		
}
