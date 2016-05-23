package minigames;

import java.util.ArrayList;

public class MGLit extends MiniGame
{
	String text;
	int size;
	double startTime, endTime, totalTime;
	public MGLit()
	{
		score = 0;
		text = "";
		startTime = System.currentTimeMillis();
		endTime = totalTime = 0;
	}
	public String randTextGen(int size2) //ASCII 33 to 126
	{
		size = size2;
		ArrayList<Integer> asciiCount = new ArrayList<Integer>(size);
		for (int i = 0; i < size; ++i)
		{
			asciiCount.add((int)(Math.random() * 93) + 33);
			text += "" + String.valueOf(Character.toChars(asciiCount.get(i)));
		}
		System.out.print(text);
		return text;
	}
	public boolean checkText(String userInput)
	{
		if(userInput.equals(text))
		{
			endTime = System.currentTimeMillis();
			totalTime = endTime - startTime;
			return true;
		}
		return false;
	}
	public double getTimeElapsed()
	{
		return totalTime/1000;
	}
	public String getText()
	{
		return text;
	}
	public int updateGrade(double score)
	{
		return (int)((score)*(size/getTimeElapsed()));
	}
	public String getResults(boolean t)
	{
		if (t)
			return "Congrats fam u can type some chars correctly.\nYou took " + 
				getTimeElapsed() + " seconds.\nYour score on lit test was: " + updateGrade(5);
		return "Your score on lit test was: " + updateGrade(0) + "\n"
				+ " I know I'm from norcal but I have some advice. Quit! QUIIIIIT!";
	}
}
