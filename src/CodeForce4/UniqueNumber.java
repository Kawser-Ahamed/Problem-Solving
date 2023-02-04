package CodeForce4;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			String str = "";
			
			if(n<=9) {
				System.out.println(n);
			}
			else if(n>45) {
				System.out.println(-1);
			}
			else {
					for(int i=9;i>=1;i--) {
						if(n>i) {
							n-=i;
							str = str.concat(String.valueOf(i));
						}
						else {
							break;
						}
						
				}
				str = str.concat(String.valueOf(n));
			}
			StringBuffer s = new StringBuffer(str);
			s = s.reverse();
			System.out.println(s);
			t--;
		}

	}

}
