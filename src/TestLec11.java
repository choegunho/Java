import java.io.IOException;

public class TestLec11 {
	public  static void main(String[] args) {
		try {
		 System.out.println(readString());
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�:");
		//System.in.read(buf);
		throw IOException;
		return new String(buf);
	}
}