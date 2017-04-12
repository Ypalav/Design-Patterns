package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Triangle extends JPanel implements Runnable, Shapes {
	static int count = 0;
	Thread thread;
	int myId = 3;
	int time;
	int stateCheck = 0;
	static Triangle triangle = null;

	private Triangle() {
	}

	static synchronized Shapes getShape() {
		if (triangle == null) {
			triangle = new Triangle();
			return triangle;
		}
		return triangle;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void draw() {
		this.setBackground(new Color(255, 228, 181));
		repaint();
	}

	/*
	 * Creates a graphic object - Triangle with suitable animations. A state
	 * check is performed to apply the animations with a thread sleeping timer
	 * set.
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		count++;
		if (stateCheck == 0) {
			graphics.setColor(Color.GREEN);
			graphics.fillPolygon(new int[] { 50, 10, 90 }, new int[] { 20, 120, 120 }, 3);
			graphics.setColor(Color.MAGENTA);
			graphics.fillOval(38, 50, 10, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(38, 55, 6, 10);
			graphics.setColor(Color.MAGENTA);
			graphics.fillOval(52, 50, 10, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(52, 55, 6, 10);
			graphics.setColor(Color.BLACK);
			graphics.fillArc(20, 90, 60, 40, -180, -180);
			stateCheck = 1;
			thread = new Thread(this, "Triangle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		} else {
			graphics.setColor(Color.GREEN);
			graphics.fillPolygon(new int[] { 50, 10, 90 }, new int[] { 20, 120, 120 }, 3);
			graphics.setColor(Color.MAGENTA);
			graphics.fillOval(38, 50, 10, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(42, 55, 6, 10);
			graphics.setColor(Color.MAGENTA);
			graphics.fillOval(52, 50, 10, 20);
			graphics.setColor(Color.BLACK);
			graphics.fillOval(56, 55, 6, 10);
			graphics.setColor(Color.BLACK);
			graphics.fillArc(20, 90, 60, 40, -180, -180);
			stateCheck = 0;
			thread = new Thread(this, "Triangle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		}

	}

	@Override
	public void run() {

		if (count < 30) {
			this.setLocation(this.getX(), this.getY() + 1);
			repaint();
		} else {
			int random = new Random().nextInt(40) + 1;
			this.setLocation(this.getX(), this.getY() + random);
			repaint();
		}
	}
}
