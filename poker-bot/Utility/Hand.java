package Utility;

import java.util.List;

public class Hand implements Comparable<Hand>{
	
	private RankingEnum handRank;
	
	private List<Card> cards;

	public RankingEnum getHandRank() {
		return handRank;
	}

	public void setHandRank(RankingEnum handRank) {
		this.handRank = handRank;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	
	@Override
	public int compareTo(Hand o) {
		if(this.handRank == o.getHandRank()){
			return 0;
		}
		return this.handRank.getNumVal()-o.getHandRank().getNumVal();
			
	}
	
}
