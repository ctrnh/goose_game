package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassicalBoardTest {

	@Test
	public void test() {
		ClassicalBoard clboard = new ClassicalBoard();
		clboard.initBoard();
		assert(clboard.getNbOfCells()==64);
		assert(clboard.getCell(0) instanceof StartCell);
		
		assert(clboard.getCell(9)  instanceof GooseCell);
		assert(clboard.getCell(18)  instanceof GooseCell);
		assert(clboard.getCell(27)  instanceof GooseCell);
		assert(clboard.getCell(36)  instanceof GooseCell);
		assert(clboard.getCell(54)  instanceof GooseCell);
		
		assert(clboard.getCell(19)  instanceof WaitCell);
		
		assert(clboard.getCell(6) instanceof TeleportCell);
		assert(clboard.getCell(42) instanceof TeleportCell);
		assert(clboard.getCell(58) instanceof TeleportCell);
		
		assert(clboard.getCell(31) instanceof TrapCell);
		assert(clboard.getCell(52) instanceof TrapCell);
		
	}

}
