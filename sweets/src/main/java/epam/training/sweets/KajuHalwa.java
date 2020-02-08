package epam.training.sweets;

public class KajuHalwa implements Sweet
{
	String name;
	int cost;
	public KajuHalwa()
	{
		setCost(25);
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
}
