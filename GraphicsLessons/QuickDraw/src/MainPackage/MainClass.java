package MainPackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainClass extends JPanel {
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Polygon square = new Polygon();
      for (int i = 0; i < 5; i++)
      square.addPoint((int) 
      (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
      (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));
      g.setColor(Color.RED);
      g.drawPolygon(square);
      
      Polygon triangle = new Polygon();
      for (int i = 0; i < 3; i++)
    	  triangle.addPoint((int) 
      (60 + 50 * Math.cos(i * 2 * Math.PI / 5)),
      (int) (60 + 50 * Math.sin(i * 2 * Math.PI / 5)));
      g.setColor(Color.BLUE);

      g.drawPolygon(triangle);

      
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setTitle("Polygon");
      frame.setSize(350, 250);
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      Container contentPane = frame.getContentPane();
      contentPane.add(new MainClass());
      frame.setVisible(true);
   }
}