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
		System.out.println("���� ä���� "+ch+" �Դϴ�.");
		
		sum = myTv.add(myTv.channel, myTv.volume);
		System.out.println("���� �ڷ������� ä�ΰ� ������ ���� "+sum+"�Դϴ�.");
		
		Television ourTv = new Television();
		ourTv.setChannel(11);
		int ch2 = ourTv.getChannel();
		System.out.println("�츮�� �ڷ����� ���� ä���� "+ch2+"�Դϴ�.");
	}
}
