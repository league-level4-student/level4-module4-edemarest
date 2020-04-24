package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int circleCounter = 0;
	CircleMorph(int width, int height, int x, int y) {
		super(width, height, x, y);
	}

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		setX((int)(getX()+Math.cos(circleCounter)*100.0));
		setY((int)(getY()+Math.sin(circleCounter)*100.0));
		
		circleCounter++;

		//System.out.println("Width of blue poly: "+width+" Height: "+height+" X value of blue poly: "+x+" Y Value: "+y);
	}
	
}
