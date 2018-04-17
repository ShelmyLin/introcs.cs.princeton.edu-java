/******************************************************************************
 *  Compilation:  javac UserArgumentsThree.java
 *  Execution:    java UserArgumentsThree
 *
 *  Takes three names and prints out a proper sentence with the names in the reverse of the order given, 
 *  so that for example, "java UseThree Alice Bob Carol" gives "Hi Carol, Bob, and Alice.".
 *
 *  % java UserArgumentsThree Alice Bob Carol
 *  Hi Carol, Bob, Alice.
 *
 ******************************************************************************/

public class UserArgumentsThree {

	public static void main(String[] args) {
		System.out.print("Hi ");

		for(int i = args.length - 1; i >= 0; i--) {
			System.out.print(args[i]);
			if(i != 0){
				System.out.print(", ");
			}
		}

		System.out.println(".");
	}
}