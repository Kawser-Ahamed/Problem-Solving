package Contest6;

import java.util.*;

public class TPrimes {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[1000001];
        
        for(int i=0;i<a.length;i++) {
        	a[i]=0;
        }
        for(int i=2; i<=1000000; i++)
        {
            if(a[i]==0)
            {
               for(int j=2; i*j<=1000000; j++)
               {
                   a[i*j]=1;
               }
            }
        }
        
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
        	
        	Long n = sc.nextLong();
        	int p = (int) Math.sqrt(n);
        	Long  x = (long) p;
        	x*=x;
        	
        	System.out.println(x+" "+a[p]);
        	
        	if(n==1L) {
        		System.out.println("NO");
        	}
        	else if((x==n) && (a[p])==0) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	
        }
        

	}

}
