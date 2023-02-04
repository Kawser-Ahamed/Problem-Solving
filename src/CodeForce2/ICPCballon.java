package CodeForce2;

import java.util.*;

public class ICPCballon {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int t = sc.nextInt();
		 
		 while(t>0) {
			 int n = sc.nextInt();
			 String x = sc.next();
			 String str = "";
			 int b = 0;
			 
			 for(int i=0;i<x.length();i++) {
				 if(str.indexOf(x.charAt(i))==-1) {
					 b+=2;
					 str+=x.charAt(i);
				 }
				 else
				 {
					 b+=1;
				 }
			 }
			 System.out.println(b);
			 t--;
		 }
	}

}
