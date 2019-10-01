
public class Overridingtest extends MethodOOverriding{
public  void get(int a) {
	System.out.println("hello over");
}
public static void main(String[] args) {
	Overridingtest o=new Overridingtest();
	o.get(1);
}
}
