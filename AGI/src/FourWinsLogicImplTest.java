import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FourWinsLogicImplTest {
	FourWinsLogicImpl game;

	@Before
	public void setUp() {
		game = new FourWinsLogicImpl();
	}


	
	@Test
	public void testIfGameContinues() {
		assertEquals(Result.continues, game.throwChip(Chip.blue, 3));
	
	}

	@Test
	public void testIfGameIsWon() {
		assertEquals(Result.continues, game.throwChip(Chip.red, 2));
		assertEquals(Result.continues, game.throwChip(Chip.red, 2));
		assertEquals(Result.continues, game.throwChip(Chip.red, 2));
		assertEquals(Result.won, game.throwChip(Chip.red, 2));
	}

	@Test
	public void testIfGameIsTied() {
		game.throwChip(Chip.blue, 0);
		game.throwChip(Chip.blue, 0);
		game.throwChip(Chip.red, 0);
		game.throwChip(Chip.red, 0);
		game.throwChip(Chip.blue, 0);
		game.throwChip(Chip.blue, 0);
		
		game.throwChip(Chip.red, 1);
		game.throwChip(Chip.red, 1);
		game.throwChip(Chip.blue, 1);
		game.throwChip(Chip.blue, 1);
		game.throwChip(Chip.red, 1);
		game.throwChip(Chip.red, 1);
		
		game.throwChip(Chip.blue, 2);
		game.throwChip(Chip.blue, 2);
		game.throwChip(Chip.red, 2);
		game.throwChip(Chip.red, 2);
		game.throwChip(Chip.blue, 2);
		game.throwChip(Chip.blue, 2);
		
		game.throwChip(Chip.red, 3);
		game.throwChip(Chip.red, 3);
		game.throwChip(Chip.blue, 3);
		game.throwChip(Chip.blue, 3);
		game.throwChip(Chip.red, 3);
		game.throwChip(Chip.red, 3);
		
		game.throwChip(Chip.blue, 4);
		game.throwChip(Chip.blue, 4);
		game.throwChip(Chip.red, 4);
		game.throwChip(Chip.red, 4);
		game.throwChip(Chip.blue, 4);
		game.throwChip(Chip.blue, 4);
		
		game.throwChip(Chip.red, 5);
		game.throwChip(Chip.red, 5);
		game.throwChip(Chip.blue, 5);
		game.throwChip(Chip.blue, 5);
		game.throwChip(Chip.red, 5);
		game.throwChip(Chip.red, 5);
		
		game.throwChip(Chip.blue, 6);
		game.throwChip(Chip.blue, 6);
		game.throwChip(Chip.red, 6);
		game.throwChip(Chip.red, 6);
		game.throwChip(Chip.blue, 6);
		//game.throwChip(Chip.blue, 6);
		
		assertEquals(Result.tied, game.throwChip(Chip.blue, 6));
		
	}

}
