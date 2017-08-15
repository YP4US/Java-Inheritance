//Single inheritance class Demo2 is inheriting class Demo1 that is properties of class Demo1 can be used in class Demo2 using "extends" keyword
//Name:Yogesh Pawar 	Date:15/08/2017

class Demo1			//SuperClass
{
	int x=11;
	void disp()
	{
		System.out.println("Runnning Disp( ) of Demo1");
	}
	
}

class Demo2 extends Demo1		//Demo2 is SubClass
{
	int y=12;
	void test()
	{
		System.out.println("Running test() of Demo2");
	}
	
}

//MaainClass
class MainClass1
{
	public static void main(String args[])
	{
	Demo2 d2=new Demo2();
	System.out.println("X value is:"+d2.x);
	d2.disp();
	System.out.println("y value is:"+d2.y);
	d2.test();
	}
}