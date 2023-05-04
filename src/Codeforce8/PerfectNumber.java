package Codeforce8;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int c =0;
		
		for(int i=19;;i+=9) {
			int sum=0;
			int v = i;
			while(v>0) {
				int d = v%10;
			    sum = sum+d;
			    v/=10;
			}
			if(sum==10) {
				c++;
			}
			if(c==k) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
