public class Lec3Ex3 {

	public static void main(String[] args) {
		System.out.println("1���� 1000������ ������ �Ҽ��� ������ �����ϴ�.");
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
