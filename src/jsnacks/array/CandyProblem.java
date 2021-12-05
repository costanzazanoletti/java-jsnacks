package jsnacks.array;


public class CandyProblem {


	public int candiesToGive(int[] candies) {
		
		int candiesToGive = 0;
		int maxCandies = 0;
		
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] > maxCandies) {
				maxCandies = candies[i];
			}
		}
		
		for(int i = 0; i < candies.length; i++) {
			 
			candiesToGive += maxCandies - candies[i];
			
		}

		return candiesToGive;
	}


}
