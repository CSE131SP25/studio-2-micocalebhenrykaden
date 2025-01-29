package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 10;
		double winChance = .5;
		int winLimit = 20;
		int currentAmount = startAmount;
		int totalSimulations = 0;
		
		
		while ((currentAmount > 0) && (currentAmount < 20))
		{
			double luck = Math.random();
			if (luck >= .5)
			{
				currentAmount++;
				System.out.println("Win");
			}
			else
			{
				currentAmount--;
				System.out.println("Loss");
			}
		}
		if (currentAmount == 0)
		{
		System.out.println("Ruin");
		}
		else
		{
		System.out.println("Success");	
		}

	}

}
