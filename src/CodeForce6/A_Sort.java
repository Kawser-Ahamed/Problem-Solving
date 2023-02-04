package CodeForce6;

import java.util.*;

public class A_Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vector<Integer> even = new Vector<Integer>();
		Vector<Integer> odd = new Vector<Integer>();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a%2==0) {
				even.add(a);
			}
			else {
				odd.add(a);
			}
		}
		
	   Collections.sort(even);
	   Collections.sort(odd);
	   Collections.reverse(odd);
	   
	   for(int i=0;i<even.size();i++) {
		   System.out.print(even.elementAt(i)+" ");
	   }
	   for(int i=0;i<even.size();i++) {
		   System.out.print(odd.elementAt(i)+" ");
	   }
		
	}

}
