import java.util.ArrayList;

public class Event  {
	//static ArrayList<Event> events = new ArrayList<Event>();
	String name;
String place;
String date;
String time;
String description;
int tickets;
	Event(String name,String place,String date,String time,int tickets,String description){
	this.name= name;
	this.place=place;
	this.date=date;
	this.time=time;
	this.description=description;
	this.tickets=tickets;
	System.out.println("Event added!");
}
	void editevent(String name,String place,String date,String time,int tickets,String description) {
		this.name= name;
		this.place=place;
		this.date=date;
		this.time=time;
		this.description=description;
		this.tickets=tickets;
		System.out.println("Event updated!");
	}
	
}
