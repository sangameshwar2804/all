import java.util.HashMap;

public class OccuranceOfDuplicateWoeds {
	public void findDuplicate(String s) {
		HashMap< String, Integer>hm=new HashMap<>();
	String[] sa=s.split(" ");
	for(String s1:sa) {
		if(hm.get(s1)!=null)
			hm.put(s1, hm.get(s1)+1);
		else
		hm.put(s1,1 );
	}
	System.out.println(hm);
	}
public static void main(String[] args) {
	OccuranceOfDuplicateWoeds os=new OccuranceOfDuplicateWoeds();
	os.findDuplicate("white box learning java teaching java");
}
}
