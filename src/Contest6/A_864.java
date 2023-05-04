package Contest6;

import java.util.*;

public class A_864 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int test = in.nextInt();
		
		while(test>0) {
			
			Long n = in.nextLong();
			Long m = in.nextLong();
			
			Long x1 = in.nextLong();
			Long y1 = in.nextLong();
			Long x2 = in.nextLong();
			Long y2 = in.nextLong();
			
			Long ans = 0L ,ans2 = 0L;
			
			Long a,b,c,d,e,f,g,h;
			
			a =  ((x2-1L)>=1L ? 1L :0L);
			b =  ((n-x2)>=1L ? 1L :0L);
			c =  ((y2-1L)>=1L ? 1L :0L);
			d =  ((m-y2)>=1L ? 1L :0L);
			
			ans = a+b+c+d;
			
			e =  ((x1-1L)>=1L ? 1L :0L);
			f =  ((n-x1)>=1L ? 1L :0L);
			g =  ((y1-1L)>=1L ? 1L :0L);
			h =  ((m-y1)>=1L ? 1L :0L);
			
			ans2 = e+f+g+h;
			
			System.out.println(Math.min(ans, ans2));
			
			test--;
		}
		
		in.close();

	}

}
