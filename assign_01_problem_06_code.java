//Ramy Ahmed
//20216115
import java.util.*;
public class Assign
{
  public static void main(String args[])
  {
        int X;
	Scanner sc=new Scanner(System.in);	
	X=sc.nextInt();
	while(X>=10)
	{
		X=X/10;
	}
	
 
	if(X%2==0)
	{
		System.out.println("EVEN");
	}
	else
	{
		System.out.println("ODD");
	}
 
  }
 
}
