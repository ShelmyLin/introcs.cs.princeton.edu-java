/******************************************************************************
 *  Compilation:  javac RulerN.java
 *  Execution:    java RulerN n
 *  
 *  Prints the relative lengths of the subdivisions on a ruler or
 *  order n.
 * 
 *  % java RulerN 3
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *
 *  % java RulerN 5
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
 *
 * 
 *  % java RulerN 100
 *  a lot of output, then
 *  Exception in thread "main" java.lang.OutOfMemoryError
 *
 ******************************************************************************/

public class RulerN {

	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("Please input a number");
			return;
		}

		int n        = Integer.parseInt(args[0]);
		String ruler = " ";
		for(int i = 1; i <= n; i++){
			ruler = ruler + Integer.toString(i) + ruler;
			System.out.println(ruler); 
		}

	}
}