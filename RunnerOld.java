package gui;

import minigames.*;
import senioritis.*;
import subjects.*;

public class Runner 
{
	private static GameWindow theGameWindow;
    public static void main( String[] args )
    {
    	theGameWindow = new GameWindow();
        System.out.println("\nayy lmao");
        
        UserInput uIn = new UserInput();
        uIn.receiveInput();
    }
}
/*TurtleProgram tp = new TurtleProgram();
tp.addAction( new TurnRight( 120 ) );
tp.addAction( new MoveForward( 100 ) );
tp.addAction( new MoveBack( 50 ) );
tp.addAction( new TurnLeft( 90 ) );
System.out.println( tp );*/
