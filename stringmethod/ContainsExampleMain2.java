package stringmethod;

public class ContainsExampleMain2
{
	public static void main(String[] args) 
	{
		 String str = "Hello A#N#I#S#H";
		 boolean isContains=str.contains("A#N#I#S#H");
		 System.out.println(isContains);
		 System.out.println(str.contains("ANIsh"));//case sensitive
	}
}
