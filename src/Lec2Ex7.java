import java.util.Scanner;
public class Lec2Ex7 {

	public static void main(String[] args) {
		int num;
		int s[] = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 };
		Scanner input = new Scanner(System.in);
		System.out.print("�˻��� ������ �Է��ϼ���: ");
		num = input.nextInt();
		
		for(int i = 0; i < s.length; i++) {
			if(num > s[i]) {
				continue;
			}
			else if(num <s[i]) {
				System.out.print("�˻���"+num+"��(��)"+s[i-1]+"����ũ��"+s[i]+"���� �۽��ϴ�.");
				break;
			}
		}
	}

}
