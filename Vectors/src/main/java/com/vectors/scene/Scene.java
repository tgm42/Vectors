package com.vectors.scene;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;

import com.vectors.object.Actor;
import com.vectors.object.Ball;
import com.vectors.vector.PVector2D;

public class Scene extends Frame
{
	private static final long serialVersionUID = -3701983605518195712L;

	private final Collection<Actor> actors = new ArrayList<Actor>();


	public Scene(final Dimension dimensions)
	{
		this.setSize(dimensions);
	}

	@Override
	public void paint(Graphics g)
	{
		for (Actor actor: actors)
		{
			actor.applyForce(new PVector2D(1, 0));
			actor.update();
			actor.draw((Graphics2D)g);
		}

		super.paint(g);
	}

	public boolean addActor(final Actor actor)
	{
		return this.actors.add(actor);
	}

	public boolean removeActor(final Actor actor)
	{
		return this.actors.remove(actor);
	}


	public static void main(String args[])
	{
		Scene scene = new Scene(new Dimension(400, 400));
		scene.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		PVector2D ballLocation = new PVector2D(200, 200);
		Ball ball = new Ball(100, ballLocation);
		scene.addActor(ball);
		scene.setVisible(true);
	}


}
