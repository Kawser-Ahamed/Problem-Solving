package CodeForce5;

import java.util.Scanner;

public class Strips {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			String []str = new String[8];
			String s = "B";
			int r=0;
			
			for(int i=0;i<8;i++) {
				str[i]=sc.next();
			}
			
			
			for(int i=0;i<8;i++) {
				String x = str[i];
				for(int j=0;j<8;j++) {
					if(x.charAt(j)=='R') {
						r++;
					}
				}
				if(r==8) {
					s="R";
					break;
				}
				else {
					r=0;
				}
			}

			System.out.println(s);
			
			
			t--;

		}
	}

}
