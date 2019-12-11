package goosegame;

public class main {

	public static void main(String[] args) {

		Game game = new Game(new ClassicalBoard());

		game.addPlayer(new Player("Michel"));
		game.addPlayer(new Player("George"));
		game.addPlayer(new Player("Hector"));
		game.addPlayer(new Player("Jeanne"));
		
		game.play();
	}

}
