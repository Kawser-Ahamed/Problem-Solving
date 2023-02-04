package CodeForce4;

import java.util.Scanner;

public class Div7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			
			if(n%7==0) {
				System.out.println(n);
			}
			else {
				String str = Integer.toString(n);
				StringBuffer s = new StringBuffer(str);
				int len = str.length();
				s.deleteCharAt(len-1);
				s=s.append('1');
				String ss = s.toString();
				n = Integer.parseInt(ss);
				if(n%7==0) {
					System.out.println(n);
				}
				else {
					while(n%7!=0) {
						n+=1;
					}
					System.out.println(n);
				}
				
			}
			
			t--;
		}
		
	}

}
