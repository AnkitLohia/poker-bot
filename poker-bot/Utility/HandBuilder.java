package Utility;

public interface HandBuilder {

	public Hand getHandOnFlop(TableCards tableCards, Player player);
	
	public Hand getHandOnTurn(TableCards tableCards, Player player);
	
	public Hand getHandOnRiver(TableCards tableCards, Player player);
	
}
