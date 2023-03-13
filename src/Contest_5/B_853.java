package Contest_5;

import java.util.*;

public class B_853 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			String str2 = str.substring(0, str.length()/2);
			String str3="";
			
			if(str.length()%2==1) {
				str3 = str.substring((str.length()/2)+1,str.length());
			}
			else {
				str3 = str.substring((str.length()/2),str.length());
			}
			
			StringBuffer buffer = new StringBuffer(str3);
			buffer.reverse();
		    str3 = String.valueOf(buffer);
		    int k=0,l=0,m=0;
		    
		    for(int i=0;i<str2.length();i++) {
		    	if(str2.charAt(i)!=str3.charAt(i)) {
		    		k++;
		    		if(l>0) {
		    			m=1;
		    			break;
		    		}
		    	}
		    	else {
		    		if(k>0) {
		    			l++;
		    		}
		    	}
		    }
		    
		    if(m==0) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
			t--;
		}
		
		sc.close();

	}
	

}

