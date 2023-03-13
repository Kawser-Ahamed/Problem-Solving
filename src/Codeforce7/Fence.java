package Codeforce7;

import java.util.*;

public class Fence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        int c =  0;
        int sum=0;
        int index=0;
        int j=0;
        int min = Integer.MAX_VALUE;
 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            c++;
            if(c==k) {
            	if(sum<min) {
            		min = sum;
            		index=(i+1)-(k-1);
            	}
            	sum-=a[j];
            	j++;
            	c--;
            }
        }
        System.out.println(index);
        sc.close();

	}

}
