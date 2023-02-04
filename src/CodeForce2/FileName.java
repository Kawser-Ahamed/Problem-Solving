package CodeForce2;

import java.util.Scanner;

public class FileName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int count=0;
		int total =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='x') {
				count++;
				continue;
				
			}
			else {
				if(count>=3) {
					total+=count-2;
					count=0;
				}
				count=0;
			}
			
			
		}
		
		if(count>=3) {
			total+=count-2;
			count=0;
		}
		
		System.out.println(total);

	}

}
