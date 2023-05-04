package Contest5;

import java.util.*;

public class AprilFool_A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%4==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
		sc.close();
	}

}
