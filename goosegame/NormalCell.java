package goosegame;
/** A normal cell*/
public class NormalCell implements Cell{
	protected int index;
	protected Player player;
	
	
	/**
	 * Constructor
	 * @param i index of the cell
	 */
	public NormalCell(int i) {
		this.index = i;
	}
	
	
	
	/**
	 * Getter
	 * @return the index of the cell
	 */
	public int getIndex() {
		return this.index;
	}
	
	
	
	
	/** gets the player in this cell <tt>null</tt> if none */
	public Player getPlayer() {
		return this.player;
	}
	
	

	/**
	 * @return <tt>true</tt> iff there is a player 
	 */
	public boolean isBusy() {
		return(this.player!=null);
	}
	
	/**
	 * @return true iff the cell can be left , by default, a normal cell can be left
	 */
	public boolean canBeLeft() {
		return true;
	}
	
	

	 /**  handles what happens when a player arrives in this cell 
    * @param player the new player in the cell
    */
	public void welcomePlayer(Player newPlayer) {
		this.player= newPlayer;
		newPlayer.setCell(this);
	}
	

	
	/**
	 * @return the arrival cell. 
	 * For a normal cell the player stays in this cell
	 */
	public int handleMove(int score) {
		return (this.getIndex());
	}
	
	/**
	 * Empties the cell, whenever the player leaves.
	 */
	public void emptiesCell() {
		this.player=null;
	}
	
	public String toString() {
		return("NormalCell("+this.getIndex() +")");
	}
}
