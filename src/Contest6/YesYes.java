package Contest6;

import java.util.Scanner;

public class YesYes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			String str = sc.next();
			int flag=1;
			
			if(str.length()==1) {
				if(str.equals("Y") || str.equals("e") || str.equals("s")) {
					flag=1;
				}
				else {
					flag=0;
				}
			}
			
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)=='Y' && str.charAt(i+1)=='e') {
					flag=1;
				}
				else if(str.charAt(i)=='e' && str.charAt(i+1)=='s') {
					flag=1;
				}
				else if(str.charAt(i)=='s' && str.charAt(i+1)=='Y') {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
			t--;
		}

	}

}
