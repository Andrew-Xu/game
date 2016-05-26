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
    	theGameWindow.startIntroScreen();
        System.out.println("\nayy lmao");
    	
    	Map m = new Map(20, 10); //initialize floor
    	Wall w = new Wall();
    	w.initialize(m);
		m.columnF(w.getLWall());
		m.columnL(w.getRWall());
		m.getMap()[0] = w.getCeiling();
		m.getMap()[m.getY() - 1] = w.getFloor();
		Player p = new Player(m.getY() - 2, 1);
		m.getMap()[p.getX()][p.getY()] = p + "";
		
    	System.out.println("");
    	System.out.println(m);
    }
}
