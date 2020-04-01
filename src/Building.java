public class Building {
	int countOfFloors;
	int countOfAptOnEachFloor;

	Building(){

	}

	Building(int countOfFloors, int countOfAptOnEachFloor){
		this.countOfFloors = countOfFloors;
		this.countOfAptOnEachFloor = countOfAptOnEachFloor;

	}

	int countTheAppartamentsInEachBuilding() {
		int aptCount = countOfFloors * countOfAptOnEachFloor;
		return aptCount;
	}
}
