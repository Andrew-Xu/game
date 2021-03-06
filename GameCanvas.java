package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameCanvas extends JPanel
{
	public String myName;
	public int addX = 0;
	public int addY = 0;
	public String addDisplay = "";
	public String display = "";
	
	/*BufferedImage myPicture = ImageIO.read(new File("path-to-file"));
	JLabel picLabel = new JLabel(new ImageIcon(myPicture));
	add(picLabel);*/

	public GameCanvas(String name, String input)
	{
		myName = name;
		System.out.println("Name: " + myName);
		addDisplay = input;
	}
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		/*g2d.fillOval(0, 0, 30, 30);
		g2d.drawOval(0+addX, 50+addY, 30, 30);		
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);*/
        int fontSize = 20;
        Font f = new Font("Comic Sans MS", Font.ITALIC, fontSize);
        g2d.setFont(f);
		g2d.drawString(display, 25, 25);
	}
	public void runAnimation()
	{
		for (int i = 0; i < 6; i++)
		{
			try{Thread.sleep(20);}
			catch(InterruptedException ex) {}
			if (i % 2 == 0)
			{
				addY += 40;
				addX += 30;
			}
			else
			{
				addY -= 30;
				addX -= 20;
			}
			display += addDisplay.substring(i,i+1);
			//display += "wow";
			repaint();
		}
	}
}
