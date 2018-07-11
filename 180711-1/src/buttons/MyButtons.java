package buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyButtons extends JFrame {
	JButton bt_create, bt_color, bt;
	JPanel p_north, p_center;
	int count = 1;
	
	ArrayList list = new ArrayList();// ���� �迭! ��ü�� �ٷ�� �� ũ�� ��þ��ص���~~!
	
	public MyButtons() {
		// TODO Auto-generated constructor stub
		bt_create = new JButton("�����");
		bt_color = new JButton("���ٲٱ�");
		
		p_north = new JPanel();
		p_center = new JPanel();
		
		p_north.add(bt_create);
		p_north.add(bt_color);
		
		add(p_north, BorderLayout.NORTH);
		add(p_center, BorderLayout.CENTER);
		
		bt_create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createBt();
			}
		});
		
		bt_color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor();
			}
		});
		
		setBounds(100,100,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setColor() {
		for(int i=0; i<list.size(); i++) {
			JButton bt = (JButton)list.get(i);
			bt.setBackground(Color.CYAN);
		}
		
	}

	public void createBt() {
		bt = new JButton(Integer.toString(count));
		list.add(bt); // ������ ���ؼ� Arraylist�� �߰�
		System.out.println("������� ������� ��ư ���� "+list.size());
		p_center.add(bt); // ������ bt�� �гο� ��´�.
		p_center.updateUI(); // 
		count++;
	}

	public static void main(String[] args) {
		new MyButtons();
	}

}
