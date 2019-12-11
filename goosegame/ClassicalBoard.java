package goosegame;
/** The classical board of goose game*/
public class ClassicalBoard extends Board{
	/**
	 * List of cells in a classical board
	 * We put them as final static as they are values which are set officially and will never be modified
	 */
	public final static int CL_NB_CELLS = 64; // Start cell included
	public final static int[] CL_GOOSE_CELLS = new int[] {9,18,27,36,45,54};
	public final static int[] CL_TRAP_CELLS = new int[] {31,52};
	
	public final static int[] CL_WAIT_CELLS = new int[] {19};
	public final static int[] CL_WAIT_CELLS_TIME = new int[] {2};
	
	public final static int[] CL_TELEP_CELLS = new int[] {6,42,58};
	public final static int[] CL_TELEP_CELLS_DEST = new int[] {12,30,1};

	
	/**
	 * ClassicalBoard constructor 
	 */
	public ClassicalBoard() {
		super(CL_NB_CELLS);
	}
	
	
	/**
	 * Initialize the board with the corresponding type of cells
	 */
	protected void initBoard (){
		
		for (int i=0;i< CL_NB_CELLS;i++) {
			this.theCells[i] = new NormalCell(i);
		}
		
		this.theCells [0] = new StartCell();
		
		for (int i=0;i< CL_GOOSE_CELLS.length;i++) {
			this.theCells[CL_GOOSE_CELLS[i]] = new GooseCell(CL_GOOSE_CELLS[i]);
			
		}
		
		for (int i=0;i< CL_TRAP_CELLS.length;i++) {
			this.theCells[CL_TRAP_CELLS[i]] = new TrapCell(CL_TRAP_CELLS[i]);
			
		}
		
		for (int i=0;i< CL_WAIT_CELLS.length;i++) {
			this.theCells[CL_WAIT_CELLS[i]] = new WaitCell(CL_WAIT_CELLS[i],CL_WAIT_CELLS_TIME[i]);
			
		}
		
		for (int i=0;i< CL_TELEP_CELLS.length;i++) {
			this.theCells[CL_TELEP_CELLS[i]] = new TeleportCell(CL_TELEP_CELLS[i],CL_TELEP_CELLS_DEST[i]);
			
		}
	}
	
	
	
	
	
}
