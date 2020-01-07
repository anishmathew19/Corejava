package stringmethod;

public class EndsWithExampleMain2
{
	public static void main(String[] args) 
	{
		String str="Welcome to FACE.in"; 
		System.out.println(str.endsWith("in"));// to check the string end with the word 'in'
		if(str.endsWith(".com")) 
		{  
            System.out.println("String ends with .com");  
        }
		else
		{
        	System.out.println("It does not end with .com");
		}
	}

}
