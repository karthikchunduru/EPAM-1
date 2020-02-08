package epam.training.sweets;

public class KajuBarfi implements Sweet
{
	String name;
	int cost;
	public KajuBarfi()
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
