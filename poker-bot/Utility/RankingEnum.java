package Utility;

public enum RankingEnum {
	
	HighCard(0),
	Pair(1),
	Twopair(2),
	ThreeOfAKind(3),
	Straight(4),
	Flush(5),
	FullHouse(6),
	FourOfAKind(7),
	StraightFlush(8);

	private int numVal;
	
	RankingEnum(int value){
		this.numVal = value;
	}

	public int getNumVal() {
		return numVal;
	}

	public void setNumVal(int numVal) {
		this.numVal = numVal;
	}

}
