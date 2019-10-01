class Test implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("userdefined thread");
		}
	}
}



public class Multithread {

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}

	}

}
