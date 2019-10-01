package com.collectionexaamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.wbl.Employee;

public class MapExample {
	public Map<Employee, String> maapCustomObjectAsKey() {
		Map<Employee,String> m=new HashMap<Employee,String>();
		Employee e1=new Employee(1,"Aryav");
		Employee e2=new Employee(2,"Lakshay");
		m.put(e1, "java developer");
		m.put(e2, "Qa");
		m.entrySet();
		System.out.println(m.size());
		Set<Employee>keys=m.keySet();
		for(Employee key:keys) {
			System.out.println("key:"+key.getName()+"value:"+m.get(key));
		}
		return m;
	}
	public Map<String, String> sampleExample(){
		Map<String, String>map=new HashMap<>();
		map.put("Android", "Aryav");
		map.put("Java","Lakshay");
		map.put("Selnium","Bhaskar");
		return map;
		
	}
	public Map<String, String> sampleExample2(){
		Map<String, String>mp=new HashMap<>();
		mp.put("Aryav", "QA");
		mp.put("Lakshay", "Java");
		mp.put("Vivek", "UI");
		return mp;
	}
	/*Map<Integer, String>employee=new HashMap<>();
	employee.put(101, "john");
	employee.put(2, "Aryav");
	employee.put(3, "Lakshay");
	employee.put(4, "Vedaang");
	employee.put(4, "Bhaskar");
	employee.put(null, "Vikas");
	employee.put(null, "Anubhav");
	System.out.println("The size of the map is"+employee.size());
//	Set<Integer>keys=m.keySet();
//	for(int i:keys) {
//		System.out.println("key :"+i +"Value:"+m.get(i));
//	}
	for(Map.Entry<Integer, String>entry:employee.entrySet()) {
		System.out.println(entry.getKey()+"- "+entry.getValue());
	}*/

}
