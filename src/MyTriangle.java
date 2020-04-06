public class MyTriangle {
	public static void main(String[] args) {
		Triangle firstTriangle = new Triangle();
		firstTriangle.firstSide = 3;
		firstTriangle.secondSide = 2;
		firstTriangle.thirdSide = 4;
		int firstTrianglePerimeter = firstTriangle.countPerimeter();

		System.out.println("The perimeter of this triangle is " + firstTrianglePerimeter);


		Triangle secondTriangle = new Triangle();
		secondTriangle.firstSide = 34;
		secondTriangle.secondSide = 12;
		secondTriangle.thirdSide = 21;
		int secondTrianglePerimeter = secondTriangle.countPerimeter();

		System.out.println("The perimeter of this triangle is " + secondTrianglePerimeter);

		Triangle thirdTriangle = new Triangle();
		thirdTriangle.thirdSide = 32;
		thirdTriangle.secondSide = 54;
		thirdTriangle.thirdSide = 17;
		int thirdTrianglePerimeter = thirdTriangle.countPerimeter();
		System.out.println("The perimeter of this triangle is " + thirdTrianglePerimeter);


		Triangle fourthTriangle = new Triangle(3, 12, 25);
		int fourthTrianglePerimeter = fourthTriangle.countPerimeter();
		System.out.println("The perimeter of this triangle is " + fourthTrianglePerimeter);


	}
}
