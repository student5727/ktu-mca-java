package instruction;

import java.util.Scanner;

public class Lbsearch {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("1.LINEAR ");
	 System.out.println("2.BINARY ");
	// System.out.println("3.RECURSIVE  ");
	 System.out.print("ENTER U R CHOICE ");
	   int ch= s.nextInt();
	   if(ch==1) {
		   int arr[] = new int[10];
	       int i, num, n, c=0, pos=0;
	       @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       n = scan.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<n; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       System.out.print("Enter the Number to be Search...");
	       num = scan.nextInt();
		   
	       for(i=0; i<n; i++)
	       {
	           if(arr[i] == num)
	           {
	               c = 1;
	               pos = i+1;
	               break;
	           }
	       }
	       if(c == 0)
	       {
	           System.out.print("Number Not Found..!!");
	       }
	       else
	       {
	           System.out.print(num+ " found at position " + pos);
	       }
	   }
		   
	   	   else if(ch==2)
	   {
		   int n, i, search, first, last, middle;
	       int arr[] = new int[50];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Total Number of Elements : ");
	       n = scan.nextInt();
		   
	       System.out.print("Enter " +n+ " Elements : ");
	       for(i=0; i<n; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       System.out.print("Enter a Number to Search..");
	       search = scan.nextInt();
	       scan.close();
		   
	       first = 0;
	       last = n-1;
	       middle = (first+last)/2;
		   
	       while(first <= last)
	       {
	           if(arr[middle] < search)
	           {
	               first = middle+1;
	           }
	           else if(arr[middle] == search)
	           {
	               System.out.print(search+ " Found at Location " +middle);
	               break;
	           }
	           else
	           {
	               last = middle - 1;
	           }
	           middle = (first+last)/2;
	       }
	       while(first > last)
	       {
	    	   if((first > last)) {
	           System.out.print(" Found..!! " +search+ " is  Present in the List.");
	       break;
	       }
	       else
	    	   
	       { 
	    	   //System.out.print("in");
	    	   System.out.print("Not Found..!! " +search+ " is not Present in the List.");
	       }
	   }
	   }
	
	}
}

