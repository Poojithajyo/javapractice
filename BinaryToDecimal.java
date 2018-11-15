import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		try(Scanner in = new Scanner(System.in);)
		{		
			int n = in.nextInt();
			System.out.println(binaryToDecimal(n));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static int binaryToDecimal(int n)
	{
		int temp =n;
		int last_digit =0;
		int base = 1;
		int dec_value = 0;
		while(temp>0)
		{
			last_digit = temp % 10;
			dec_value += last_digit*base;
			temp = temp/10;
			base = base * 2;
			
		}
		return dec_value;
	}

}
