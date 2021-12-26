package com.driverclass;

import java.util.Scanner;

import com.StockCompany.Stockprice;


public class Mainoperartion {

	public static void main(String[] args) {
		Scanner opt=new Scanner(System.in);
		
		Stockprice sp=new Stockprice();
		sp.userinput();
		
		  int n;
		  do {
		  System.out.println("Enter the opeartion to perform");
	        System.out.println("1.Display the companies stock prices in ascending order");
	        System.out.println("2.Display the companies stock prices in descending order");
	        System.out.println("3.Display the total no of companies for which stock prices rose today");
	        System.out.println("4.Display the total no of companies for which stock price decline today ");
	        System.out.println("5.Search a specific stock price");
	        System.out.println("6.press 0 to break");
	          n=opt.nextInt();
	        switch(n) {
	        case 1: 
	        	System.out.println("Stock prices in ascending order");{
	        		sp. ascendingorder();
	        		System.out.println();
	        		System.out.println("-----------------------------------------------------");
	        			break;
	        	}
	        case 2: 
	        	System.out.println("Stock prices in descending order");
	        	sp.descendingorder();
	        	System.out.println();
        		System.out.println("-----------------------------------------------------");
	        	break;
	        case 3: 
	        	System.out.println("Total no of companies for which stock prices rose today");
	        	sp.isCountTrue();
	        	System.out.println();
        		System.out.println("-----------------------------------------------------");
	        	     	break;
	        case 4: 
	        	System.out.println("Total no of companies for which stock price decline today ");
	        	sp.isCountFalse();
	        	System.out.println();
        		System.out.println("-----------------------------------------------------");
	        	break;
	        case 5: 
	        	sp.search();
	        	System.out.println();
        		System.out.println("-----------------------------------------------------");
	        	break;
	        	
	        case 0: 
	          	System.out.println("Exited suceessfully");
	        	break;
	       }
		  }while(n!=0);
	       
	}
	        
	}


