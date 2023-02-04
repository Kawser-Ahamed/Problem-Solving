package Contest6;

import java.util.Scanner;

public class DecodeString 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			String str = sc.next();
			
		    StringBuffer buffer = new StringBuffer(str);
		    String x = String.valueOf(buffer.reverse());
		    int ascii=0;
		    String z = "";
		    String tt3 ="";
		    
		    for(int i=0;i<x.length();i++)
		    {
		    	if(x.charAt(i)=='0')
		    	{
		    		int in = i+1;
		    		in--;
		    		System.out.println(in);
		            System.out.println(x.charAt(in));
		    	}
//		    	else
//		    	{
//		    		String y = String.valueOf(x.charAt(i));
//			    	int value = Integer.parseInt(y);
//			    	ascii = 96+value;
//			    	String temp = String.valueOf((char)ascii);
//			    	z = z.concat(temp);
//			    	System.out.println(z);
//		    		
//		    	}
		    	System.out.println(tt3);
		    }
		    
		   
		    
		    
			
			t--;
		}

	}

}
