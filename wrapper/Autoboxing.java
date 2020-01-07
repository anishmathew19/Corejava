package wrapper;

public class Autoboxing 
{
	public static void main(String args[])
	{  
		//Converting int into Integer  
		int i=20;  
		Integer j=i;//autoboxing, now compiler will write Integer.valueOf(a) internally 
		System.out.println(i+" "+j);   
	}  
}
