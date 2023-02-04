package CodeForce4;

import java.util.Scanner;

public class IllyaAndBankAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = Integer.parseInt(str);
		int a = 0;
		int b = 0;
		
		if(n>0) {
			System.out.println(n);
		}
		else {
			StringBuffer buffer = new StringBuffer(str);
			StringBuffer buffer2 = new StringBuffer(str);
			String s = String.valueOf( buffer.deleteCharAt(buffer.length()-1));
			a = Integer.parseInt(s);
			String x = String.valueOf( buffer2.deleteCharAt(buffer2.length()-2));
			b = Integer.parseInt(x);
			if(a>b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
			
		}

	}

}
