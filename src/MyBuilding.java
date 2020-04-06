public class MyBuilding {
	public static void main(String[] args) {
		Building buildingOnKomitasAvenue = new Building();
		buildingOnKomitasAvenue.countOfFloors = 8;
		buildingOnKomitasAvenue.countOfAptOnEachFloor = 4;
		int countOfFlatsOfKomitasAvenueBuilding = buildingOnKomitasAvenue.countTheAppartamentsInEachBuilding();
		System.out.println("Building on Komitas avenue  has " + countOfFlatsOfKomitasAvenueBuilding + " flats");


		Building buildingOnHalabyanStreet = new Building(5, 3);
		int countOfFlatsOfHalabyanStreetBuilding = buildingOnHalabyanStreet.countTheAppartamentsInEachBuilding();
		System.out.println("Building on Halabyan street  has " + countOfFlatsOfHalabyanStreetBuilding + " flats");

		Building buildingOnKievyanStreet = new Building(6, 3);
		int countOfFlatsOfKievyanStreetBuilding = buildingOnKievyanStreet.countTheAppartamentsInEachBuilding();
		System.out.println("Building on Kievyan street  has " + countOfFlatsOfKievyanStreetBuilding + " flats");







	}
}
