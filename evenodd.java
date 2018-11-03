import java.util.Scanner;
class evenodd
{
	public static void main(String args[])
	{
		System.out.println("Enter any number");
		Scanner Scan = new Scanner(System.in);
		int num;
		num = Scan.nextInt();
		if(num%2 == 0)
			System.out.println(num + " is even number");
		else
			System.out.println(num + " is odd number");
		prime(num);
	}

	static void prime(int num)
	{
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2 == 0)
				count++;
			break;
		}
		if(count == 2)
			System.out.println(num + " is a primenumber");
	}
}