package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/*
 * Class implements Shapes so that it can define all functionalities of shapes. 
 * Runnable interface is used to introduce multi-threading, which is required for Race
 */
public class Rectangle3D extends JPanel implements Runnable, Shapes {

	Thread thread;
	int myId = 4;
	int time;
	int stateCheck = 0;
	static Rectangle3D rectangle3d = null;

	private Rectangle3D() {
	}

	static synchronized Shapes getShape() {
		if (rectangle3d == null) {
			rectangle3d = new Rectangle3D();
			return rectangle3d;
		}
		return rectangle3d;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		this.setBackground(new Color(255, 228, 181));
		repaint();// calls paintComponent to draw an object
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		// using state check logic, animation is performed
		if (stateCheck == 0) {
			graphics.setColor(Color.CYAN);
			graphics.draw3DRect(20, 20, 100, 100, false);
			graphics.setColor(Color.RED);
			graphics.fillRect(25, 30, 25, 20);
			graphics.setColor(Color.RED);
			graphics.fillRect(90, 30, 25, 20);
			graphics.setColor(Color.WHITE);
			graphics.fillOval(46, 60, 50, 50);
			stateCheck = 1;
			thread = new Thread(this, "Rectangle3D");
			thread.start();
			try {
				thread.sleep(50);
			} catch (Exception e) {
			}
		} else {
			graphics.setColor(Color.CYAN);
			graphics.draw3DRect(20, 20, 100, 100, false);
			graphics.setColor(Color.GRAY);
			graphics.fillRect(25, 30, 25, 20);
			graphics.setColor(Color.GRAY);
			graphics.fillRect(90, 30, 25, 20);
			graphics.setColor(Color.GREEN);
			graphics.fillOval(46, 60, 50, 50);
			graphics.setColor(Color.BLACK);
			graphics.fillArc(55, 40, 30, 70, 180, 180);
			stateCheck = 0;
			thread = new Thread(this, "Rectangle3D");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// Using Random number,by seeding the translation of object randomly.
		int random = new Random().nextInt(6) + 1;
		this.setLocation(this.getX(), this.getY() + random);
		for (;;) {
			repaint();
		}
	}
}
