package com.greatlearning.jdbc_example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   BookDao bd = new BookDao();
    	   Connection con= 
    			   DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","9841386924");
    	   Statement stmt =  con.createStatement();
    	   int n;
    	   do {
    		   System.out.println("\nBook Management\n");
    		   System.out.println("\n1. Display \n2. Insert\n3. Modify\n 4.Delete");
    		   Scanner in = new Scanner(System.in);
    		   n=in.nextInt();
    		   switch(n) {
    		   case 1:{
    			   bd.getAllBooks(stmt);
    			   
    			   break;
    		   }
    		   case 2:{
    			   bd.saveData(con);
    			   
    			   break;
    		   }
    		   case 3:{
    			   bd.updateBook(stmt);
    			   
    			   break;
    		   }
    		   
    		   case 4:{
    			   bd.deleteBook(stmt);
    			   
    			   break;
    		   }
    		   default:{
    			   System.out.println("Invalid Number");
    		   }
    		   
    		   }
    	   }while(n>0);
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
