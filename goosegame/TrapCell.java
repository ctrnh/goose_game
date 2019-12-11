package goosegame;

public class TrapCell extends NormalCell{
	/**
	 * Constructor
	 * @param i : index of the cell
	 */
	public TrapCell(int i) {
		super(i);	
	}
	
	
	/**
	 * @return <tt>false</tt> because a trap cell can't be left
	 */
	public boolean canBeLeft() {
		return false;
	}
	
	/** @return a description of the cell */
	public String toString() {
		return "TrapCell("+ this.getIndex()+")";
	}
}
