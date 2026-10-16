import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {

    private int xClick = -11;
	private int yClick = -11; 

    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }

	public void paintComponent(Graphics g) {
		if(xClick != -11 && yClick != -11)
			g.setColor(Color.red);
			g.fillOval(xClick - 50, yClick - 50, 100, 100);

	}
    
    public void mouseClicked (MouseEvent event) {
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();

	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
