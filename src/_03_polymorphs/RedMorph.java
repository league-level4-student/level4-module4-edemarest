package _03_polymorphs;

	import java.awt.Color;
	import java.awt.Graphics;

	public class RedMorph extends Polymorph{

		RedMorph(int width, int height, int x, int y) {
			super(width, height, x, y);
		}

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
		}
		
	}


