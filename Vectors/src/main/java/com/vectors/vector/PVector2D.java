package com.vectors.vector;

public class PVector2D
{
	private final double x;
	private final double y;

	public PVector2D(final double x, final double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean result = this == obj;

		if (!result && obj != null && obj instanceof PVector2D)
		{
			PVector2D other = (PVector2D)obj;
			result = this.x == other.x && this.y == other.y;
		}
		return result;
	}

	@Override
	public int hashCode()
	{
		int hash = (int)(7 * this.x + 31 * this.y);
		return super.hashCode();
	}

	public PVector2D add(PVector2D addend)
	{
		return new PVector2D(x + addend.getX(), y + addend.getY());
	}

	public double getMagnitude()
	{
		return Math.sqrt(x * x + y * y);
	}

	public PVector2D divide(double dividend)
	{
		return new PVector2D(x / dividend, y / dividend);
	}

	public PVector2D normalize()
	{
		return divide(getMagnitude());
	}
}
