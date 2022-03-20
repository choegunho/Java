import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) { 
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.println("입력된 정수는5 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
	}

}
