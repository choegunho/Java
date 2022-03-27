public class car {
	String color;
	int gear;
	int speed;
	
	int changeGear(int gear) {
		int newgear= gear + 1;
		return newgear;
	}
	int speedUp(int speed) {
		int upSpeed = speed + 20;
		return upSpeed;
	}
	int speedDown(int speed) {
		int downSpeed = speed - 60;
		return downSpeed;
	}
	public String toString() {
		return "Car [color = "+color+", speed = "+speed+", gear = "+gear+"]";
	}
}
