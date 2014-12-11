package GraphicalElementsPackage;


import java.awt.*;




public class GraphicalPolygon extends GraphicalShape {

	int numberOfSides;
	
	int radius;
	
	public GraphicalPolygon(int x, int y, int pRadius, Color pColor)
	{
		super(x,y,pColor);
		radius = pRadius;
		
	}

	
	
	public void Show(Graphics g) {
	      g.setColor(color);
	      DrawShape(g);

 	   }
	
	public void Hide(Graphics g) {
	      g.setColor(Color.white);
	      DrawShape(g);
	}

	void DrawShape(Graphics g)
	{
        Polygon p = new Polygon();
	      for (int i = 0; i < numberOfSides; i++)
	      p.addPoint((int) 
	      (centerX + radius * Math.cos(i * 2 * Math.PI / numberOfSides)),
	      (int) (centerY + radius * Math.sin(i * 2 * Math.PI / numberOfSides)));
	      g.drawPolygon(p);
		
		
	}

	
}
	