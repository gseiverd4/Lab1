package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		
		Roll r1 = new Roll();
		rolls.add(r1);
		ComeOutScore = r1.getScore();
		
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore ==12) {
			
				eGameResult = eGameResult.CRAPS;
				
		} else if (ComeOutScore == 7 || ComeOutScore == 11) 
		{
			eGameResult = eGameResult.NATURAL;
			
		} else 
		{
			while (true) 
			{
				Roll r2 = new Roll();
				int rollScore2 = r2.getScore();
				rolls.add(r2);
				if (rollScore2 == ComeOutScore) 
				{
					eGameResult = eGameResult.SEVEN_OUT;
					break;
				} else if (rollScore2 == ComeOutScore) 
				{
					eGameResult = eGameResult.POINT;
					break;
					
				}
			}
		}
return;

	}

	public int RollCount() {
		return rolls.size();
	}
		
	public LinkedList<Roll> getRolls()
	{
		return rolls;
	
	}
	public eGameResult getGameResult()
	{	return eGameResult;
	}
}
