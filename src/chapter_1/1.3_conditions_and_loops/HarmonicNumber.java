/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 
 *  % java HarmonicNumber 10
 *  2.9289682539682538
 *
 *  java HarmonicNumber 1000
 *  7.485470860550343
 *
 *  % java HarmonicNumber 10000
 *  9.787606036044348
 *
 ******************************************************************************/

public class HarmonicNumber {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Please input a number");
			return;
		}

		int n = Integer.parseInt(args[0]);

		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
		double hn = 0;
		int     i = 1;
		while(i <= n){
			hn = hn + 1.0 / i;
			i++;
		}

		System.out.println(String.format("Harmonic number for %d: %.16f", n, hn));

	}
}