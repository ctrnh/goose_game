package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class GooseCellTest {

	@Test
	public void test() {
		Cell startCell = new StartCell();
		
		/**
		 * Test with 2 goose cells, in index 5 and 13
		 */
		int indexCell1 = 5;
		int indexCell2 = 13;
		GooseCell goose1 = new GooseCell(indexCell1);
		GooseCell goose2 = new GooseCell(indexCell2);
		
		assert(goose1.canBeLeft()==true);
		assert(goose1.isBusy()==false);
		assert(goose1.getPlayer()==null);
		
		/**
		 * Pauline has thrown a 5 with the dice.
		 * She arrives in a goose Cell. She should thus jump to Cell number 10.
		 */
		int score = 5;
		assert(goose1.handleMove(score)==10);

		
		/**
		 * She then throws a 3 it is again, a gooseCell (index = 13)!
		 * She should jump to cell number 16. 
		 */
		score = 3;
		assert(goose2.handleMove(score)==16);
			
	}

}
