public class Rabbit extends Animals {
	private String color;

	Rabbit() {

	}

	Rabbit(String color, String gender, String name, boolean isDomestic, boolean isPredacious) {
		super(gender, name,isDomestic,isPredacious);
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor() {

		this.color = color;
	}

}
