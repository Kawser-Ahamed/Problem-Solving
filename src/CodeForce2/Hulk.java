package CodeForce2;

import java.util.Scanner;

public class Hulk 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String x = new String();
		String str1[] = {"I love ","I hate "};
		String str2[] = {"that ","it "}; 
		
		for(int i=1;i<=n;i++)
		{
		   if(i%2==0)
		   {
			   //x= x.concat("I love ");
			   x = x.concat(str1[0]);
		   }
		   else
		   {
			   //x = x.concat("I hate ");
			   x = x.concat(str1[1]);
		   }
		   
		   if(i!=n)
		   {
			  // x = x.concat("that ");
			   x = x.concat(str2[0]);
		   }
		   else
		   {
			   //x = x.concat("it ");
			   x = x.concat(str2[1]);
		   }
			
			
		}
		
		System.out.println(x);

	}

}
