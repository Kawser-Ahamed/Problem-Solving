package CodeForce2;

import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int max = Math.max(a,Math.max(b, c));
			
			if(a==b && b==c){
				System.out.println(1+" "+1+" "+1);
			}
			else if(a>b && a>c) {
				System.out.println((0)+ " "+((max-b)+1)+" "+((max-c)+1));
			}
			else if(b>a && b>c) {
				System.out.println(((max-a)+1)+ " "+(0)+" "+((max-c)+1));
			}
			else if(c>a && c>b) {
				System.out.println(((max-a)+1)+ " "+((max-b)+1)+" "+(0));
			}
			else if(a==max && b==max) {
				System.out.println(1+" "+1+" "+((max-c)+1));
			}
			else if(a== max && c == max) {
		           System.out.println(1+" "+((max-b)+1)+" "+1);
			}
			else if(b==max && c== max) {
				System.out.println(((max-a)+1)+" "+1+" "+1);
			}
			t--;
		}

	}

}
