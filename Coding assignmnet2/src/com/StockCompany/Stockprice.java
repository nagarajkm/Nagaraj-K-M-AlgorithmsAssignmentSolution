package com.StockCompany;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.ArrayList;




public class Stockprice {

		int numcomp;
		int count=0;
		int count1=0;
		boolean status;
		
		double[] stock;
		boolean [] value;
		Scanner sc=new Scanner(System.in);
		
		
		public void userinput() {
			System.out.println("Enter the no. companies");
			numcomp=sc.nextInt();
			
			stock=new double[numcomp];
			value=new boolean[numcomp];
			inservalue();
		
		}

		public void inservalue() {
			
			for(int i=0;i<numcomp;i++) {
				System.out.println("Enter current stock price of the company "+(i+1));
				stock[i]=sc.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday");
				value[i]=sc.nextBoolean();
				
			}
						
		}
		
		public void ascendingorder() {
		Arrays.sort(stock);
		 for(int j=0;j<stock.length;j++) {
        	
        	System.out.print(stock[j]+" ");
                			
            }
		}
		
		
		 public void descendingorder() {
			 double temp;
			 for (int i = 0; i < stock.length/2; i++)
			  {
			     temp = stock[i];
			     stock[i] = stock[stock.length-1 - i];
			     stock[stock.length-1 - i] = temp;
			     
			  } for(int i=0;i<stock.length;i++) {
		        	
		        	System.out.print(stock[i]+" ");
			
			  }
	        }
		 
		 public void isCountTrue() {
			 for(int i = 0; i < value.length; i++) {
				 if(value[i]==true) {
					 count++;
					 } 
				 
		          }
			 System.out.println(count);
			
		 }
		 public void isCountFalse() {
			 for(int j = 0; j < value.length; j++) {
				 if(value[j]==false) {
					 count1++;
					 } 
				 
		          }
			 System.out.println(count1);
			
		 }
		 
		 public void search() {
			 System.out.println("Enter the key value");
		     double key=sc.nextDouble();
			for(int i = 0; i < value.length; i++) {
			if(stock[i]==key) {
				System.out.println("stock of value "+stock[i]+" present");
				status=true;
			      } 
			}
			if (status == false) {
				System.out.println("Value not found!!!");
				}
			
			}
	
}
        




