package Main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import Controller.ShopControllerImpl;
import Model.Vendor;

public class SpringHibernateDriver {

	public static void main(String[] args) {
		System.out.println("Container Opened..\n");
	    ApplicationContext cxt=new ClassPathXmlApplicationContext("SpringHibernate.xml"); 
	    
	    ShopControllerImpl sc=cxt.getBean(ShopControllerImpl.class);
	    System.out.println("\nPlease Enter an Option.\n1.Add\n2.Remove\n3.Update\n4.Get");
	    Scanner s=new Scanner(System.in);
	    int op=s.nextInt();
	    if(op==1)
	    {
	      System.out.println("Enter Vendor Name:");
	      String n=s.nextLine();
	      String n1=s.nextLine();
	      System.out.println("Enter Vendor Domain:");
	      String d=s.nextLine();
	      System.out.println("Enter Vendor ID");
          int i=s.nextInt();
          sc.saveData(new Vendor(i,n1,d));
	    }
	    else if(op==2)
	    {
	      System.out.println("Enter the ID to remove:");
	      int i=s.nextInt();
	      sc.removeData(i);
	    }	
	    else if(op==3)
	    {
	      System.out.println("Enter the ID to Update:");
	      int i=s.nextInt();
	      System.out.println("Enter the new Name:");
	      String st=s.nextLine();
	      String st1=s.nextLine();
	      sc.updateData(i, st1);
	    }
	    else if(op==4)
	    {
	      System.out.println("Enter the ID:");
	      int i=s.nextInt();
	      Vendor v= sc.getData(i);
	      if(v!=null)
	       System.out.println("\nExpected Data:"+v);
	    }	
	    else
	    	System.out.println("\nPlease Enter Valid Option..");
	         
	              
	    System.out.println("\nContainer Closed..");
	}
}
