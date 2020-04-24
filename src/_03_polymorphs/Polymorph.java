package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
//* 1. Make the member variable private (or protected)
//* 
//* 2. Make a getter and setter method (accessor and mutator) for the variable.
//* 
//* 3. Add restrictions to the setter method so the member variable cannot be 
//* 	  adversely altered
public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    BufferedImage dragon = new BufferedImage(100, 100, 10);
    Polymorph(int x, int y, int width, int height){
   	 this.setX(x);
   	 this.setY(y);
   	 this.setWidth(width);
   	 this.setHeight(height);
    }
    
    public void update(){
   	 
    }
    public void update(int x2, int y2) {
    	
    }
    
    public abstract void draw(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
