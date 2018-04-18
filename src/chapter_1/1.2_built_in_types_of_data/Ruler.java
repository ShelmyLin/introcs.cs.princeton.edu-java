/******************************************************************************
 *  Compilation:  javac Ruler.java
 *  Execution:    java Ruler n
 *
 *  Prints the relative lengths of the subdivisions on a ruler.
 *
 *  % java ruler 1
 *  1
 *
 *  % java ruler 2
 *  1 2 1
 *
 *  % java ruler 3
 *  1 2 1 3 1 2 1
 *
 *  % java ruler 4
 *  1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 ******************************************************************************/

public class Ruler {

	public static void main(String[] args){
		if(args.length >= 1){
			int n         =  Integer.parseInt(args[0]);
			String result = getRuler(n);
			System.out.println(result);
		}else{
			System.out.println("Please run with argument, for example: java ruler 3");
		}
	}

	private static String getRuler(int n) {
		if( n == 1){
			return " 1 ";
		}else {
			return getRuler(n-1) + String.valueOf(n) + getRuler(n-1);
		}
	}

}