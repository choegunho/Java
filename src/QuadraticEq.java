
public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = -3.0;
		double c = 2.0;
		double Roots = Math.sqrt(b*b - 4*c);
		double k1 = (-b + Roots) / 2;
		double k2 = (-b - Roots) / 2;
		
		System.out.println("y = x2 + -3x + 2 ÀÇ ±Ù : " +k1+ ", " +k2);
		System.out.println("b2 - 4ac > 0 : " +(Roots > 0));
	}

}
