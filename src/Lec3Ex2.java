import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		num = scan.nextInt();
		System.out.print(num+"의 약수는 다음과 같습니다.\n");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
			System.out.print(i+" ");
			}
		}
	}

}
