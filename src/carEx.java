public class carEx {

	public static void main(String[] args) {
		car Redcar = new car();
		Redcar.color = "red";
		Redcar.gear = 2;
		Redcar.speed = 80;
		
		System.out.println(Redcar.toString());

		Redcar.gear = Redcar.changeGear(Redcar.gear);
		System.out.println(Redcar.toString());
		Redcar.speed = Redcar.speedUp(Redcar.speed);
		System.out.println(Redcar.toString());
		Redcar.speed = Redcar.speedDown(Redcar.speed);
		System.out.println(Redcar.toString());
		
	}

}

