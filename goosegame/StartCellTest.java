package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class StartCellTest {

	@Test
	public void test() {
		StartCell startCell = new StartCell();
		Player Pauline = new Player ("Pauline");
		
		
		assert(startCell.getIndex()==0);
		assert(startCell.canBeLeft()==true);
		assert(startCell.isBusy()==false);
		assert(startCell.handleMove(5)==0);
		
		startCell.welcomePlayer(Pauline);
		assert(startCell.isBusy()==false); //never busy
		assert(Pauline.getCell()==startCell);
	}

}
