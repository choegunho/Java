import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner input = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2)
			System.out.println("두 정수중 더 큰 수는"+num1+"입니다.");
		else
			System.out.println("두 정수중 더 큰 수는"+num2+"입니다.");
	}

}
