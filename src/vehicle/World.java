package vehicle;

public class World {
	
	static boolean isCoronaActive;

	public static void move(Movable movable) {
		if(!isCoronaActive) {
			movable.move();
		} else {
			System.out.println("You are not able to move.");
		}
	}
	
}
