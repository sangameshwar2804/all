import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(1);
	al.add(8);
	al.add(21);
	al.add(43);
	al.add(3);
	 for(int counter: al) {
		System.out.println(al);
	}
	 Collections.sort(al);
	 for(int num: al) {
		 System.out.println(num);
	 }
}
}
