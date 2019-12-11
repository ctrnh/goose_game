package goosegame;
/** Starting cell*/
public class StartCell implements Cell{
	public final static int START_INDEX = 0; // index of the start cell
	
	private int index;
	public Player[] listPlayers;
	
	
	/**
	 * Constructor
	 */
	public StartCell() {
		this.index = START_INDEX;
	}
	
	
	/**
	 * Getter
	 * @return the index of the cell
	 */
	public int getIndex() {
		return this.index;
	}
	
	
	/**
	 * @return <tt>true</tt> because the starting cell can always be left
	 */
	public boolean canBeLeft() {
		return true;
	}
	
	/**
	 * @return <tt>false</tt> because it is never busy
	 */
	public boolean isBusy() {
		return false;
	}
	
	
	 /**  handles what happens when a player arrives in this cell 
	  * There is no need to keep track of who is on the StartCell, we only set the cell to the player
	    * @param p the new player in the cell
	    */
	public void welcomePlayer(Player p) {
		p.setCell(this);
	}
	
	/** gets the player in this cell <tt>null</tt> if none */
	public Player getPlayer() {return null;}
	
	
	/**
	 * @param score : the result of the dice thrown
	 * @return index : the index of the cell because the start cell does not do anything special
	 */
	public int handleMove(int score) {
		return (this.getIndex());
	}
	
	/**
	 * Empties the cell, whenever the player leaves.
	 */
	public void emptiesCell() {	};
	
	public String toString() {
		return "StartCell(0)";
	}
	
}
