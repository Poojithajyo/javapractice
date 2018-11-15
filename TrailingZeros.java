//To find the trailing zeros present in N!
import java.util.*;
public class TrailingZeros
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println(fact(n));

	}
//Method to find factorial of n and trailing zeros
	public static int fact(int n)
	{
		int f=1,count=0;
		if(n==0)
			return 1;
		else
		{
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}				
		}
		while(f>0)
		{
			int d=f%10;
			f=f/10;
			if(d==0)
				count++;
			else
				break;
		}
		return count;
	}
}
