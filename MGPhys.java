package minigames;

import subjects.Subject;

public class MGPhys extends MiniGame implements Subject
{
	final double gravity = 9.807;
	double grade = 0;
	public MGPhys()
	{
	}
	public int falling(int v)
	{
		return (int)(v += gravity);
	}
	public int updateGrade(double score)
	{
		return (int)(score);
	}
	public double getGrade()
	{
		return grade;
	}
	public void choice()
	{
		System.out.println("Physics game running");
	}
}
