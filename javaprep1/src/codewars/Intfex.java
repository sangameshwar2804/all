package codewars;

public interface Intfex {
String path="path";
public void get();
abstract void get2();
class int2 implements Intfex{

	@Override
	public void get() {
System.out.println("implemeted in int2");		
	}

	@Override
	public void get2() {
System.out.println(path);
		System.out.println("implemeted in intf2");
}
	
}
public static void main(String[] args) {
	int2 i=new int2();
	i.get();
	i.get2();
}
}
