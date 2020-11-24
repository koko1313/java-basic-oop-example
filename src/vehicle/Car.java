package vehicle;

public class Car extends Vehicle implements Movable {
	
	int wheelsCount;
	int doorsCount;
	
	public Car(String name, int wheelsCount, int doorsCount, String color) {
		super.name = name;
		this.wheelsCount = wheelsCount;
		this.doorsCount = doorsCount;
		super.color = color;
		super.type = "CAR";
	}
	
	public void move() {
		System.out.println(name + " is moving.");
	}
	
}
