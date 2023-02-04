package CodeForce4;

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count=1;
		boolean flag = false;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
				if(count==7) {
					flag = true;
					break;
				}
			}
			else {
				count=1;
			}
		}
		
		if(flag== true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
