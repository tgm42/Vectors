package com.vectors.object;

import java.awt.Color;
import java.awt.Graphics2D;

import com.vectors.vector.PVector2D;

public class Ball extends Actor
{
	private final double radius;

	public Ball(double radius)
	{
		this(radius, new PVector2D(0d, 0d));
	}

	public Ball(double radius, PVector2D location)
	{
		this.radius = radius;
		this.location = location;
	}

	@Override
	public void draw(Graphics2D canvas)
	{
		canvas.setPaint(Color.red);
		canvas.drawOval((int)location.getX(), (int)location.getY(), (int)(2 * radius), (int)(2 * radius));
		System.out.println(this);
	}

	@Override
	public String toString()
	{
		StringBuilder b = new StringBuilder();
		b.append("Location (");
		b.append(location.getX());
		b.append(", ");
		b.append(location.getY());
		b.append(")");
		return b.toString();
	}

}
