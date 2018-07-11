package progressbar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarTest extends JFrame {
	JProgressBar bar;
	JButton bt;
	int count;
	
	public ProgressBarTest() {
		setLayout(new FlowLayout());
		bar = new JProgressBar();
		bt = new JButton("�۵�");
		
		bar.setPreferredSize(new Dimension(450, 40));
		
		add(bar);
		add(bt);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count+=10;
				bar.setValue(count);
			}
		});
		
		setSize(500,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProgressBarTest();
	}

}
