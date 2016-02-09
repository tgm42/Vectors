package com.vectors.object;

import java.awt.Graphics2D;

import com.vectors.vector.PVector2D;

public abstract class Actor
{
	protected PVector2D location;
	protected PVector2D acceleration;
	protected PVector2D velocity;

	public abstract void draw(Graphics2D canvas);

	public void applyForce(PVector2D force)
	{
		acceleration = acceleration == null ? new PVector2D(0, 0) : acceleration;
		acceleration = acceleration.add(force);
	}

	public void update()
	{
		location = location.add(acceleration);
		acceleration = new PVector2D(0, 0);
	}

	public PVector2D getLocation()
	{
		return location;
	}

	public PVector2D getVelocity()
	{
		return velocity;
	}
}
