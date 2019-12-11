package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrapCellTest {

	@Test
	public void test() {
		Player Pauline = new Player("Pauline");
		TrapCell trap = new TrapCell(5);
		assert(trap.isBusy()==false);
		assert(trap.canBeLeft()==false);
		
		trap.welcomePlayer(Pauline);
		assert(Pauline.getCell()==trap);
		assert(trap.isBusy()==true);
		assert(trap.canBeLeft()==false);

	}

}
