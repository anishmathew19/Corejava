package stringmethod;

public class CharAtExampleMain4
{
	public static void main(String[] args) 
	{
		String str="Welcome to my world";
		int count =0;//count variable initialize as zero
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='o')//check the character equal to 'o' 
			{
				count++;// count total no of letter o
			}
		}
		System.out.println("Frequency of o is:"+count); //print count of the variable 
	}

}
