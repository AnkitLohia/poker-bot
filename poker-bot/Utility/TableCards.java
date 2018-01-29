package Utility;

public class TableCards {
	
	private Card[] flop;
	private Card turn;
	private Card River;
	
	
	
	
	public Card[] getFlop() {
		return flop;
	}
	
	
	public void setFlop(Card[] flop) {
		if(flop.length!=3) throw new IllegalArgumentException("Invalid number of flop cards!"); 
		this.flop = flop;
	}
	public Card getTurn() {
		return turn;
	}
	public void setTurn(Card turn) {
		this.turn = turn;
	}
	public Card getRiver() {
		return River;
	}
	public void setRiver(Card river) {
		River = river;
	}
	
	

}
