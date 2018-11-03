import java.util.Scanner;

class Linearsearch1
{
	public static void main(String args[])
	{
		
		System.out.println("Enter the number of elements in an array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the elements in a array");
		int[] a = new int[n];
		for (int i=0;i<n ;i++ )
		{
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the key to be searched");
		int key = scan.nextInt();
		int found =0;
		for (int i=0;i<n ;i++ )
		{
			if(a[i] == key)
				found=1;
		}
		if(found==1)
			System.out.println(key +" is found ");
		else 
			System.out.println(key +" is not found");
	}
}