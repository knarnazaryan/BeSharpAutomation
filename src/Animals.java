import java.util.Scanner;

public class Animals {
	protected String gender;
	protected String name;
	protected boolean isDomestic;
	protected boolean isPredacious;

	Animals() {

	}

	protected Animals(String gender, String name, boolean isDomestic, boolean isPredacious) {
		this.gender = gender;
		this.name = name;
		this.isDomestic = isDomestic;
		this.isPredacious = isPredacious;
	}


	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public boolean isPredacious() {
		return isPredacious;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDomestic(boolean domestic) {
		isDomestic = domestic;
	}

	public void setPredacious(boolean predacious) {
		isPredacious = predacious;
	}

	public void meetMyAnimal() {
		System.out.println("Hi, my name is " + name + " . I'm " + gender + " and I'm very hungry. So, can you please feed me?");
	}

	public void foodAnimal() {
		if (isPredacious) {
			System.out.println("I don't eat grass, so please, put the meet into my bowl. Thank you");
		} else {
			System.out.println("I like grass very much, can you give me grass? Thank you");
		}
		}

}
