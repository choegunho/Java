import java.util.Scanner;

public class DayslnMonth {

	public static void main(String[] args) {
		int month;
		int days = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
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
		System.out.println("입력한 월의 일수는 "+days+"일입니다.");
}
}
