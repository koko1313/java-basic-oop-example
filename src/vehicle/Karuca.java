package vehicle;

public class Karuca extends Vehicle implements Movable {

	public Karuca(String name) {
		super.name = name;
		super.type = "KARUCA";
	}

	public void move() {
		System.out.println(name + " is moving.");
	}
	
}
