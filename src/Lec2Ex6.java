
public class Lec2Ex6 {

	public static void main(String[] args) {
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		
		int temp = s[0];
		
		System.out.println("배열");
		for(int i = 0; i < s.length; i++) {
			if(temp > s[i]) {
				temp = s[i];
			}
			System.out.print(s[i]+" ");
		}
		System.out.print("\n");
		System.out.print("배열s의 최솟값은: "+temp);
	}

}
