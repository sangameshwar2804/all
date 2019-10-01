
public class StaticEx {
static int a=10;
int b=20;
public static void main(String[] args) {
	StaticEx s=new StaticEx();
	s.a=20;
	s.b=30;
	 StaticEx s1=new StaticEx();
	 s1.a=40;
	 s1.b=50;
	  System.out.println(a);
	 System.out.println(s.a +" "+s.b);
	 System.out.println(s1.a +" "+s1.b);
  
}
}
