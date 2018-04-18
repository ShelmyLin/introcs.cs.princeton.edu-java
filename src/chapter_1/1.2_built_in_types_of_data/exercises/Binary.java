/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary a
 *  
 *  Illustrates the integer operations a + b, a * b, a / b, and a % b.
 *
 *  % java Binary 5
 *  101
 * 
 *  % java Binary 8
 *  1000
 *
 ******************************************************************************/

public class Binary {

	public static void main(String[] args) {
		if(args.length <= 0) {
			System.out.println("Please input a integer number, for example, java Binary 8");
			return;
		}

		int n = Integer.parseInt(args[0]);
		if(n == 0){
			System.out.println(0);
			return;
		}

		String result = "";
		while(n != 0){
			int k = n % 2;
			n = n / 2;
			result = k + result;
		}

		System.out.println(result);
	} 
}