//package hourse;

import java.util.Scanner;
public class p3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		double n;
		x = scan.nextInt();
		y = scan.nextInt();
		n = Math.min(x, y);
		
		if((Math.min(x,y)==1)||(Math.min(x,y)==2&&x==y)) {
			System.out.println("Lose"+" "+"0");
		}
		else if(Math.min(x,y)==2||Math.min(x,y)==3) {
			System.out.println("Win"+" "+"1");
		}
		else if(x==y) {
			if(x%3==0) {
				x=x/3;
				x=2*x-1;
				System.out.println("Win"+" "+x);
			}
			else {
				x=x/3;
				x=2*x;
				System.out.println("Lose"+" "+x);
			}
		}
		else if(n%3==1) {
			n=n/3;
			n=2*n;
			System.out.println("Lose"+" "+(int)n);
		}
		else {
			n=Math.ceil(n/3);
			n=2*n-1;
			System.out.println("Win"+" "+(int)n);
		}
		
		
		

		/*
		else if(Math.min(x,y)%4==0||Math.min(x,y)%4==3) {
			System.out.println("Lose"+" "+Math.min(x,y)/2);
		}
		else {
			System.out.println("Win"+" "+Math.min(x,y)/2);
		}*/
		scan.close(); 
	}
}

