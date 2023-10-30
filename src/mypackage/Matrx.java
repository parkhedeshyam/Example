package mypackage;

import java.util.Scanner;

public class Matrx {

	public static void main(String[] args) {
		
		int a[][]=new int [3][3] ;
		int i,j ;
		
		Scanner sc=new Scanner(System.in) ;
		System.out.print("Enter the Elements in Array" );
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the Elements is " );
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			 
			 System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("");
	}

}
