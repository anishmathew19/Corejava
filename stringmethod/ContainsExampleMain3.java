package stringmethod;

public class ContainsExampleMain3
{

	public static void main(String[] args)
	{
		String str= "To learn Java visit focusacademy.in";
		if(str.contains("focusacademy.in.com"))
		{
			System.out.println("This string contains focusacademy.in");
		}
		else
		{
			System.out.println("Result not found");	
		}
	}
}
