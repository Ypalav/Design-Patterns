package com.oodp.assign1;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shapes> shapes = new HashMap<String, Shapes>();

	public static Shapes getShape(String shape) {
		Shapes concreteShape = (Shapes) shapes.get(shape);

		if (concreteShape == null) {
			if (shape.equalsIgnoreCase("leftPathWay")) {
				concreteShape = LeftPathwayDecorator.getShape();
			} else if (shape.equalsIgnoreCase("rectangle")) {
				concreteShape = Rectangle.getShape();
			} else if (shape.equalsIgnoreCase("circle")) {
				concreteShape = Circle.getShape();
			} else if (shape.equalsIgnoreCase("triangle")) {
				concreteShape = Triangle.getShape();
			} else if (shape.equalsIgnoreCase("3drectangle")) {
				concreteShape = Rectangle3D.getShape();
			} else if (shape.equalsIgnoreCase("pentagon")) {
				concreteShape = Pentagon.getShape();
			} else if (shape.equalsIgnoreCase("rightPathWay")) {
				concreteShape = RightPathwayDecorator.getShape();
			}
			shapes.put(shape, concreteShape);
		}
		return concreteShape;
	}
}
