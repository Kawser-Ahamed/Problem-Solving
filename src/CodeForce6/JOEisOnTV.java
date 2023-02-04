package CodeForce6;

import java.util.*;

public class JOEisOnTV {
	
	public static float sum(int n,float k) {
		if(n==1) {
			return k+=1;
		}
		k+=(float)1/n;
		return sum(n-1,k);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float k= 0f;
		float x = sum(n,k);
		System.out.printf("%.12f",x);
	}

}
