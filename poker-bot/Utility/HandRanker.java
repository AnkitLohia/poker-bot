package Utility;

import java.util.List;

public interface HandRanker {

	public List<Player> getWinnersList(TableCards tableCards,List<Player> players);
	
	public List<Player> getHandRankingOnFlop(TableCards tableCards,List<Player> players);
	
	public List<Player> getHandRankingOnTurn(TableCards tableCards,List<Player> players);
	
	public List<Player> getHandRankingOnRiver(TableCards tableCards,List<Player> players);
	
}
