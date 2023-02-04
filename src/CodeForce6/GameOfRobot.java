package CodeForce6;

import java.util.*;

public class GameOfRobot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int []a = new int[n];
		String str ="";
		String s = "";
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		k--;
		
		for(int i=1;;i++) {
			if(i>k) {
				break;
			}
			else {
				k-=i;
			}
		}
		
		System.out.println(a[k]);

	}

}
