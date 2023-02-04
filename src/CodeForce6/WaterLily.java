package CodeForce6;

import java.util.Scanner;

public class WaterLily {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextDouble();
		double l = sc.nextDouble();
		
		
		System.out.println(((l*l)-(h*h))/(2*h));

	}

}
