import java.util.ArrayList;

public class Category {
	static ArrayList<Category> categories = new ArrayList();

	 String name;
	
	 ArrayList<Event> events = new ArrayList<Event>();
	
	 Category(String name){
	this.name=name;
	 
	 }
	 
	 void editname(String name){	 
		this.name=name;
		System.out.println("Name changed!");
	}
}