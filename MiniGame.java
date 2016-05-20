package minigames;

public abstract class MiniGame 
{
	int score;
	public int getScore()
	{
		return score;
	}
	public void updateScore(int increase)
	{
		score += increase;
	}
	public int updateGrade(int score)
	{
		return score;
	}
}
