package fr.umlv.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import fr.umlv.ControlGame.Items;


/**
 * SaveLevel is responsable for writing the level situation in a file
 */
public class SaveLevel {
	
	
	/**
 	 * @param items contains list of the elements
	 * @param writer contains the buffer for writing
	 * @throws signal error in items or writer
	 */
	public static void saveLevel (List<Items> items, BufferedWriter writer) throws IOException {
		Objects.requireNonNull(items);
		Objects.requireNonNull(writer);
		
		for (var item : items) {
			writer.write(item.toTextFormat());
			writer.newLine();
		}
		
	}
	
}
