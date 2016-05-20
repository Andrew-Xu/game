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
	public ArrayList<String> randTextGen(int size) //ASCII 33 to 126
	{
		ArrayList<Integer> asciiCount = new ArrayList<Integer>(size);
		ArrayList<String> randText = new ArrayList<String>(size);
		for (int i = 0; i < size; ++i)
		{
			asciiCount.add((int)(Math.random() * 93) + 33);
			String text = "" + String.valueOf(Character.toChars(asciiCount.get(i)));
			randText.add(text);
			System.out.print(text);
		}
		return randText;
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
