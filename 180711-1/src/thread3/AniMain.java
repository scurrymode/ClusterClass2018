package thread3;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AniMain extends JFrame implements Runnable{

	JButton bt;
	Canvas can;
	int x, y;
	Thread thread;
	
	public AniMain() {
		thread = new Thread(this);
		
		bt = new JButton("물체이동");
		add(bt, BorderLayout.NORTH);
		
		can = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawOval(x,y, 50, 50);
			}
		};
		
		can.setBackground(Color.GRAY);
		
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
	
	public static void main(String[] args) {
		new AniMain();

	}

}
