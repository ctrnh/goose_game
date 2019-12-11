package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaitCellTest {

	@Test
	public void test() {
		
		/** 
		 * Test with a Wait cell of 3 rounds to wait
		 */
		int timeToWait = 3;
		int indexCell = 5;
		Cell StartCell = new StartCell();
		
		WaitCell wait = new WaitCell(indexCell,timeToWait);
		Player Pauline = new Player("Pauline",StartCell);
		
		wait.welcomePlayer(Pauline);
		assert(wait.isBusy()==true);
		
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==true);
		
		wait.emptiesCell();
		assert(wait.isBusy()==false);
		
		
		
		/**
		 * Test with a Wait cell of 0 rounds to wait : the player should be able to leave the cell right away
		 */
		timeToWait = 0;
		indexCell = 5;
		
		wait = new WaitCell(indexCell,timeToWait);
		Player Alexandre = new Player("Alexandre",StartCell);
		
		wait.welcomePlayer(Alexandre);
		
		assert(wait.canBeLeft()==true);
		
		
		/**
		 * Wait cell with 3 rounds to wait
		 * Test when Pauline comes to the WaitCell, then after 2 rounds, Alexandre comes to the waitCell
		 */
		Pauline.setCell(StartCell);
		Alexandre.setCell(StartCell);
		timeToWait = 3;
		indexCell = 5;
		wait = new WaitCell(indexCell,timeToWait);
		
		wait.welcomePlayer(Pauline);// Pauline arrives at the WaitCell
		assert(wait.getPlayer()==Pauline);
		assert(Pauline.getCell()==wait);
		//She can't move for 3 rounds
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==false);
		
		// Alexandre arrives at the WaitCell. He takes her cell and she is sent back to StartCell and
		// he can't move for 3 rounds
		wait.welcomePlayer(Alexandre);
		assert(wait.getPlayer()==Alexandre);
		assert(Alexandre.getCell()==wait);
		
		StartCell.welcomePlayer(Pauline);
		assert(Pauline.getCell()==StartCell);
		
		
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==false);
		assert(wait.canBeLeft()==true);
		
		
		
		
		
		
	}

}
