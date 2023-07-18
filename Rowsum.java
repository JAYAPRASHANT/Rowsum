package Rowsum;

import java.util.Scanner;

public class Rowsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ar[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		 for(int i = 0; i < a; i++){    
	           int  sumRow = 0;    
	            for(int j = 0; j < b; j++){    
	              sumRow = sumRow + ar[i][j];    
	            }    
	            System.out.println( sumRow);    
	        } 
	}

		
	}


