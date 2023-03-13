package Daffodil;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE,abc=Integer.MAX_VALUE;
		int flag1=0,flag2=0,flag3=0,flag4=0;
		while(n>0) {
			int j = sc.nextInt();
			String str = sc.next();
			
			if(str.equals("A")) {
				if(j<a) {
					a=j;
				}
				flag1=1;
			}
			else if(str.equals("B")) {
				if(j<b) {
					b=j;
				}
				flag2=1;
			}
			else if(str.equals("C")) {
				if(j<c) {
					c=j;
				}
				flag3=1;
			}
			else if(str.contains("A") &&  str.contains("B") && str.contains("C")) {
				if(j<abc) {
					abc=j;
				}
				flag4=1;
			}
			n--;
		}
		
		Long sum = (long) (a+b+c);
		
		if((flag1==1 && flag2==1 && flag3==1) || flag4==1) {
			System.out.println(Math.min(sum, abc));
		}
		else {
			System.out.println(-1);
		}

	}

}
