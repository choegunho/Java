import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300, 200);
		setLocation(screenSize.width/2,screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setVisible(true);
		
		setLayout(new FlowLayout());//배치 관리자 설정!
		JButton button = new JButton("버튼");	//컴포넌트 생성 및 추가
		this.add(button);
		setVisible(true);
	}
}

