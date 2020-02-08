package epam.training.sweets;

public class GulabJamun implements Sweet
{
	String name;
	int cost;
	public GulabJamun()
	{
		setCost(20);
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
