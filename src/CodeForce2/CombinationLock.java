package CodeForce2;

import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str1 = sc.next();
		String str2 = sc.next();
		int total = 0;
		
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(String.valueOf(str1.charAt(i)));
			int y = Integer.parseInt(String.valueOf(str2.charAt(i)));
			
			int div = Math.abs(x-y);
			
			if(div>5) {
				total+=10-div;
			}
			else {
				total+=div;
			}
		}
		
		System.out.println(total);
	}

}
