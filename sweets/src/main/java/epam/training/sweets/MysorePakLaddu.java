package epam.training.sweets;

public class MysorePakLaddu implements Sweet
{
	String name;
	int cost;
	public MysorePakLaddu()
	{
		setCost(38);
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
