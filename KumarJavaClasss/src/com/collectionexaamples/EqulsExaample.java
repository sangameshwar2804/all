package com.collectionexaamples;

public class EqulsExaample {
	private int age;//=10
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return age * 17;

	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof EqulsExaample && ((EqulsExaample) obj).age == this.age
				&& ((EqulsExaample) obj).name == this.name) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		EqulsExaample e = new EqulsExaample();
		String str = new String("hello");
		String str2 = new String("hello");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str2));
		e.setAge(10);
		e.setName("hello");
		EqulsExaample e2 = new EqulsExaample();
		e2.setAge(10);
		e2.setName("hello");
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		if (e.equals(e2)) {

			System.out.println("true");
		} else
			System.out.println("false");
	}
}
