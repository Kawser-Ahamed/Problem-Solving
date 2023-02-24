package Codeforce7;

import java.util.*;

public class BusinessmenProblems {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long sum=0L;
		HashMap<Long,Long> map = new HashMap<>();
		
		for(Long i=1L;i<=n;i++) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			map.put(a,b);
			sum+=b;
		}
		
		Long m = sc.nextLong();
		
		for(Long i=1L;i<=m;i++) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			
			if(map.containsKey(a)==true) {
				Long c = map.get(a);
				if(b>c) {
					sum-=c;
					sum+=b;
				}
			}
			else {
				sum+=b;
			}
		}
		System.out.println(sum);
        sc.close();

	}

}
