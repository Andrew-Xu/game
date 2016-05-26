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
    public String display = "";
    public String addDisplay = "";
    minigames.MGLit test = new MGLit();//MGLit Test
    
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
            
	    textField.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
			{
	            if (pressed)
	            {
	            	System.out.println("You wrote this: " + textField.getText());
	            	
	               	textL.setText(textL.getText()+ "\n" + test.getResults(test.checkText(textField.getText())));
	            }
	    	}
	    });
		setLocationRelativeTo( null );
		setVisible( true );
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
