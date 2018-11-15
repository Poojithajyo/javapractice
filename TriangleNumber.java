// To check whether given number is triangular number or not
import java.util.*;
public class TriangleNumber 
{
	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		tNumber(num);
			
	}
//Method to find whether given number is traigular number
	public static void tNumber(int num)
	{
		int sum =0;
		for (int i = 1;sum<=num; i++)
		{
			sum =sum+i;
			if(sum == num)
			{
				break;
			}
		}
		if(sum == num)
		System.out.println("Triangle number");
		else
			System.out.println("Not a Triangle Number");
	}

}
