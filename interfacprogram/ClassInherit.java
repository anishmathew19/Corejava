package interfacprogram;
public class ClassInherit implements Interfaceexp1,Interfaceexp2
{
	public void  add(int a,int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}
	 public void sub(int a,int b)
	{
		System.out.println(a+"-"+b+"="+(a-b));
	}
	public void mult(int a,int b)
	{
		System.out.println(a+"*"+b+"="+(a*b));	
	}
	public void div(int a,int b)
	{
		System.out.println(a+"/"+b+"="+(a/b));	
	}

}
