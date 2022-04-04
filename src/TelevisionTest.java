public class TelevisionTest {
	public static void main(String[] args) {
		Television 	myTv = new Television(7, 9, true);
		int sum;
		myTv.print();
	
		Television yourTv = new Television(9, 12, true);
		yourTv.print();
		
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 "+ch+" 입니다.");
		
		Television ourTv = new Television(11, 6, true);
		ourTv.setChannel(11);
		int ch2 = ourTv.getChannel();
		System.out.println("우리의 텔레비전 현재 채널은 "+ch2+"입니다.");
	}
}
