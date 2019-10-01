package com.collectionexaamples;

import java.util.Map;

import com.wbl.Employee;

public class MapTest {
public static void main(String[] args) {
	MapExample me=new MapExample();
			/*Map<Employee,String>m=me.maapCustomObjectAsKey();
			Employee e1=new Employee(1, "Aryav");
			System.out.println("Value"+m.get(e1));*/
			//Map<String, String>map=me.sampleExample();
			Map<String,String>mp=me.sampleExample2();
			System.out.println("Value:"+mp.get("Aryav"));
			
}
}
