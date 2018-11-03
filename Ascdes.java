import java.util.Scanner;
class Ascdes
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of elements in a array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the array elements");
		int a[] = new int [n];
		for (int i=0;i<n ;i++ )
		{
			a[i] = scan.nextInt();
		}
		desc(a[n]);
		asc(a[n]);
	}
	public static void desc(int a[])  
	{
		int temp;
		for (int i=0;i<n-1 ;i++ )
		{
			if(a[i]<a[i+1])
			{
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("The descending order of elements are: ");
		for (int i=0;i<n ;i++ )
		{
			System.out.println(a[i]);
		}
	}
	public static void asc(int a[])
	{
		int temp;
		for (int i=0;i<n-1 ;i++ )
		{
			if(a[i]>a[i+1])
			{
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("The descending order of elements are: ");
		for (int i=0;i<n ;i++ )
		{
			System.out.println(a[i]);
		}
	}
	
}		
