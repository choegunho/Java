public class TelevisionTest {
	public static void main(String[] args) {
		Television 	myTv = new Television(7, 9, true);
		int sum;
		myTv.print();
	
		Television yourTv = new Television(9, 12, true);
		yourTv.print();
		
		int ch = myTv.getChannel();
		System.out.println("���� ä���� "+ch+" �Դϴ�.");
		
		Television ourTv = new Television(11, 6, true);
		ourTv.setChannel(11);
		int ch2 = ourTv.getChannel();
		System.out.println("�츮�� �ڷ����� ���� ä���� "+ch2+"�Դϴ�.");
	}
}
