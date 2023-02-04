package CodeForce2;

import java.util.Scanner;

public class DeletionTwoAdjacentLetter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			String str = sc.next();
			char ch = sc.next().charAt(0);
			int flag=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch && i%2==0) {
					flag=1;
					System.out.println(i);
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
