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
		System.out.println("텔레비전의 채널은 "+channel+"볼륨은 "+volume+"입니다."); 
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

