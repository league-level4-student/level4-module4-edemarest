package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowMorph extends Polymorph{

	FollowMorph(int width, int height, int x, int y) {
		super(width, height, x, y);
	}
	public void update(int x2, int y2) {
		setX(x2);
		setY(y2);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
	}
	
}