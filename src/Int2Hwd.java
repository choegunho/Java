import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num = input.nextInt();
		
		switch(num) {
		 	case 0:
		 		System.out.println("없음");
		 		break;
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			default:
				System.out.println("많음");
				break;
		}

	}

}
