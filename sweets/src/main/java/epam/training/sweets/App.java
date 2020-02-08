package epam.training.sweets;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter number of sweets : ");
    	int n=sc.nextInt();
    	int i;
    	int sum=0;
    	for(i=0;i<n;i++)
    	{
    		System.out.print("Enter the name of the sweet : ");
    		String name=sc.next();
    		Sweet sw;
    		if(name.equals("Gulab Jamun"))
    			sw=new GulabJamun();
    		else if(name.equals("Mysore Laddu"))
    			sw=new MysoreLaddu();
    		else if(name.equals("Kaju Barfi"))
    			sw=new KajuBarfi();
    		else
    		{
    			System.out.println("No such sweet ");
    			i--;
    			continue;
    		}
    		System.out.print("Number of kg's required : ");
    		int kg=sc.nextInt();
    		sum+=sw.getCost()*kg;
    	}
    	System.out.println("Total bill is : "+sum);
    }
}
