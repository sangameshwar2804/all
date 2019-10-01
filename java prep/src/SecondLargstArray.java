import java.util.ArrayList;

public class SecondLargstArray {
	public static void findSecond() {
		int arr[]={1,3,5,6,4,7,34,10,5,0,-2,11};
		int a1=0;
		 int a2=0;
		for(int i=0;i<arr.length;i++){
		if(a1<arr[i]){
		      a2=a1;
		      a2=arr[i];
		 } else if(a2<arr[i]){
		                a2=arr[i];
		}
		}  
		        System.out.println(a2);
	}
		public static void main(String args[])
		{ 
			findSecond();
			 }
		}
	