package vehicle;

public class Main {

	public static void main(String[] args) {
		
		World.isCoronaActive = false;
		
		Vehicle car1 = new Car("Mcqueen", 4, 4, "Red");
		Vehicle car2 = new Car("Mathew", 3, 2, "Yellow");
		Vehicle plane1 = new Airplane("Iron Bird", 200, "White");
		
		Vehicle caruca1 = new Karuca("Strela");
		
		
		World.move(car1);
		World.move(car2);
		World.move(plane1);
		World.move(caruca1);
	}

}
