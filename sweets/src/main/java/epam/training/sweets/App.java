package epam.training.sweets;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter sweets : ");
    	int n=sc.nextInt();
    	int i;
    	int sum=0;
    	for(i=0;i<n;i++)
    	{
    		System.out.print("Enter the name of the sweet : ");
    		String name=sc.next();
    		Sweet sw;
    		if(name.equals("Fried Gulab Jamun"))
    			sw=new Fried Gulab Jamun();
    		else if(name.equals("Mysorepak Laddu"))
    			sw=new MysorepakLaddu();
    		else if(name.equals("Kaju Halwa Special"))
    			sw=new Kaju Halwa Special();
    		else
    		{
    			System.out.println("No sweet ");
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
