package VisaJava;

public class Prime {

	public static void main(String[] args) {
		int range = 100;
		for(int i=2;i<=range;i++) 
        {
            int count= 1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                {
                    count = 0;
                    break;
                }

            }
            if(count==1) 
            {
                System.out.print(i+" ");
            }
        }
	}
}