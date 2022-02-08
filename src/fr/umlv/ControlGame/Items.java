package fr.umlv.ControlGame;

import fr.umlv.attribute.Attribute;
import fr.umlv.drawer.Drawer;
import fr.umlv.drawer.image.Empty;



/**
 * Items represnents all Objects presents in the window
 * Its Fields are The drawer, which the role of the design
 * The attribute which the property of the item, pushable, or movable...
 * And the coordinates x and y
 */
public class Items {
	private int x;
	private int y;
	private final Drawer drawer;
	private Attribute attribute;
	
	/**
	 * @param x coordinate 
	 * @param y coordinate
	 * @param drawer draw the item
	 * @param prop propriety of the items
	 */
	public Items(int x, int y, Drawer drawer, Attribute prop) {
		this.x = x;
		this.y = y;
		this.drawer = drawer;
		this.attribute = prop;
	}
	
	/**
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 */
	public Items(int x, int y) {
		this.x = x;
		this.y = y;
		this.drawer = new Empty();
		this.attribute = null;
	}

	
	/**
	 * @param x an integer
	 * affect the integer in the X
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @param y an integer
	 * affect the integer in the y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @return the x coordinate
	 */
	public int getX() {
		return x;
	}


	/**
	 * @return the x coordinate
	 */
	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return drawer + " is " + attribute + " (" + x + ", " + y + ')';
	}


	/**
	 * @return the drawer
	 */
	public Drawer getName() {
		return drawer;
	}
	
	
	/**
	 * @return the attribute
	 */
	public Attribute getAttribute() {
		return attribute;
	}

	/**
	 * @param prop an Attribute
	 * affect the prop in the y
	 */
	public void setAttribute(Attribute prop) {
		this.attribute = prop;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		Items ic = (Items) obj;
		
		return this.getX() == ic.getX()
				&& this.getY() == ic.getY();
	}
	
	
	/**
	 * @return the text in specifc form
	 */
	public String toTextFormat() {
		return x + ", " + y + " " + this.drawer.toTextFormat() + " " + this.attribute.toTextFormat();
	}
	
	

}
