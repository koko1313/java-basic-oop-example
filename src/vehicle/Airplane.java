package vehicle;

public class Airplane extends Vehicle implements Movable {

	int seats;
	
	public Airplane(String name, int seats, String color) {
		super.name = name;
		this.seats = seats;
		super.type = "AIRPLANE";
	}
	
	public void move() {
		System.out.println(name + " is flying.");
	}
	
}
