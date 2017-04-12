package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RightPathwayDecorator extends JPanel implements Shapes {

	private static final long serialVersionUID = 1L;
	private Image bush, brownCar, column, boulder3, truck, semi, stump, cactus, palmTree;
	static RightPathwayDecorator rightPathwayDecorator = null;

	private RightPathwayDecorator() {
		bush = new ImageIcon("images/bush2.png").getImage();
		brownCar = new ImageIcon("images/car04.png").getImage();
		column = new ImageIcon("images/column.png").getImage();
		boulder3 = new ImageIcon("images/boulder3.png").getImage();
		truck = new ImageIcon("images/truck.png").getImage();
		semi = new ImageIcon("images/semi.png").getImage();
		stump = new ImageIcon("images/stump.png").getImage();
		cactus = new ImageIcon("images/cactus.png").getImage();
		palmTree = new ImageIcon("images/palm_tree.png").getImage();
	}

	static synchronized Shapes getShape() {
		if (rightPathwayDecorator == null) {
			rightPathwayDecorator = new RightPathwayDecorator();
			return rightPathwayDecorator;
		}
		return rightPathwayDecorator;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public void draw() {
		repaint();
	}

	public void paintComponent(Graphics graphics) {
		graphics.setColor(new Color(255, 255, 204));
		graphics.fillRect(0, 0, 192, 2000);
		graphics.drawImage(palmTree, 1, 1, 100, 150, this);
		graphics.drawImage(palmTree, 1, 45, 100, 150, this);
		graphics.drawImage(palmTree, 1, 75, 100, 150, this);
		graphics.drawImage(palmTree, 1, 95, 100, 150, this);

		graphics.drawImage(brownCar, 110, 65, 70, 90, this);

		graphics.drawImage(column, 110, 500, 70, 200, this);

		graphics.drawImage(truck, 20, 600, 70, 90, this);

		graphics.drawImage(boulder3, 10, 250, 110, 100, this);

		graphics.drawImage(cactus, 10, 340, 90, 90, this);
		graphics.drawImage(cactus, 5, 355, 90, 90, this);

		graphics.drawImage(semi, 100, 395, 70, 80, this);

	}

}
