package Utility;

public enum CardRank {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(1);
	
	private int value;
	
	CardRank(int val){
		this.value = val;
	}
	
	public int getValue() {
		return value;
	}

	public static CardRank getRankByInt(int val){
		for(CardRank r : CardRank.values()){
			if(r.getValue()==val) return r;
		}
		return null;
	}
	
}
