package minigames;

import java.util.ArrayList;

import subjects.Subject;

public class MGLit extends MiniGame implements Subject
{
	String text;
	int size;
	double startTime, endTime, totalTime, extraTime;
	double grade = 0;
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
		return (totalTime/1000) - 3 - (extraTime/1000);
	}
	public void setExtraTime(double time)
	{
		extraTime = time;
	}
	public String getText()
	{
		return text;
	}
	public int updateGrade(double score)
	{
		double fraction = size/getTimeElapsed();
		if (fraction > 1)
			fraction = 1;
		return (int)(score * fraction);
	}
	public double getGrade()
	{
		return grade;
	}
	public void choice()
	{
		System.out.println("Lit game running.");
	}
	public String getResults(boolean t)
	{
		if (t)
			return "You took " + getTimeElapsed() + " seconds." + "\n" + "Your score on the Literature test was: " + updateGrade(5);
		return "Your score on the lit test was: " + updateGrade(0) + "\n"
				+ "You aren't allowed to miss anything." + "\n" + "ANYTHING.";
	}
}
