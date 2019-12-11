package goosegame;

public class WaitCell extends NormalCell {
	private final int TIME_TO_WAIT;
	private int timer;
	
	/**
	 * @param i index of the cell
	 * @param ttw time to wait
	 */
	public WaitCell(int i, int ttw) {
		super(i);
		this.TIME_TO_WAIT = ttw;
	}


	/**
	 * @param newPlayer : the new Player arriving
	 * Re-initializes the timer to TIME_TO_WAIT 
	 * When the timer is equal to 0, it means that the player has waited enough.
	 */
	public void welcomePlayer(Player newPlayer) {
		super.welcomePlayer(newPlayer);
		this.timer = this.TIME_TO_WAIT;		
	}
	
	
	/**
	 * @return true iff the player has waited for long enough (timer==0)
	 * If the timer  is not equal to 0 yet, then we decrement the timer of 1.
	 */
	public boolean canBeLeft() {
		if (this.timer ==0) {return true;} 
		else {
			this.timer--;
			return false;}
	}
	
	/** @return a description of the cell */
	public String toString() {
		return "WaitCell("+ this.getIndex()+ "), time to wait:" + TIME_TO_WAIT ;
	}
}
