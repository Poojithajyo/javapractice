import java.util.Scanner;
class Amstrongnum
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int c=0,n,d;
		n = num;
		while(n>0)
		{
			d=n%10;
			n=n/10;
			c=c+(d*d*d);
		}

		if(n==c)
			System.out.println(num + " is a amstrong number");
		else
			System.out.println(num + " is a amstrong number");
	}
}