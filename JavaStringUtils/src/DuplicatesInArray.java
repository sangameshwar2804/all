import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
public static void findDuplicates(int[] arr) {
	HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int element : arr) 
    {   
        if(map.get(element) == null)
        {
            map.put(element, 1);
        }
        else
        {
            map.put(element, map.get(element)+1);
        }
    }
    for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
    	if(entry.getValue()>1) {
    		System.out.println(entry.getKey());
    	}
    }
int[] arr1= {1,1,22,2,3,3};
findDuplicates(arr1);
}
}
