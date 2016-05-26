package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import minigames.MGLit;

public class GameWindow extends Frame implements WindowListener, ActionListener
{
    TextField textField = new TextField(35);
    private boolean pressed = true;
    public String display = "AHHHHHH";
    public String addDisplay = "";
    minigames.MGLit test = new MGLit();//MGLit Test
    boolean introOver = false;
    boolean textGameOver = false;
    Button b;
    
    public GameWindow()
	{
		super( "AYY LMAOO" );    
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
	    		isIntroOver();
	    	}
	    });

	}
	
	public void isIntroOver()
	{
		dispose();
		introOver = true;
		this.remove(b);
		startTextGame();
	}
		
	public void startTextGame()
	{
		setLayout(new FlowLayout());
		addWindowListener(this);
		String s = test.randTextGen(5);
		addDisplay = s;
		TextField text = new TextField("Type the letters and then press Enter.", 60);
		TextArea textL = new TextArea(s, 5, 100);
	    add(text);
		add(textField);
	    add(textL);
	    text.setEditable(false);
	    textL.setEditable(false);
            
	    textField.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
			{
	            if (pressed)
	            {
	            	System.out.println("You wrote this: " + textField.getText());
	            	
	               	textL.setText(textL.getText()+ "\n" + test.getResults(test.checkText(textField.getText())));
	               	
	               	try 
	        		{
	        			System.out.println("MapGame starting in 5 seconds");
	        		    Thread.sleep(5000);
	        		    dispose();
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
	
	public boolean isTextGameOver()
	{ 
		textGameOver = true;
		return textGameOver; 
	}
	
	public void startMapGame()
	{
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		if (!introOver)
		{
			g2d.setColor(Color.RED);
			int fontSize = 20;
			Font f = new Font("Comic Sans MS", Font.ITALIC, fontSize);
			g2d.setFont(f);
			g2d.drawString("TextGame starting in 5 seconds", 60, 60);
		}
		else if (!textGameOver)
		{
			g2d.setColor(Color.BLACK);
			int fontSize = 20;
			Font f = new Font("Comic Sans MS", Font.ITALIC, fontSize);
			g2d.setFont(f);
			g2d.drawString("MapGame starting in 5 seconds", 60, 60);
		}
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
