package subjects;

import java.util.ArrayList;

public class Physics //implements Subject
{
	double grade;
	
	ArrayList<String> dilemma = new ArrayList<String>();//make the dilemmas per day in random order
	ArrayList<String> choices = new ArrayList<String>();//maybe some choices can be unlocked by choosing previous ones
	ArrayList<String> results = new ArrayList<String>();//results should change grades, influence the student, etc.
	
	public Physics()
	{
		grade = 0;
		dilemma.add("");
		choices.add("");
		results.add("");
	}
	
	public double getGrade() 
	{
		return grade;
	}

	public void setGrade(int newGrade) 
	{
		grade = newGrade;
	}

	public void choice() 
	{
		
	}
	
}
