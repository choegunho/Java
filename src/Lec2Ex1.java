import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner input = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��ϼ���: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2)
			System.out.println("�� ������ �� ū ����"+num1+"�Դϴ�.");
		else
			System.out.println("�� ������ �� ū ����"+num2+"�Դϴ�.");
	}

}
