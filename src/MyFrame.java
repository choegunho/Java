import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(e->{
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}	
	/*private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}*/

}

