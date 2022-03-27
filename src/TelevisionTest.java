public class TelevisionTest {
	public static void main(String[] args) {
		Television 	myTv = new Television();
		int sum;
		myTv.channel = 7;
		myTv.volume =9;
		myTv.OnOff = true;
		myTv.print();
	
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.OnOff = true;
		yourTv.print();
		
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 "+ch+" 입니다.");
		
		sum = myTv.add(myTv.channel, myTv.volume);
		System.out.println("나의 텔레비전의 채널과 볼륨의 합은 "+sum+"입니다.");
		
		Television ourTv = new Television();
		ourTv.setChannel(11);
		int ch2 = ourTv.getChannel();
		System.out.println("우리의 텔레비전 현재 채널은 "+ch2+"입니다.");
	}
}
