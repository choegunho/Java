import java.util.Scanner;

public class www {

	public static void main(String[] args) {
		String url;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("주소를 입력하세요('quit' 입력시 종료)");
			url = scan.nextLine();
		
			if(url.contains("www")) {
				System.out.println(url+" 은 'www'로 시작합니다.");
			}
			else if(url.contains("quit")) {
				break;
			}
			else
				System.out.println(url+" 은 'www'로 시작하지않습니다.");
		}
	}

}
