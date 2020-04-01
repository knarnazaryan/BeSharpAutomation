public class Pets {
	String name;
	int age;
	boolean isFemale;


	Pets(){

	}

	Pets(String name, int age) {
		this.name = name;
		System.out.println("I'm the first constructor. I contain " + age + " argument");
	}

	Pets(String name, String age) {
		System.out.println("I'm the second constructor. I contain " + " " + name + " " + age + " argument");
	}

	Pets(String name, int age, boolean isFemale) {
		System.out.println("I'm the third constructor. I contain " + name +" "+ age +" "+ isFemale + " argument");
	}
}
