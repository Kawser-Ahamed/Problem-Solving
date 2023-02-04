package CodeForce4;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int flag=0;
		
		for(int i=0;i<str.length();) {
			if(str.charAt(i)=='1' && str.charAt(i+1)=='4' && str.charAt(i+2)=='4' ) {
				i+=3;
			}
			else if(str.charAt(i)=='1' && str.charAt(i+1)=='4') {
				i+=2;
			}
			else if(str.charAt(i)=='1') {
				i++;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}

	}

}
