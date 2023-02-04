package Contest6;

import java.util.*;

public class AntonAndDanik {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int a=0,d=0,f=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A') {
				a++;
			}
			else if(str.charAt(i)=='D') {
				d++;
			}
		}
		
		if(a>d) {
			System.out.println("Anton");
		}
		else if(a<d) {
			System.out.println("Danik");
		}
		else {
			System.out.println("Friendship");
		}

	}

}
