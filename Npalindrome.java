import java.util.Scanner;
public class Npalindrome 
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int sum = palindrome(n);
		System.out.println(sum);
		int m = sum;
		System.out.println(checkpali(m));
	}
// Method to sum the digits of a given number
	static int sumOfDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum = sum +n%10;
			n=n/10;
		}
		return sum;
	}
// Method to check whether sum is palindrome 
	static int checkPali(int m)
	{
		int n = m;
		int d;
		int sum = 0;
		while(n>0)
		{
			d=n%10;
			sum = (sum*10) + d;
			n=n/10;
		}
		if(sum==m)
			return sum;
		else 
			return -1;
	}
}
