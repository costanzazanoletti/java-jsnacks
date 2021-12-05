package jsnacks.strings;

public class HammingDistance {

	public int computeHammingDistance(String s1, String s2) {
		int hammingDistance = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				hammingDistance++;
			}
		}
		
		return hammingDistance;
	}
	
}
