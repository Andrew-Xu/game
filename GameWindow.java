package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;

import minigames.MGLit;

public class GameWindow extends JFrame implements WindowListener, ActionListener
{
    TextField textField = new TextField(35);
    private boolean pressed = true;
    public String endScore = "";
    public String addDisplay = "";
    minigames.MGLit test = new MGLit();//MGLit Test
    boolean introOver = false;
    boolean textGameOver = false;
    public boolean moveOn = false;
    Button b;
    
    public GameWindow()
	{
		super( "Senioritis" );
		
		initialize();
	}

	private void initialize()
	{
		//JPanel layoutPanel = new JPanel();
		//layoutPanel.setLayout( new FlowLayout() );
		setSize(800, 600);
		setVisible(true);
	}
	
	public void startIntroScreen()
	{
		b = new Button("Click me to begin!");
		b.setFont(new Font("Arial", Font.PLAIN, 80));
        add(b);
        b.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e) 
			{
	    		
	    	}
	    });
	}
	
	public void isIntroOver()
	{
		dispose();
		introOver = true;
		this.remove(b);
		//JOptionPane.showMessageDialog(this, "Get ready to type!");
		startTextGame();
	}
		
	public void startTextGame()
	{
		setLayout(new FlowLayout());
		addWindowListener(this);
		String s = "";
		TextField text = new TextField("Type the letters and then press Enter.", 60);
		TextArea textL = new TextArea(s, 5, 100);
	    add(text);
		add(textField);
	    add(textL);
	    text.setEditable(false);
	    textL.setEditable(false);
    	s = test.randTextGen(20);
    	textL.setText(s);
   
            
	    textField.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
			{
	            if (pressed)
	            {
	            	System.out.println("You wrote this: " + textField.getText());
	            	
	               	textL.setText("Calculating score...");
	               	endScore = test.getResults(test.checkText(textField.getText()));
	               	
	               	try 
	        		{
	               		advance();
	        			System.out.println("Will show results in 5 seconds");
	        			remove(text);
	        			remove(textField);
	        		    remove(textL);
	        			Thread.sleep(5000);
	        			repaint();
	        	
	        		    
	        		    
	        		    
	        		}
	        		catch(InterruptedException ex)
	        		{
	        		    Thread.currentThread().interrupt();
	        		}
	        	}
	    	}
	    });
		setLocationRelativeTo( null );
		setVisible( true );
	}
	
	public boolean advance()
	{
		return moveOn;
	}
	
	public boolean isTextGameOver()
	{ 
		textGameOver = true;
		return textGameOver; 
	}
	
	public void startMapGame()
	{
		this.add(new JLabel(new ImageIcon("magic.png")));
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
			Font f = new Font("Arial", Font.PLAIN, 40);
			g2d.setFont(f);
			g2d.drawString(endScore, 30, 170);
		
	}
	
    public void actionPerformed(ActionEvent e) {}
    public void windowClosing(WindowEvent e) 
    {
            dispose();
            System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
