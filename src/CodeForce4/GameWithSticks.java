package CodeForce4;

import java.util.Scanner;

public class GameWithSticks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i =1;
		int count=0;
		
		for(;;) {
			if(n-i==0)
				break;
			if(m-i==0)
				break;
			i++;
			count++;
		}
		
		if(count%2==0) {
			System.out.println("Akshat");
		}
		else {
			System.out.println("Malvika");
		}
	}

}
