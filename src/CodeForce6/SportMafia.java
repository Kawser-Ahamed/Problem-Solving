package CodeForce6;

import java.util.*;

public class SportMafia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long k = sc.nextLong();
		long sum=(2*n+3-(long)Math.sqrt(8*(n+k)+9))/2;
		System.out.println(sum);
		sc.close();

	}

}
