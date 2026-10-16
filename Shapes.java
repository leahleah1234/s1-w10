/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      // g.setColor(Color.red);
      // g.fillOval(100, 100, 50, 50); 
      // g.setColor(Color.green); 
      // g.fillRect(200, 200, 25, 25); 
      this.drawBullsEye(g);
      this.olympicRings(g);
   }

   public void drawBullsEye(Graphics g) {
      g.setColor(Color.red);
      g.fillOval(100, 100, 50, 50); 
      g.setColor(Color.black);
      g.fillOval(105, 105, 40, 40);
      g.setColor(Color.red);
      g.fillOval(110, 110, 30, 30);
      g.setColor(Color.black);
      g.fillOval(115, 115, 20, 20); 
      g.setColor(Color.red);
      g.fillOval(120, 120, 10, 10);

   }

   public void olympicRings(Graphics g) {
      g.setColor(Color.blue);
      g.drawOval(100, 160, 50, 50);

      g.setColor(Color.black);
      g.drawOval(160, 160, 50, 50);

      g.setColor(Color.red);
      g.drawOval(220, 160, 50, 50);
      
      g.setColor(Color.yellow);
      g.drawOval(130, 180, 50, 50);
      
      g.setColor(Color.green);
      g.drawOval(190, 180, 50, 50);

   }

   public void trafficLight(Graphics g) {

   }


}
