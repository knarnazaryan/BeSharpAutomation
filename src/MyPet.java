public class MyPet {
	public static void main(String[] args) {
		Pets biggle = new Pets();
		biggle.name = "Rony";
		biggle.age = 5;
		biggle.isFemale = false;

		System.out.println(biggle.name);

		Pets boxer = new Pets("Roxie", 3);
		System.out.println(boxer.age);


		Pets spaniel = new Pets("lizzie", 6, true);
		System.out.println(spaniel.age + spaniel.name + spaniel.isFemale);

	}


}
