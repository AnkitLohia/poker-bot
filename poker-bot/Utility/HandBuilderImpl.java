package Utility;

import java.util.LinkedList;
import java.util.List;

public class HandBuilderImpl implements HandBuilder {


	@Override
	public Hand getHandOnFlop(TableCards tableCards, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hand getHandOnTurn(TableCards tableCards, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hand getHandOnRiver(TableCards tableCards, Player player) {
		
		
		Card[] flopCard = tableCards.getFlop();
		
		List<Card> cards = new LinkedList<>();

		for(int i=0;i<3;i++){
			cards.add(flopCard[i]);
			
		}
		cards.add(tableCards.getTurn());
		cards.add(tableCards.getRiver());

		Card[] playerCard = player.getCards();
		cards.add(playerCard[0]);
		cards.add(playerCard[1]);
		
		int[] cardRankCount = new int[14];
		int[] cardSuitCount = new int[4];
		
		for(int i=0;i<cards.size();i++){
			Card c = cards.get(i);
			CardRank r = c.getRank();
			CardSuit s = c.getSuit();
			cardRankCount[r.getValue()]++;
			if(s.getSuit()=='S') cardSuitCount[0]++;
			else if(s.getSuit()=='H') cardSuitCount[1]++;
			else if(s.getSuit()=='D') cardSuitCount[2]++;
			else cardSuitCount[3]++;
		}
		
		return null;
	}
	
	private Hand getStraightFlush(int[] cardRankCount,int[] cardSuitCount,List<Card> cards){
		if(cardSuitCount[0]<5 && cardSuitCount[1]<5 && cardSuitCount[2]<5 && cardSuitCount[3]<5) return null;
		CardSuit flushSuit = null;
		
		int i;
		for( i=0;i<4;i++){
			if(cardSuitCount[i]>=5){
				if(i==0) flushSuit = CardSuit.SPADE;			
				else if(i==1) flushSuit = CardSuit.HEART;
				else if(i==2) flushSuit = CardSuit.DIAMOND;
				else flushSuit = CardSuit.CLUB;
				break;
			}
		}
		
		int[] cardRankCountOfFlush = new int[14];
		
		for(i=0;i<cards.size();i++){
			Card c = cards.get(i);
			CardSuit s = c.getSuit();
			CardRank r = c.getRank();
			if(s.getSuit()==flushSuit.getSuit()){
				cardRankCountOfFlush[r.getValue()]++;
			}
		}
		Hand hand  = new Hand();
		List<Card> handcards = new LinkedList<>();
		
		if(cardRankCountOfFlush[1]>=1 && cardRankCountOfFlush[13]>=1 && cardRankCountOfFlush[12]>=1 && cardRankCountOfFlush[11]>=1 && cardRankCountOfFlush[10]>=1){
			
			hand.setHandRank(RankingEnum.StraightFlush);
		
			Card c = new Card();
			c.setRank(CardRank.ACE);
			c.setSuit(flushSuit);
			handcards.add(c);
			for(i=13;i>=10;i--){
				c = new Card();
				c.setRank(CardRank.getRankByInt(i));
				c.setSuit(flushSuit);
				handcards.add(c);
			}
			hand.setCards(handcards);
			return hand;
		}
		
		
		for(i=13;i>=1;i--){
			if(cardRankCountOfFlush[i]>=1){
				Card c = new Card();
				c.setRank(CardRank.getRankByInt(i));
				c.setSuit(flushSuit);
				handcards.add(c);
			}
			else{
				handcards.clear();
			}
			if(handcards.size()==5){
				hand.setHandRank(RankingEnum.StraightFlush);
				hand.setCards(handcards);
				return hand;
			}
			
		}
		
		return null;
	}
	
	
	private Hand getFourOfaKind(int[] cardRankCount,int[] cardSuitCount,List<Card> cards){
		
		return null;
	}

}
