public class Dog extends Animals {
	private int age;

	public Dog() {
		super();
	}

	public Dog(int age, String gender, String name, boolean isDomestic, boolean isPredacious) {
		super(gender, name, isDomestic, isPredacious);
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
}
