
package gui;

import minigames.*;
import senioritis.*;
import subjects.*;

public class Runner 
{
	private static GameWindow theGameWindow;
    public static void main( String[] args )
    {
    	boolean check1 = false;
    	boolean check2 = false;
    	boolean check3 = false;
    	theGameWindow = new GameWindow();
    	theGameWindow.startIntroScreen();
    	if (theGameWindow.isIntroOver())
    	{
    		theGameWindow.startTextGame();
    	}
    	if (theGameWindow.isTextGameOver())
    	{
    		
    	}
    	//theGameWindow.startMapGame();
        System.out.println("\nayy lmao");
        

    }
}
/*TurtleProgram tp = new TurtleProgram();
tp.addAction( new TurnRight( 120 ) );
tp.addAction( new MoveForward( 100 ) );
tp.addAction( new MoveBack( 50 ) );
tp.addAction( new TurnLeft( 90 ) );
System.out.println( tp );*/
