package MainPackage;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import GraphicalElementsPackage.GraphicalCircle;
import GraphicalElementsPackage.GraphicalShape;
import GraphicalElementsPackage.Square;
import GraphicalElementsPackage.Triangle;


public class Main extends JPanel {
	
	
	static Square square1;
	
	static Square square2;

	
	public void paintComponent(Graphics g) {
	   square1.Refresh(g);
	   square2.Refresh(g);
	   
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setTitle("Polygon");
      frame.setSize(1000, 1000);
      frame.setBackground(Color.white);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      Container contentPane = frame.getContentPane();
      contentPane.add(new Main());
      frame.setVisible(true);
      square1 = new Square(100,100,50,Color.BLUE);
      square2 = new Square(200,60,50,Color.RED);
      
      square2.MoveTo(0, 0);
      square2.MoveTo(500, 500);

     
      for (int i = 0; i < 20; i++)
      {
    	  try {
    	       
			Thread.sleep(100);
    	       }
    	     catch (InterruptedException e) {
    	       e.printStackTrace();
    	       }
      	  square2.MoveTo(i*5, i*5);
      	  square1.MoveTo(500-i*5,500- i*5);
      	    	  frame.repaint();
       
      }
      
     // square2.MoveTo(300, 60);
        
      //shapeList.add(square);
      //shapeList.add(triangle);
      //shapeList.add(circle);
      
   }
}