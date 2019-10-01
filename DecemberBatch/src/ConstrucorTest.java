
public class ConstrucorTest {
	int x;
public ConstrucorTest()
{
	System.out.println("DEFAULT Construcotr");
}
public ConstrucorTest(int x)
{
	this.x=x;
	System.out.println(x);
}
public static void main(String[] args) {
	ConstrucorTest c=new ConstrucorTest(10);
}
}