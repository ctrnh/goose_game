package goosegame;
/** A goose cell */
public class GooseCell extends NormalCell{
	/**
	 * Constructor
	 * @param i : index of the cell
	 */
	public GooseCell(int i) {
		super(i);
	}
	
	
	/**
	 * @return the index of the new cell where the player will finally arrive.
	 * The GooseCell makes it move one more time the value of the score.
	 */
	public int handleMove(int score) {
		return (this.index + score);
	}
	
	/** @return a description of the cell */
	public String toString() {
		return ("GooseCell(" +this.getIndex() +")") ;
	}

}
