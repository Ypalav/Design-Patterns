package com.oodp.assign1;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


/*
 * Main function which creates a Main Frame and adds different Shapes of objects for 
 * racing among objects.
 */
public class Race {
	
	private static final String shapes[] = { "leftPathWay", "rectangle",
			"circle", "triangle", "3drectangle", "pentagon", "rightPathWay" };
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome to the Racing of CSP-585");
		frame.setSize(2000, 2000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(1, 7, 0, 10));
		
		try {
			container.setBackground(new Color(255, 228, 181));
			for (int i = 0; i < shapes.length; ++i) {
				container.add((Component) getShapes(ShapeFactory.getShape(shapes[i])));
			}
			frame.add(container);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// adding a separator between objects so it will create a horizontal line.
	public static JSeparator getSeparator() {
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setSize(10, 2000);
		return separator;

	}

	/*
	 * uses Polymorphic concept. Takes Shapes as an argument to method, so it
	 * can receive any objects whose class extends Shapes Interface.
	 */
	public static Shapes getShapes(Shapes shapes) {
		shapes.draw();
		return shapes;
	}

}
