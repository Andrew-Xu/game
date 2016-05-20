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
        String s = test.randTextGen(6);
        theGameWindow = new GameWindow();
        System.out.println("\n" + "ayy lmao");
        GameCanvas great = new GameCanvas("memes",s);
        theGameWindow.add(great);
        great.runAnimation();
        
        UserInput uIn = new UserInput();
        uIn.receiveInput();
        if (test.checkText(uIn.getUserInput()))
        {
        	System.out.println("Congrats fam u can type some chars correctly.");
            System.out.println("Your score on lit test out of 5 was: " + test.updateGrade(100));
            System.out.println("You took " + test.getTimeElapsed()/1000 + " seconds.");
        }
        else
        	System.out.println("I know I'm from norcal but I have some advice. Quit! QUIIIIIT!");
        // test for MGLit + UserInput

    }
}
/*TurtleProgram tp = new TurtleProgram();
tp.addAction( new TurnRight( 120 ) );
tp.addAction( new MoveForward( 100 ) );
tp.addAction( new MoveBack( 50 ) );
tp.addAction( new TurnLeft( 90 ) );
System.out.println( tp );*/
