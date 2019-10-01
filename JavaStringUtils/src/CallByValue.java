
public class CallByValue {
	int p;
	int q;
public static void main(String[] args) {
	int x=10;
	int y=20;
	CallByValue obj=new CallByValue();
	obj.add(x, y);
	obj.p=50;
	obj.q=60;
	obj.swap(obj);
}
public static int add(int a,int b) {
	int c=a+b;
	return c;
}
public static void swap(CallByValue t) {
	int temp;
	temp=t.p;
	t.p=t.q;
	t.q=temp;
}
}
