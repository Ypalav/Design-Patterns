package com.oodp.assign1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Rectangle extends JPanel implements Shapes, Runnable {

	/**
	 * 
	 */
	static Rectangle rect = null;
	Thread thread;
	int myId = 1;
	int stateCheck = 0;
	static int i = 0;
	private static final long serialVersionUID = 1L;

	private Rectangle() {
	}

	static synchronized Shapes getShape() {
		if (rect == null) {
			rect = new Rectangle();
			return rect;
		}
		return rect;
	}

	@Override
	public void draw() {
		// this.setBackground(Color.BLACK);
		this.setBackground(new Color(255, 228, 181));
		repaint();
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/*
	 * Creates a graphic object - Rectangle with suitable animations. A state
	 * check is performed to apply the animations with a thread sleeping timer
	 * set.
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		i++;
		if (stateCheck == 0) {
			graphics.setColor(Color.BLUE);
			graphics.fillRect(20, 20, 100, 100);
			graphics.setColor(Color.PINK);
			graphics.fillOval(30, 30, 15, 30);
			graphics.setColor(Color.PINK);
			graphics.fillOval(95, 30, 15, 30);
			graphics.setColor(Color.RED);
			graphics.fillRect(30, 65, 80, 50);
			stateCheck = 1;
			thread = new Thread(this, "Rectangle");
			thread.start();
			try {
				thread.sleep(50);
			} catch (Exception e) {
			}
		} else {
			graphics.setColor(Color.BLACK);
			graphics.fillRect(20, 20, 100, 100);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(30, 30, 15, 30);
			graphics.setColor(Color.RED);
			graphics.fillOval(95, 30, 15, 30);
			graphics.setColor(Color.PINK);
			graphics.fillArc(40, 50, 60, 60, 180, 180);
			stateCheck = 0;
			thread = new Thread(this, "Rectangle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void run() {
		if (i < 15) {
			int random = new Random().nextInt(6) + 1;
			this.setLocation(this.getX(), this.getY() + random);
			repaint();

		} else {
			if (stateCheck == 0) {
				int random = new Random().nextInt(25) + 1;
				this.setLocation(this.getX() + 22, this.getY() + random);
				repaint();
			} else {
				int random = new Random().nextInt(25) + 1;
				this.setLocation(this.getX() - 22, this.getY() + random);
				repaint();

			}
		}
	}
}