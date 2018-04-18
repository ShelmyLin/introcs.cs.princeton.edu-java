/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *  
 *  Prints out n in binary.
 * 
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 * 
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers. // I am trying to figure it out
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
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