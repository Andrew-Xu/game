package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame
{
	public GameWindow()
	{
		super( "AYY LMAOO" );    
		initialize();
	}

	private void initialize()
	{
		JPanel layoutPanel = new JPanel();
		layoutPanel.setLayout( new FlowLayout() );
		//JButton lmao = new JButton();
		//layoutPanel.add( myTurtleController );
	        
		getContentPane().add( layoutPanel );
	        
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		pack();
		setSize( 500, 440 );
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setLocationRelativeTo( null );
		setVisible( true );
	}
}
