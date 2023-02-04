package CodechefContest1;

import java.util.Scanner;

public class AirConditioner 
{

	public static void main(String[] args) 
	{
		
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         
         while(t>0)
         {
        	 
        	 
        	 int a[] = new int [3];
        	 int flag=0;
        	 for(int i=0;i<3;i++)
        	 {
        		 a[i]=sc.nextInt();
        	 }
        	 for(int i=0;i<3;i++)
        	 {
        		for(int j=1;j<2;j++)
        		{
        			if(a[i]<=a[j])
        			{
        				flag++;
        			}
        			
        		}
        	 }
        	 if(flag==3)
        	 {
        		 System.out.println("Yes");
        	 }
        	 else
        	 {
        		 System.out.println("No");
        	 }
        	 
        	 t--;
         }
	}

}
