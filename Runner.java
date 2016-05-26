package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import minigames.*;
import senioritis.*;
import subjects.*;

public class Runner 
{
	static Button b;
	static boolean litFirst;
    public static void main( String[] args )
    {
    	boolean yesnogo = false;
    	GameWindow theGameWindow = new GameWindow();
    	b = new Button("Click me to begin!");
		b.setFont(new Font("Arial", Font.PLAIN, 80));
        theGameWindow.add(b);
        b.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e) 
			{
	        	theGameWindow.startIntroScreen();
	       	 	int reply = JOptionPane.showConfirmDialog(null, "Would you like to take the AP Literature test first?", "Pick your poison:", JOptionPane.YES_NO_OPTION);
	            if (reply == JOptionPane.YES_OPTION)
	            {
	            	theGameWindow.remove(b);
	           	 	theGameWindow.isIntroOver();
	           	 	litFirst = true;
	           	 	System.out.println("ok so lit");
	            }
	            else
	            {
	            	theGameWindow.remove(b);
	            	theGameWindow.dispose();
	            	GameCanvas game = new GameCanvas();
	            	game.loop();
	            	litFirst = false;
	            }
	    	}
	    });
        while(!yesnogo)
        {
          if(litFirst)
          {
              yesnogo = theGameWindow.advance();
          }
          else
          {
        	  
          }
          try 
  		{	  Thread.sleep(4000); }
  		catch(InterruptedException ex)
  		{ Thread.currentThread().interrupt();}

        }
            System.out.println("ok so lit finished");

    	
    }
}
