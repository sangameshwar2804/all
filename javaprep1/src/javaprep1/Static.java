package javaprep1;

public class Static {
static int a=10;
int b=20;
public static void main(String[] args) {
	Static s=new Static();
	s.a=35;
	
	s.b=20;
	Static s1=new Static();
	s1.a=40;
	s1.b=50;
	System.out.println(s.a);
	System.out.println(s.b);  
	System.out.println(s1.a);  
	System.out.println(s1.b);
	System.out.println(a);    
}
}
