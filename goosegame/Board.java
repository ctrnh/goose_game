package goosegame;
/** An abstract class for the boards */
public abstract class Board {
	protected int nbOfCells;
	protected Cell[] theCells;
	
	
	/**
	 * Constructor
	 * @param nbOfCells total number of cells in the board
	 */
	public Board(int nbOfCells) {
		this.nbOfCells = nbOfCells; 
		this.theCells = new Cell[nbOfCells];
		this.initBoard();
	}
	
	/**
	 * Abstract method, initializing the board
	 */
	protected abstract void initBoard();
	
	
	/**
	 * @param numCell : index of the Cell we want to get
	 * @return the Cell wanted
	 */
	public Cell getCell(int numCell) {
		return (this.theCells[numCell]);
	}
	
	
	
	/**
	 * 
	 * @return number of cells of the board
	 */
	public int getNbOfCells() {
		return this.nbOfCells;
	}
	
	
	
	
}
