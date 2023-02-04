package CodechefContest1;

import java.util.Arrays;
import java.util.Scanner;

public class Gcd 
{
	public static int findGCD(int a, int b){
        if(b == 0)
          return a;
        return findGCD(b, a%b);
      }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int A[] = new int[n];
			
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
			}
			
			int i;
		    int j;
		    int GCD=0;
		    int flag=0;
            int temp=0;
            
            int result = A[0];
 
            for(i=1; i<A.length; i++){
              result = findGCD(A[i], result);
            }
            temp=result*n;
            System.out.print(temp); 
			t--;
			
			
		}

	}

}
