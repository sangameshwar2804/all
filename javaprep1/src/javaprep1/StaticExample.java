package javaprep1;

public class StaticExample {
	int a=10;
	static int b=20;
	public static void main(String[] args)
	{
	StaticExample t1=new StaticExample();
	t1.a=100;
	t1.b=200;
	StaticExample  t2=new StaticExample();
    t2.a=130;
    t2.b=300;
	System.out.println("t1.a="+t1.a+"t1.b="+t1.b);
	System.out.println("t2.a="+t2.a+"t2.b="+t2.b);
	System.out.println(b);
	}
}
