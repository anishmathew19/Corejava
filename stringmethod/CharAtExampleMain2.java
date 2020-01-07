package stringmethod;

public class CharAtExampleMain2
{

	public static void main(String[] args) 
	{
		String name="anish mathew";
		char ch=name.charAt(20);//returns the char value at the 20th index
		System.out.print(ch); //String index out of range: 20 will be get error
	}

}
