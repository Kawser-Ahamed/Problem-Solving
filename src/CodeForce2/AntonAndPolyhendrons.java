package CodeForce2;

import java.util.*;

public class AntonAndPolyhendrons 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str[] =  new String[n];
		int face=0;
		
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			if(str[i].equalsIgnoreCase("Icosahedron"))
			{
				face+=20;
			}
			if(str[i].equalsIgnoreCase("Cube"))
			{
				face+=6;
			}
			if(str[i].equalsIgnoreCase("Tetrahedron"))
			{
				face+=4;
			}
			if(str[i].equalsIgnoreCase("Dodecahedron"))
			{
				face+=12;
			}
			if(str[i].equalsIgnoreCase("Octahedron"))
			{
				face+=8;
			}	
		}
		
		System.out.println(face);

	}

}
