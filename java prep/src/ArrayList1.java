import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("austarlia");
		al.add("india");
		//al.add(null);
		al.add("hello");
		al.add("srilanka");
		al.add("ireland");
		for(String s:al) {
			System.out.println(s);
		}
		Collections.sort(al);
		for(String s:al) {
			System.out.println(s);
		}
	}

}
