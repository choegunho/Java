import java.util.Scanner;

public class DayslnMonth {

	public static void main(String[] args) {
		int month;
		int days = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		month = input.nextInt();
		
		switch(month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
	}
		System.out.println("�Է��� ���� �ϼ��� "+days+"���Դϴ�.");
}
}
