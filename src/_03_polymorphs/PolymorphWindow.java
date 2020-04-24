package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingPoly;
    ArrayList<Polymorph> ms = new ArrayList<Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 System.out.println("Creating new polymorphs");
   	 ms.add(new BluePolymorph(new Random().nextInt(WIDTH), new Random().nextInt(HEIGHT),10, 10));
     ms.add(new RedMorph(new Random().nextInt(WIDTH), new Random().nextInt(HEIGHT),10, 10));
     ms.add(new MovingMorph(new Random().nextInt(200), new Random().nextInt(200),50, 50));
     ms.add(new CircleMorph(200, 200, 10, 10));
     ms.add(new FollowMorph(200,200,10,10));
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < ms.size(); i++) {
   	  	 ms.get(i).draw(g);
   	 }
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(int i = 0; i < ms.size(); i++) {
  	  	 ms.get(i).update();
  	 }
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		ms.get(ms.size()-1).update(e.getX(), e.getY());
	}
}
