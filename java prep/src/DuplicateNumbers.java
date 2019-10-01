import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {
public static void main(String[] args) {
	int[] arr= {1,1,4,2,3};
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i],hm.get(arr[i])+1);
		}
		else {
			hm.put(arr[i],1);
		}
	}
	int duplicate=0;
	for(Map.Entry<Integer,Integer>entry:hm.entrySet()) {
		if(entry.getValue()>1) {
			duplicate=entry.getKey();
			System.out.println(duplicate);
			break;
		}
	}
}
}
