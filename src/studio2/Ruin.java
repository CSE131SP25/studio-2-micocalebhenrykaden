package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double winChance = .5;
		int winLimit = 20;
		int win=0;
		int lose=0;
		int simulations = 500;
		int startAmount = 5;

		for(int totalSimulations = simulations; totalSimulations>0; totalSimulations--)
		{
			
			int currentAmount = startAmount;
			while ((currentAmount > 0) && (currentAmount < 20))
			{
				double luck = Math.random();
				if (luck >= .5)
				{
					currentAmount++;
					//System.out.println("Win");
				}
				else
				{
					currentAmount--;
					//System.out.println("Loss");
				}
			}
			if (currentAmount == 0)
			{
				lose++;
				System.out.println("Ruin");
			}
			else
			{
				win++;
				System.out.println("Success");	
			}

		}
		//int netwinloss = (int) (win-lose);
		//System.out.println(netwinloss);

		double ruinRate = (((double)lose)/simulations)*100;
		System.out.println(ruinRate + "%");
		
		double expectedRuinRate = (1-(((double) startAmount)/winLimit))*100;
		System.out.println("Expected Ruin Rate: " + expectedRuinRate + "%");
	}

}
