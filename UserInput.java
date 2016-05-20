package gui;

import java.util.Scanner;

public class UserInput
{
	String received = "";
	public UserInput()
	{ }
	
	public void receiveInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("type some junk in the console por favor");
		received = sc.nextLine();
		sc.close();
	}
	
	public String getUserInput()
	{
		System.out.println("this was your output right fam:" + "\n");
		return received;
	}
	
}
