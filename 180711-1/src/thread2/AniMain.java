package thread2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class AniMain extends JFrame {
	JButton bt;
	Canvas can;
	int x, y;
	Thread thread;
	
	public AniMain() {
		// TODO Auto-generated constructor stub
		thread = new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					move();
				}
			}
		};
		
		bt = new JButton("물체이동");
		add(bt, BorderLayout.NORTH);
		can = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawRect(x, y, 50, 50);
			}
		};
		can.setBackground(Color.pink);
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread.start();
			}
		});
		
		add(can);
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void move() {
		x+=5;
		can.repaint();
	}

	public static void main(String[] args) {
		new AniMain();

	}

}
