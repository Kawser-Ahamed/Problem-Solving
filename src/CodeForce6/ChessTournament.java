package CodeForce6;

import java.util.Scanner;

public class ChessTournament {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			int c = 0;
			int max=0;
			int flag=0;
			int min=100;
			
			for(int i =0;i<n;i++) {
				if(str.charAt(i)=='2') {
					c++;
					if(i>max) {
						max=i;
					}
					if(i<min) {
						min=i;
					}
				}
			}
			
			if(c<=2&&c>0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(str.charAt(i)=='1') {
							if(i==j) {
								System.out.print("X");
							}
							else {
								System.out.print("=");
							}
						}
						else if(str.charAt(i)=='2' && i!=max && i!=min) {
							if(i==j) {
								System.out.print("X");
							}
							else if(j==max){
								System.out.print("+");
							}
							else if(str.charAt(j)=='2'){
								System.out.print("-");
							}
							else {
								System.out.print("=");
							}
							
						}
						else if(str.charAt(i)=='2'&& i==min){
							if(i==j) {
								System.out.print("X");
							}
							else if(str.charAt(j)=='2' && flag==0){
								System.out.print("+");
								flag=1;
							}
							else if(str.charAt(j)=='2'){
								System.out.print("-");
							}
							else {
								System.out.print("=");
							}
						}
						else if(str.charAt(i)=='2'&& i==max){
							if(i==j) {
								System.out.print("X");
							}
							else if(j==min){
								System.out.print("+");
							}
							else if(str.charAt(j)=='2'){
								System.out.print("-");
							}
							else {
								System.out.print("=");
							}
						}
					}
					System.out.println();
				}
			}
			
			t--;
		}

	}

}
