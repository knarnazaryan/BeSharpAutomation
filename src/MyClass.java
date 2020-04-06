public class MyClass {
	public static void main(String[] args) {
		Dog myDog = new Dog(5, "female", "Jina", true, true);
		myDog.meetMyAnimal();
		myDog.foodAnimal();


		Rabbit myRabbit = new Rabbit("grey", "male", "Bruno", false, false);
		myRabbit.meetMyAnimal();
		myRabbit.foodAnimal();
	}
}
