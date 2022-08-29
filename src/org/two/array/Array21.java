package org.two.array;

public class Array21 {

	public static void main(String[] args) {
	
		int a[][] = new int [3][3];
		
		a[0][0] = 1;
		a[1][1] = 1;
		a[2][2] = 1;
		
		for (int[] x:a) {
			
			for (int y:x) {
				System.out.print(" " + y + " ");
			}
			
			System.out.println(" ");
		}
	}	
}
