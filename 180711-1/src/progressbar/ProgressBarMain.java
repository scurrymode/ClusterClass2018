package progressbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarMain extends JFrame{
	JProgressBar b1, b2, b3;
	JButton bt;
	
	public ProgressBarMain() {
		setLayout(new FlowLayout());
		
		b1 = new JProgressBar();
		b2 = new JProgressBar();
		b3 = new JProgressBar();
		bt = new JButton("¿€µø");
		
		b1.setPreferredSize(new Dimension(450, 50));
		b2.setPreferredSize(new Dimension(450, 50));
		b3.setPreferredSize(new Dimension(450, 50));
		
		b1.setForeground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.RED);
		
		add(b1);
		add(b2);
		add(b3);
		add(bt);
		
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ProgressThread t1 = new ProgressThread(b1, 20);
				ProgressThread t2 = new ProgressThread(b2, 10);
				ProgressThread t3 = new ProgressThread(b3, 40);	
			}
		});
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ProgressBarMain();
	}

}










