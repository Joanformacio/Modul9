package helpers;

public class Calcul {
	public static int Maxpower(int[] propulsions) {
		int maxPower=0;
		for (int i=0; i<propulsions.length; i++) {
			maxPower+= propulsions[i];
		}
		
		return maxPower;
	}
}
