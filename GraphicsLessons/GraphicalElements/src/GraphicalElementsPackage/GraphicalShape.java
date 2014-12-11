package GraphicalElementsPackage;

import java.awt.Color;
import java.awt.Graphics;

public class GraphicalShape {

	protected int centerX = 0;
	protected int centerY = 0;
	protected boolean hasChanged;

	protected Color color;

	GraphicalShape(int x, int y, Color pColor) {

		centerX = x;
		centerY = y;
		color = pColor;
		hasChanged = false;
	}

	public void Refresh(Graphics g) {
		Hide(g);
		Show(g);
		hasChanged = false;
	}
	
	
	public void Show(Graphics g) {
	}

	public void Hide(Graphics g) {
	}

	public void MoveTo(int x, int y) {

		if (x != centerX || y != centerY)
			hasChanged = true;
		else
			hasChanged = false;
		centerX = x;
		centerY = y;

	}

}
