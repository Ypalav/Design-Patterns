package com.oodp.assign1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LeftPathwayDecorator extends JPanel implements Shapes {

	private static final long serialVersionUID = 1L;
	private Image tree, boulder2, car01, bush1, boulder1, car03, semi, stump, cactus;
	static LeftPathwayDecorator leftPathwayDecorator = null;

	private LeftPathwayDecorator() {
		tree = new ImageIcon("images/tree1.png").getImage();
		boulder2 = new ImageIcon("images/boulder2.png").getImage();
		car01 = new ImageIcon("images/car01.png").getImage();
		bush1 = new ImageIcon("images/bush1.png").getImage();
		boulder1 = new ImageIcon("images/boulder1.png").getImage();
		car03 = new ImageIcon("images/car03.png").getImage();
		semi = new ImageIcon("images/player_left.png").getImage();
		stump = new ImageIcon("images/stump.png").getImage();
		cactus = new ImageIcon("images/cactus.png").getImage();
	}

	static synchronized Shapes getShape() {
		if (leftPathwayDecorator == null) {
			leftPathwayDecorator = new LeftPathwayDecorator();
			return leftPathwayDecorator;
		}
		return leftPathwayDecorator;
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
		graphics.drawImage(semi, 10, 10, 80, 90, this);
		graphics.drawImage(tree, 95, 1, 100, 150, this);
		graphics.drawImage(tree, 95, 80, 100, 150, this);
		graphics.drawImage(tree, 97, 120, 100, 150, this);
		graphics.drawImage(tree, 100, 160, 100, 150, this);
		graphics.drawImage(tree, 95, 210, 100, 150, this);
		graphics.drawImage(tree, 96, 270, 100, 150, this);
		graphics.drawImage(tree, 98, 320, 100, 150, this);

		graphics.drawImage(boulder2, 10, 150, 50, 60, this);
		graphics.drawImage(car01, 20, 300, 80, 90, this);
		graphics.drawImage(bush1, 130, 500, 60, 70, this);
		graphics.drawImage(bush1, 135, 550, 60, 70, this);
		graphics.drawImage(bush1, 132, 600, 60, 70, this);
		graphics.drawImage(bush1, 131, 650, 60, 70, this);
		graphics.drawImage(bush1, 134, 700, 60, 70, this);
		graphics.drawImage(boulder1, 10, 400, 70, 90, this);

		graphics.drawImage(car03, 10, 590, 90, 100, this);

	}

}
