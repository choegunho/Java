import java.util.Scanner;

public class Lec2Ex5 {

	public static void main(String[] args) {
		int n;
		double i = 1, pi = 0, deno = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ���� �Է��ϼ���: ");
		n = scan.nextInt();
		
		for(int j = 0; j < n; j++) {
			pi += i*4/deno;
			i *= -1;
			deno += 2;
			
		}
		System.out.print(pi);
	}

}
