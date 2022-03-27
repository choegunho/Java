import java.util.Scanner;
public class Lec2Ex7 {

	public static void main(String[] args) {
		int num;
		int s[] = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 };
		Scanner input = new Scanner(System.in);
		System.out.print("검색할 정수를 입력하세요: ");
		num = input.nextInt();
		
		for(int i = 0; i < s.length; i++) {
			if(num > s[i]) {
				continue;
			}
			else if(num <s[i]) {
				System.out.print("검색한"+num+"은(는)"+s[i-1]+"보다크고"+s[i]+"보다 작습니다.");
				break;
			}
		}
	}

}
