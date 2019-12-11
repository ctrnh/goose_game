package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeleportCellTest {

	@Test
	public void test() {	
		int indexCell = 5;
		int dest = 23;
		Cell telep = new TeleportCell(indexCell, dest);
		assert(telep.canBeLeft()==true);
		assert(telep.isBusy()==false);
		assert(telep.getPlayer()==null);
		
		/**
		 * If a player has thrown 2 for example, it should go to cell 23
		 */
		assert(telep.handleMove(2)==23); 
		
	}

}
