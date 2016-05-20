package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameWindow extends JFrame
{
	
	JTextField text = new JTextField("Press Return", 40);
	JTextField noEdit = new JTextField("Press Return", 40);


	
	public GameWindow()
	{
		
		
		super( "AYY LMAOO" );    
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		text = new JTextField(10);
		noEdit = new JTextField("Uneditable text field", 20);
		jtfUneditableText.setEditable(false);
		container.add(jtfText1);
		container.add(jtfUneditableText);
		handler = new TextHandler();
		jtfText1.addActionListener(handler);
		jtfUneditableText.addActionListener(handler);
		setSize(325, 100);
		setVisible(true);
		
		
		initialize();
		
		
		
	}
	
	
	
	
	private void initialize()
	{
		JPanel layoutPanel = new JPanel();
		layoutPanel.setLayout( new FlowLayout() );
		//JButton lmao = new JButton();
		//layoutPanel.add( myTurtleController );
	    
		
		 text.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        System.out.println("Enter pressed");
			    }
			});
		
		
		
		
		
		getContentPane().add( layoutPanel );
	        
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		pack();
		setSize( 800, 600 );
		//setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setLocationRelativeTo( null );
		setVisible( true );
	}
}
