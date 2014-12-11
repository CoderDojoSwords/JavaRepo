package GraphicalElementsPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class GraphicalCircle extends GraphicalShape {

	int radius;
	
	public GraphicalCircle(int x, int y, int pRadius, Color pColor)
	{
		super(x,y,pColor);
		radius = pRadius;
	}
	
	public void Draw(Graphics g) {

		g.drawOval(centerX, centerY, radius, radius);
		g.setColor(color);
	}

}
