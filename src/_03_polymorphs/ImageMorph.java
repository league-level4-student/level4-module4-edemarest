package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class ImageMorph extends Polymorph{

	ImageMorph(int width, int height, int x, int y) {
		super(width, height, x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		//System.out.println("Width of blue poly: "+width+" Height: "+height+" X value of blue poly: "+x+" Y Value: "+y);
	}
	
}
