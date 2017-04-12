package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Circle extends JPanel implements Shapes, Runnable {
	int status=0;
	int time;
	Thread thread;
	int myId = 2;
	int stateCheck = 0;
	static int count=0;
	private static final long serialVersionUID = 1L;
	static Circle circle = null;
	
	private Circle(){}
	
	@Override
	public void draw() {
		this.setBackground(new Color(255,228,181));
		repaint();
	}
	static synchronized Shapes getShape() {
		if (circle == null) {
			circle=new Circle();
			return circle;
		}
		return circle;
	}

	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	/*
	 * Creates a graphic object - Circle with suitable animations. A state check
	 * is performed to apply the animations with a thread sleeping timer set.
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		if (stateCheck == 0) {
			graphics.setColor(Color.ORANGE);
			graphics.fillOval(20, 20, 70, 100);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(32, 30, 20, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(37, 32, 10, 10);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(60, 30, 20, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(64, 32, 10, 10);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(30, 50, 50, 65);
			stateCheck = 1;
			thread = new Thread(this, "Circle");
			thread.start();
			try {
				thread.sleep(50);
			} catch (Exception e) {
			}
		}	else if(stateCheck==1) {
			graphics.setColor(Color.GREEN);
			graphics.fillOval(20, 20, 70, 100);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(32, 30, 20, 20);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(60, 30, 20, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(30, 50, 50, 65);
			thread = new Thread(this, "Circle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void run() {
		int random = new Random().nextInt(6) + 1;
		
		for (count=0;count<5;count++) {
			if(status==0){
			this.setLocation(this.getX(), this.getY() + 3);
			repaint();
			status=new Random().nextInt(2);
			}else if(status==1){
				this.setLocation(this.getX(), this.getY()+1);
				repaint();
				status=new Random().nextInt(2);
			}else{
				this.setLocation(this.getX(), this.getY()+random);
				repaint();
				status=new Random().nextInt(2);
			}
		}
		
	}

}
