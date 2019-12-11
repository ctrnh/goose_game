package goosegame;

import static org.junit.Assert.*;

import org.junit.Test;

public class NormalCellTest {

	@Test
	public void test() {
		NormalCell normalCell = new NormalCell(5);
		StartCell start = new StartCell();
		Player Pauline = new Player("Pauline",start);
		assert(Pauline.getCell()==start);
		
		assert(normalCell.getIndex()==5);
		assert(normalCell.isBusy()==false);
		normalCell.welcomePlayer(Pauline);
		assert(normalCell.getPlayer()==Pauline);
		assert(Pauline.getCell()==normalCell);
		
	}

}
