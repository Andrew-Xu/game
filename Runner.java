package gui;
import minigames.*;
import senioritis.*;
import subjects.*;

public class Runner 
{
	private static GameWindow theGameWindow;
    public static void main( String[] args )
    {
    	minigames.MGLit test = new MGLit();
        String s = test.randTextGen(100);     
        theGameWindow = new GameWindow();
        System.out.println("\n" + "ayy lmao");
        GameCanvas great = new GameCanvas("memes",s);
        theGameWindow.add(great);
        great.runAnimation();
        
         // test for MGLit
    }
}
/*TurtleProgram tp = new TurtleProgram();
tp.addAction( new TurnRight( 120 ) );
tp.addAction( new MoveForward( 100 ) );
tp.addAction( new MoveBack( 50 ) );
tp.addAction( new TurnLeft( 90 ) );
System.out.println( tp );*/
