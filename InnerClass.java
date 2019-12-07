package corepgm;
class InnerClass
{ 
	private int a=10;
	class Inner
	{
		public void display()
		{
			System.out.println("The value o fthe data is "+a);
		}
	}
	public static void main(String[] args)
	{
		InnerClass obj=new InnerClass();//fisrt way
		InnerClass.Inner obj2=obj.new Inner();
		InnerClass.Inner obj3=new InnerClass().new Inner();//second way
		obj2.display();
		obj3.display();
		
		
	}
}