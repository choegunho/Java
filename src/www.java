import java.util.Scanner;

public class www {

	public static void main(String[] args) {
		String url;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("�ּҸ� �Է��ϼ���('quit' �Է½� ����)");
			url = scan.nextLine();
		
			if(url.contains("www")) {
				System.out.println(url+" �� 'www'�� �����մϴ�.");
			}
			else if(url.contains("quit")) {
				break;
			}
			else
				System.out.println(url+" �� 'www'�� ���������ʽ��ϴ�.");
		}
	}

}
