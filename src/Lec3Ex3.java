public class Lec3Ex3 {

	public static void main(String[] args) {
		System.out.println("1부터 1000사이의 정수중 소수는 다음과 같습니다.");
		for(int i = 1; i <= 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if(i != j && i % j == 0) {
					break;
				}
			if(i == j)
				System.out.print(i+" ");
			}
		}
	}

}
