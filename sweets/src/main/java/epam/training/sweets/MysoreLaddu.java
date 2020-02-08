package epam.training.sweets;

public class MysoreLaddu implements Sweet
{
	String name;
	int cost;
	public MysoreLaddu()
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
