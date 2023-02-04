package CodeForce4;

import java.util.*;

public class MakeProductEqualToOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int sum = 0,zero=0,neg=0,k=0,pos=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
	        if(a[i] == 1 || a[i] == -1) {
	        	continue;
	        }
	        else if(a[i] < -1){
	            sum += Math.abs(a[i] + 1);
	            a[i] -= (a[i] + 1);
	        }
	        else if( a[i] > 1){
	            sum += a[i] - 1;
	            a[i] = 1;
	        }

	    }
	    for(int i=0; i<n; i++){
	        if(a[i] == 0){
	            zero++;
	            a[i] = 1;
	        }
	        else if(a[i] == -1) {
	        	neg++;
	        }
	        else if(a[i] == 1) {
	        	pos++;
	        }
	    }
	    sum += zero;
	    pos += zero;
	    
	    if(neg % 2 == 1){
	        if(zero > 0) {
	        	pos--;
	        }
	        else{
	        	sum+=2;
	        }
	    }

	    System.out.println(sum);
		
		

	}

}
