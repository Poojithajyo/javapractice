
	// Java program to perform string manipulation 
import java.util.Arrays; 
import java.util.Scanner;
public class StringManipulation 
{
	// Method to sort a string alphabetically 
	public static String sortString(String inputString) 
	{ 
		// convert input string to char array 
		char tempArray[] = inputString.toCharArray(); 
		
		// sort tempArray 
		Arrays.sort(tempArray); 
		
		// return new sorted string 
		return new String(tempArray); 
	} 
	
	//Method to count no of vowels,consonants,digits and white spaces
	public static void stringSort(String inputString)
	{
		int vowels=0, consonants=0, digits=0, spaces=0;
		inputString = inputString.toLowerCase();
		for(int i=0; i<inputString.length(); i++)
		{
			char ch = inputString.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else if(ch>='a' && ch<='z')
				consonants++;
			else if (ch>='1' && ch<='9')
				digits++;
			else
				spaces++;
			
		}
		System.out.println("Vowels are: "+vowels);
		System.out.println("consonats are: "+consonants);
		System.out.println("digits are: "+digits);
		System.out.println("spaces are: "+spaces);
	}
	
	// Method to count number of words in a string
	public static int countWords()//String inputString)
	{
		int count=1;
		String inputString = "Poojitha is a good girl";
		for(int i=0; i<inputString.length()-1; i++)
		{
			if((inputString.charAt(i)==' ') && (inputString.charAt(i+1)!=' '))
				count++;
		}
		return count;
	}
	// Method to reverse each word in the given string
	public static void wordReverse(String original) 
	{
		String reverse="";
		String revpart ="";
		String[] parts = original.split(" ");
		for(int i=0;i<parts.length;i++)
		{
			String part = parts[i];
			revpart="";
			for(int j=part.length()-1;j>=0;j--)
			{
				revpart = revpart+part.charAt(j);
			}
			reverse = reverse+revpart+" ";
		}
		System.out.println(reverse);
		
	}
	
	// method to get only alphabets in given string
	public static void dispAlpha(String inputString)
	{
		String s = inputString.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				System.out.println(inputString.charAt(i));
		}
	}
	
	// Driver method 
		public static void main(String[] args) 
		{ 
			Scanner in = new Scanner(System.in);
			String inputString = in.nextLine();
			String outputString = sortString(inputString); 
			
			System.out.println("Input String : " + inputString); 
			System.out.println("Output String : " + outputString); 
			
			stringSort(inputString);
			
			System.out.println("Number of words in the given string: " +countWords());
			
			wordReverse(inputString);
			
			dispAlpha(inputString);
			in.close();
		} 
} 

