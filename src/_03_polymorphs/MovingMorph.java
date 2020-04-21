package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int width, int height, int x, int y) {
		super(width, height, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		boolean up = true;
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		if(y == 600) {
			up = false;
		}
		else if(y==0) {
			up = true;
		}
		if(up) {
			y++;
		}
		else {
			y--;
		}
	}

}
