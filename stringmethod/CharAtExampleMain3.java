package stringmethod;

public class CharAtExampleMain3
{

	public static void main(String[] args) 
	{
		String str="Welcome to my world";
		int strlength=str.length();
		System.out.println("Character at 1st index is: "+str.charAt(1));//fetching the first characte
		
		System.out.println("Character at last index is: "+str.charAt(strlength-1));//fetching the last character
	}

}
