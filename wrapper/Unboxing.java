package wrapper;

public class Unboxing 
{

	public static void main(String[] args) {
		Integer a=new Integer(10);    
		int i=a.intValue();//converting Integer to int explicitly
		int j=a;//unboxing, now compiler will write a.intValue() internally    
	    System.out.println(a+" "+i+" "+j);  
	}
}
