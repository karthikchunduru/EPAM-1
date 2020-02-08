package epam.training.sweets;

public class FriedGulabJamun implements Sweet
{
	String name;
	int cost;
	public FriedGulabJamun()
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
