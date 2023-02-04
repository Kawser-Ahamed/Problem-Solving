package CodeForce5;

import java.util.Scanner;

public class OlesyaAndRodion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		String str = "";
		
		if(n==1 && t==10) {
			System.out.println(-1);
		}
		else {
			if(t<=9) {
				for(int i=1;i<=n;i++) {
					str = str.concat(String.valueOf(t));
				}
			}
			else {
				for(int i=1;i<=n-1;i++) {
					str = str.concat("1");
				}
				str=str.concat("0");
			}
			
			System.out.println(str);
		}
		

	}

}
