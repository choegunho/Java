import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) { 
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.println("�Էµ� ������5 ¦���Դϴ�.");
		else
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
	}

}
