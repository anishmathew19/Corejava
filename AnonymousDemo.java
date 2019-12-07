package corepgm;
abstract class Anonymousexp{  
	  abstract void dosomething();  
	}  

public class AnonymousDemo {
	public static void main(String[] args)
	{
		Anonymousexp obj=new Anonymousexp()
		{
			public void dosomething()
			{
			System.out.println("Anonymous Class");	
			}
		};
		obj.dosomething();
		
		
	}

}
