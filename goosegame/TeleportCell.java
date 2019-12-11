package goosegame;
/** Teleport Cell*/
public class TeleportCell extends NormalCell {
	private int dest;
	/**
	 * Constructor
	 * @param i : index of the cell
	 * @param d : index of the destination to which the teleport cell brings the player
	 */
	public TeleportCell(int i, int d) {
		super(i);
		this.dest =d;
	}
	
	
	
	/**
	 * Getter
	 * @return the destination of the teleport cell
	 */
	public int getDest() {
		return this.dest;
	}
	
	
	
	/**
	 * @return the index of the new cell where the player will finally arrive (teleported to dest)
	 */
	public int handleMove(int score) {
		return (this.dest);
	}
	
	/** @return a description of the cell */
	public String toString() {
		return "TeleportCell("+ this.getIndex()+ "), destination:" + dest ;
	}
	
	
}
