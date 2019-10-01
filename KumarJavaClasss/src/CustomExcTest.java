
public class CustomExcTest {
private String name;
private int age;
public CustomExcTest(String name,int age) throws CustomExc{
	if(age<=0) {
		throw new CustomExc("dont enter age as negative");
	}else
	this.name=name;
	this.age=age;
	System.out.println(this.name=name);
	System.out.println(this.age=age);
}
}
