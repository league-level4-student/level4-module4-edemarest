package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	CircleMorph(int width, int height, int x, int y) {
		super(width, height, x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		x+=Math.sin(x);
		y+=Math.cos(y);
		//System.out.println("Width of blue poly: "+width+" Height: "+height+" X value of blue poly: "+x+" Y Value: "+y);
	}
	
}
