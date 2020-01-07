package stringmethod;

public class EqualsExampleMain1
{

	public static void main(String[] args)
	{
		String s1="Anish mathew";  
		String s2="Anish mathew";  
		String s3="ANISH MATHEW";  
		String s4="alvan";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
	}

}
