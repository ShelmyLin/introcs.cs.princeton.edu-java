/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *  
 *  Simulate a fair coin flip and print out "Heads" or "Tails" accordingly.
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Heads
 *
 *  % java Flip
 *  Tails
 *
 *
 ******************************************************************************/
public class Flip {

	public static void main(String[] args) {
		// Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the tim
		double r = Math.random();
		if(r < 0.5) {
			System.out.println("Heads");
		}else {
			System.out.println("Tails");
		}
	}
}