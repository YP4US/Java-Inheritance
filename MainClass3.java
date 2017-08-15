//Hirarchical inheritance class Demo3 is inheriting class Demo1 and Demo2 is inheriting the class Demo1 that is properties of class Demo1   can be used in class Demo3 and Demo2 using "extends" keyword and accessing using instance of class Demo3
//Name:Yogesh Pawar 	Date:15/08/2017

class Demo1				//SuperClass
{
	int i=10;
	void test()
	{
		System.out.println("Running test() of Demo1 class");
	}

}


class Demo2 extends Demo1		//SubClass of Demo1 
{
	double d=11.11;
	void disp()
	{
		System.out.println("Running disp() of Demo2 class");
	}
}


class Demo3 extends Demo1		//SubClass of Demo1
{
	boolean b=true;
	void run()
	{
		System.out.println("Running run() of Demo3 class");
	}
}

//MainClass
class MainClass3
{
	public static void main(String args[])
	{
		System.out.println("Program started ");
		Demo3 d3=new Demo3();
		Demo2 d2=new Demo2();
		d3.test();
		System.out.println("i value is:"+d3.i);
		System.out.println("b value is:"+d3.b);
		d2.test();
		System.out.println("d value is:"+d2.i);
		System.out.println("i value is:"+d2.d);
		System.out.println("Program Ended");
		
	}
}