package minigames;

import java.util.ArrayList;
import java.util.Scanner;

public class MGLit extends MiniGame
{
	String userInput;
	public MGLit()
	{
		score = 0;
	}
	public String randTextGen(int size) //ASCII 33 to 126
	{
		ArrayList<Integer> asciiCount = new ArrayList<Integer>(size);
		String text = "";
		for (int i = 0; i < size; ++i)
		{
			asciiCount.add((int)(Math.random() * 93) + 33);
			text = "" + String.valueOf(Character.toChars(asciiCount.get(i)));
			System.out.print(text);
		}
		return text;
	}
	public void input()
	{
		Scanner in =  new Scanner(System.in);
		userInput += in.next();
	}
	public int updateGrade(int score)
	{
		return score/20;
	}
}
