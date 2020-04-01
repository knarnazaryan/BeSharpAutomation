public class Triangle {
	int firstSide;
	int secondSide;
	int thirdSide;


	Triangle() {

	}

	Triangle(int firstSide, int secondSide, int thirdSide) {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}



	int countPerimeter() {
		int perimeter = firstSide + secondSide + thirdSide;
		return perimeter;
	}
}
