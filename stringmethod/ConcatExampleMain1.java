package stringmethod;

public class ConcatExampleMain1
{

	public static void main(String[] args) 
	{
		String s1="java string";  
		s1.concat("is immutable");// String s1 concat  to is immutable   
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);
	}

}