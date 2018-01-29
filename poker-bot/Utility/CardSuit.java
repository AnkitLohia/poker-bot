package Utility;

public enum CardSuit {
	
	HEART('H'),
	DIAMOND('D'),
	CLUB('C'),
	SPADE('S');
	
	private char suit;
	
	CardSuit(char c){
		this.suit = c;
	}

	public char getSuit() {
		return suit;
	}
	
	public static CardSuit getSuitByChar(char c){
		for(CardSuit s : CardSuit.values()){
			if(s.getSuit()=='c') return s;
		}
		return null;
	}

}
