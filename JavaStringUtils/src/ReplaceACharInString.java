import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceACharInString {
public static void main(String[] args) {
int [] arr= {1,1,22,3,4,2,3,4,5};
HashSet hs=new  HashSet();
for(int i=0;i<arr.length;i++) {
	hs.add(arr[i]);
}
Iterator itr=hs.iterator();
while(itr.hasNext()){
System.out.print(itr.next());
}
}
}
