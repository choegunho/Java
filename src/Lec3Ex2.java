import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		num = scan.nextInt();
		System.out.print(num+"�� ����� ������ �����ϴ�.\n");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
			System.out.print(i+" ");
			}
		}
	}

}
