package instruction;
import java.util.*;

import java.util.Scanner;

	class SEmployee {
	    int eNo;
	    String eName;
	    int eSalary;

	    public void read(){
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Enter ID : "); 
	        eNo = Integer.parseInt(sc.nextLine());
	        System.out.print("Enter Name : "); 
	        eName = sc.nextLine();
	        System.out.print("Enter monthly salary : "); 
	        eSalary = Integer.parseInt(sc.nextLine());
	    }

	    public void display(){
	        System.out.println("Name : "+ eName );
	        System.out.println("salary : "+ eSalary );
	    }
	    public static void main(String []args){
	        int i,n=3;
	        int No;
	        SEmployee emp[] = new SEmployee[n];
	        for(i=0;i<n;i++){
	            emp[i] = new SEmployee();
	            emp[i].read();
	        }
	        System.out.println("Search"); 
	        if(true){
	        	
	            Scanner sc= new Scanner(System.in);
	            
	            System.out.print("\nEnter ID : "); 
	            No = Integer.parseInt(sc.nextLine());
	            for(i=0;i<n;i++){
	                if(emp[i].eNo == No){
	                    emp[i].display();
	                    
	                    break;
	                    //System.out.print("for continue press any key");
	                }
	            }
	        }

	    }
	}