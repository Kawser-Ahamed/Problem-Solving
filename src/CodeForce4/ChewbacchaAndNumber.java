package CodeForce4;

import java.util.Scanner;

public class ChewbacchaAndNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		String str = sc.next();
		String x ="";
		for(int i=0;i<str.length();i++) {
			String s = String.valueOf(str.charAt(i));
			int k = Integer.parseInt(s);
			if(k==9 && i==0) {
				x = x.concat("9");
			}
			else {
				int d = 9-k;
				if(d<k) {
					x = x.concat(String.valueOf(d));
				}
				else {
					x =  x.concat(String.valueOf(k));
				}
			}
			
			
		}
		System.out.println(x);

	}

}
