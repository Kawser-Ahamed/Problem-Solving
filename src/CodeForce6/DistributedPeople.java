package CodeForce6;

import java.util.*;

public class DistributedPeople {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		int c = 0;
		Vector<Integer> vec = new Vector<Integer>();
		
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();		
		}
		for(int i=1;i<n-1;i++) {
			if(a[i-1]==1 && a[i]==0 && a[i+1]==1) {
				vec.add(i);
			}
		}
		
		if(vec.isEmpty()) {
			System.out.println(0);
		}
		else if(vec.size()==1){
			System.out.println(1);
		}
		else {
			for(int i=0;i<vec.size()-1;) {
				if(vec.elementAt(i)==vec.elementAt(i+1)-2) {
					i+=2;
				}
				else {
					i++;
				}
				c++;
				if(i==vec.size()-1) {
					c++;
				}
			}
			System.out.println(c);
			
		}
		sc.close();
	}

}
