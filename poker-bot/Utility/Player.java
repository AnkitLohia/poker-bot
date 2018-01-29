package Utility;

public class Player {
	
	private String username;
	private Card[] cards;
	private Hand bestHandOnFlop;
	private Hand bestHandOnTurn;
	private Hand bestHandOnRiver;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	
	public Hand getBestHandOnFlop() {
		return bestHandOnFlop;
	}
	public void setBestHandOnFlop(Hand bestHandOnFlop) {
		this.bestHandOnFlop = bestHandOnFlop;
	}
	public Hand getBestHandOnTurn() {
		return bestHandOnTurn;
	}
	public void setBestHandOnTurn(Hand bestHandOnTurn) {
		this.bestHandOnTurn = bestHandOnTurn;
	}
	public Hand getBestHandOnRiver() {
		return bestHandOnRiver;
	}
	public void setBestHandOnRiver(Hand bestHandOnRiver) {
		this.bestHandOnRiver = bestHandOnRiver;
	}
	
	

}
