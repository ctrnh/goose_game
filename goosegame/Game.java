package goosegame;

import java.util.*;

/** Class for a game */
public class Game {
	
	/** List of the players in the game */
	private List<Player> thePlayers;
	
	/** Board */
	private Board board;
	
	
	
	/**
	 * Constructor
	 * @param bo the board we want to use for the game
	 */
	public Game (Board bo){
		this.board=bo;
		this.thePlayers=new ArrayList();
	}
	
	
	
	
	/**
	 * Add a player to the game.
	 * @param p : player to add
	 */
	public void addPlayer(Player p) {
		this.thePlayers.add(p);
	}
	

	/**
	 * Play one game of goose Game, with the board this.board.
	 * 
	 * Put all the players in the StartCell.
	 * While the game continues
	 * 		If the current player is allowed to move, the player plays, and finally arrives at destCell
	 * 			If destCell is already busy, we exchange the cells with the player on destCell.
	 * 
	 * The game ends when all the players except one have won, or if all players are trapped, or 
	 * if all the players are whether in a trapCell or in the last Cell
	 * 
	 */
	public void play() {
		this.board.initBoard(); 
		
		
		final int LAST_CELL = this.board.getNbOfCells()-1; 
		final int NB_PLAYERS = this.thePlayers.size();
		
		for (Player p: this.thePlayers) {
			this.board.getCell(0).welcomePlayer(p);
			System.out.print(p+ " is in " +p.getCell() +". ");
		}
		System.out.println("Let's play! \n");
		
		List<Player> winners = new LinkedList();
	
		int nbWinners= 0; 
		int nbTrapped = 0; 
		
		int indexCurrentPlayer = 0; 
		Player currentPlayer = this.thePlayers.get(indexCurrentPlayer);
		
		
		
		boolean flag = true;
		while (flag == true) {
			Cell currentCell = currentPlayer.getCell(); 
			
			
			if ((currentCell.canBeLeft()) && (currentCell.getIndex()!=LAST_CELL)) {// Player allowed to move?
				currentCell.emptiesCell();
				int score = currentPlayer.twoDiceThrow(); 
				System.out.print(currentPlayer.toString()+" who was in n°"+ currentCell.getIndex() + ", throws " + score +", ");
				
				int temp = currentPlayer.getCell().getIndex() + score; 
				
				int dest = temp;
				if (dest>LAST_CELL) {
					System.out.print("and should arrive in cell n°"+dest+" > 63. ");
					dest = LAST_CELL-(temp-LAST_CELL);
					}
				
				else if (dest==LAST_CELL) {
					System.out.print(currentPlayer.toString() + " has won! ");
					winners.add(currentPlayer);
				}
				else {
					System.out.print("and arrives in "+this.board.getCell(dest) +". ");
					dest = this.board.getCell(dest).handleMove(score); 
				}

				
				
				Cell destCell = this.board.getCell(dest); 
				
				if ((destCell.isBusy()) && (destCell.getIndex()!=LAST_CELL) ) {// destCell busy?
					System.out.print("There was " + destCell.getPlayer() + " in n°" + destCell.getIndex());
					System.out.print(" so s/he is sent to " + currentCell.getIndex()+". ");
					currentCell.welcomePlayer(destCell.getPlayer()); 
					
					
				}

				
				destCell.welcomePlayer(currentPlayer);
				System.out.println( currentPlayer.toString()+ " is now in "+ destCell + ". " );
				
		
				
				if ((destCell instanceof TrapCell) && !currentCell.isBusy() ) {
					nbTrapped++;// Increment  number of trapped players
				}
				
			}
			
			
			indexCurrentPlayer = (indexCurrentPlayer +1)%NB_PLAYERS;
			currentPlayer = this.thePlayers.get(indexCurrentPlayer);
			
			
			nbWinners = winners.size();
			
			if ( (nbWinners == (NB_PLAYERS-1)) || (nbTrapped == (NB_PLAYERS) || (nbWinners+nbTrapped == NB_PLAYERS)) ) {
				flag = false;
			}
			
			
		}
		
		System.out.println("The winners are:");
			for (Player p:winners) {
				System.out.print(p+"  ");
			}
		System.out.println("\n"+ "The loosers are :");
		for (Player p:this.thePlayers) {
			if (!winners.contains(p)) {
				System.out.print(p+ " who is in "+ p.getCell() + ". ");
			}
		}
		
		
	}
	
	
	
}
