import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User{
	Scanner input = new Scanner(System.in);
    Admin(String username, String password) {
        super(username, password);
        job = "Admin";
    }
   
    Admin(){
    	System.out.println("Welcome Admin!");
        adminSystemManager();
    }

    private void adminSystemManager(){
        Scanner input = new Scanner(System.in);
      System.out.println("1.Categories");
      System.out.println("2.Events");
    	  int choice1=input.nextInt();
      if(choice1==1) {
    	  System.out.println("Category:-");
    	  System.out.println("1.Add category");
    	  System.out.println("2.edit category");
    	  System.out.println("3.delete category");
    	  System.out.println("4.show categories");
    	  int operation=input.nextInt();
    	  if(operation==1) {
    		  addcategory();
    		  adminSystemManager();
    	  }
    	  else if(operation==2) {
    		  if(Category.categories.size()==0) {
    			  System.out.println("there are no listed categories!");
    		  }else {
    		  editcategory();
    		  adminSystemManager();
    		  }
    	  }
    	  else if(operation==3) {
    		  if(Category.categories.size()==0) {
    			  System.out.println("there are no listed categories!");
    		  }else {
    		  deletecategory();
    		  adminSystemManager();
    		  }
    	  }
    	  else if(operation==4) {
    		  if(Category.categories.size()==0) {
    			  System.out.println("there are no listed categories!");
    		  }
    		  else {
    			  
    		  for (int i = 0; i <  Category.categories.size(); i++) {
        	      System.out.println((i+1)+") "+ Category.categories.get(i).name);
    		  }
    		  adminSystemManager();
    		  }
    	  }
    		  
      }
      ///////////////////events/////////////////
      else if(choice1==2) {
    	 System.out.println("select category");
    	for (int i = 0; i <  Category.categories.size(); i++) {
   	      System.out.println((i+1)+") "+ Category.categories.get(i).name);
		  }
    	  int category_choice=input.nextInt();
    	  category_choice--;
    	 
    	  System.out.println("1.Add event");
    	  System.out.println("2.edit event");
    	  System.out.println("3.delete event");
    	  System.out.println("4.show events");
    	  int operation=input.nextInt();
    	  if(operation==1) {
    	addevent(category_choice);
    	 adminSystemManager();
    	  }
    	  else if(operation==2) {
    		  if((Category.categories.get(category_choice)).events.size()!=0) {
    		  editevent(category_choice);
    		  }else {
    			  System.out.println("there are no events listed in this category!");
    		  }
    		  adminSystemManager();
    	  }
    	  else if(operation==3) {
    		  if((Category.categories.get(category_choice)).events.size()!=0) {
    		  delete_event(category_choice);
    		  }else {
    			  System.out.println("there are no events listed in this category!");
    		  }
    		  adminSystemManager();
    	  }
    	  else if(operation==4) {
    		  if((Category.categories.get(category_choice)).events.size()!=0) {
    			 for (int i = 0; i <  (Category.categories.get(category_choice)).events.size(); i++) {
    		   	      System.out.println((i+1)+") "+ (Category.categories.get(category_choice)).events.get(i).name);
    		   	   System.out.println((Category.categories.get(category_choice)).events.get(i).description);
    		   	    }}else {
    		   	    	System.out.println("there are no events listed in this category!");
    		   	    }
    			 adminSystemManager();
    	  }
    	  
      }
  
      }
    
    //////////////////////////////////
    
    private void addcategory() {
    	
    	System.out.println("Enter Category name: ");
    	String name=input.nextLine();
    	
    	 Category.categories.add(new Category(name));
    
    	System.out.println("Category Created!");
    }
    private void editcategory() {
    	System.out.println("please choose which category you want to edit:-");
    	 for (int i = 0; i <  Category.categories.size(); i++) {
    	      System.out.println((i+1)+") "+ Category.categories.get(i).name);
    	    }
    	int num= input.nextInt();
    	num--;
    	System.out.println("Enter new name: ");
    	String name=input.nextLine();
    	Category.categories.get(num).editname(name);
}
    private void deletecategory() {
    	System.out.println("please choose which category you want to delete:-");
   	 for (int i = 0; i <  Category.categories.size(); i++) {
   	      System.out.println((i+1)+") "+ Category.categories.get(i).name);
   	    }
   	int num= input.nextInt();
   	num--;
   	Category.categories.remove(num);
   	System.out.println("Category deleted! ");
    }
    
    /////////////////events////////////////////
    
   private void addevent(int category_choice) {
		  System.out.println("name: ");
			String name=input.nextLine();
			  System.out.println("location: ");
			String place=input.nextLine();
			 System.out.println("date: ");
			String date=input.nextLine();
			 System.out.println("time: ");
			String time=input.nextLine();
			System.out.println("number of available tickets: ");
			int tickets=input.nextInt();
			System.out.println("description (optional): "); 
			input.nextLine();
			String description=input.nextLine();
		
			(Category.categories.get(category_choice)).events.add(new Event(name,place,date,time,tickets,description));
		 
		  }
    private void editevent(int category_choice) {
    	System.out.println("please choose which Event you want to edit:-");
    	 for (int i = 0; i <  (Category.categories.get(category_choice)).events.size(); i++) {
   	      System.out.println((i+1)+") "+ (Category.categories.get(category_choice)).events.get(i).name);
   	    }
    	 int num= input.nextInt();
     	num--;
     	System.out.println((Category.categories.get(category_choice)).events.get(num).name);
     	System.out.println("edit:- ");
     	  System.out.println("name: ");
			String name=input.nextLine();
			  System.out.println("location: ");
			  input.nextLine();
			String place=input.nextLine();
			 System.out.println("date: ");
			 input.nextLine();
			String date=input.nextLine();
			 System.out.println("time: ");
			 input.nextLine();
			String time=input.nextLine();
			System.out.println("number of available tickets: ");
			int tickets=input.nextInt();
			input.nextInt();
			System.out.println("description: "); 
			
			String description=input.nextLine();
			(Category.categories.get(category_choice)).events.get(num).editevent(name,place,date,time,tickets,description);
			
		}
    private void delete_event(int category_choice) {
    	System.out.println("please choose which event you want to delete:-");
   	 for (int i = 0; i <  (Category.categories.get(category_choice)).events.size(); i++) {
   	      System.out.println((i+1)+") "+ (Category.categories.get(category_choice)).events.get(i).name);
   	    }
   	int num= input.nextInt();
   	num--;
   	(Category.categories.get(category_choice)).events.remove(num);
   	System.out.println("Category deleted! ");
    }
    
    }
    
