public class Television {
	private int channel;
	private int volume;
	private boolean OnOff;
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		OnOff = o;
	}
	
	void print() {
		System.out.println("�ڷ������� ä���� "+channel+"������ "+volume+"�Դϴ�."); 
	}
	
	int getChannel() {
		return channel;
	}
	int add(int x, int y) {
		return x+y;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}

