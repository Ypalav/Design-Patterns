package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

/*
 * Class implements Shapes so that it can define all functionalities of shapes. 
 * Runnable interface is used to introduce multi-threading, which is required for Race
 */
public class Pentagon extends JPanel implements Runnable, Shapes {
	static int count = 0;
	Thread thread;
	int myId = 5;
	int stateCheck = 0;
	static Pentagon pentagon = null;

	private Pentagon() {
	}

	static synchronized Shapes getShape() {
		if (pentagon == null) {
			pentagon=new Pentagon();
			return pentagon;
		}
		return pentagon;
	}

	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	@Override
	public void draw() {
		this.setBackground(new Color(255, 228, 181));
		// TODO Auto-generated method stub
		repaint();
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		// using state check logic, animation is performed
		count++;
		if (stateCheck == 0) {
			graphics.setColor(Color.DARK_GRAY);
			graphics.fillPolygon(new int[] { 50, 1, 30, 100, 125 }, new int[] { 20, 60, 120, 120, 60 }, 5);
			graphics.setColor(Color.WHITE);
			graphics.fillArc(35, 50, 15, 40, -180, -180);
			graphics.setColor(Color.WHITE);
			graphics.fillArc(85, 50, 15, 40, -180, -180);
			graphics.setColor(Color.BLUE);
			graphics.fillRect(50, 85, 40, 30);
			stateCheck = 1;
			thread = new Thread(this, "Pentagon");
			thread.start();
			try {
				thread.sleep(50);
			} catch (Exception e) {
			}
		} else {
			graphics.setColor(Color.DARK_GRAY);
			graphics.fillPolygon(new int[] { 50, 1, 30, 100, 125 }, new int[] { 20, 60, 120, 120, 60 }, 5);
			graphics.setColor(Color.DARK_GRAY);
			graphics.fillArc(35, 50, 15, 40, -180, -180);
			graphics.setColor(Color.DARK_GRAY);
			graphics.fillArc(85, 50, 15, 40, -180, -180);
			graphics.setColor(Color.BLUE);
			graphics.fillRect(50, 85, 40, 30);
			stateCheck = 0;
			thread = new Thread(this, "Pentagon");
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
		if (count < 20) {
			this.setLocation(this.getX(), this.getY() + random);
			repaint();
		} else {
			random = new Random().nextInt(40) + 1;
			this.setLocation(this.getX(), this.getY() + random);
			repaint();
		}
	}
}
