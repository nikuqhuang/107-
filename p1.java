//package fractal;

import java.util.Scanner;
import java.math.BigInteger;
public class p1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		n = scan.nextInt();
		BigInteger bfour = new BigInteger("4");
		BigInteger bthree = new BigInteger("3");
		
		System.out.println(bfour.pow(n).subtract(BigInteger.ONE).divide(bthree));
		scan.close();
	}	
}
