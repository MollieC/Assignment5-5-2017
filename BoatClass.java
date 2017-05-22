package Assessment;

import java.util.ArrayList;

public class BoatClass implements Vehicle {
	
////////////////////Attributes////////////////////////
	private String name;
	private String originCountry;
	private double size;
	private int speed;
	PersonClass captain;
	private ArrayList<PersonClass> personLogBook = new ArrayList<PersonClass>();
	
////////////////////Constructors////////////////////////
	BoatClass(String name, String originCountry, double size, int speed){
		this.name = name;
		this.originCountry = originCountry;
		this.size = size;
		this.speed = speed;}
	
	BoatClass(String name, String originCountry, double size){
		this.name = name;
		this.originCountry = originCountry;
		this.size = size;}

////////////////////Methods////////////////////////
	public String getName()
		{return this.name;}
	public void setName(String newName)
		{this.name = newName;}
	
	public String getOriginCountry()
		{return this.originCountry;}
	public void setOriginCountry(String newOriginCountry)
		{this.originCountry = newOriginCountry;}

	public double getSize()
		{return this.size;}
	public void setSize(double newSize)
		{this.size = newSize;}
	
	public ArrayList<PersonClass> getPersonLogBook() 
		{return personLogBook;}
	public void setBoat(ArrayList<PersonClass> personLogBook) 
		{this.personLogBook = personLogBook;}
	
	public int getSpeed() 
		{return this.speed;}
	
	//Adding people to the boat	
	public void addPerson(PersonClass p){
		if(personLogBook.isEmpty()){
			personLogBook.add(p);
			System.out.println(p.getFirstName() + ", welcome to " + getName());
			}
		else if(p.getIsCaptain() == false){
			personLogBook.add(p);
			System.out.println("Welcome " + p.getFirstName() + " to " + getName());
			}
		else if(p.getIsCaptain() == true){
			for(PersonClass p1 : personLogBook)
				if(p1.getIsCaptain() == true){
					System.out.println("Sorry, " + getName() + " already has a Captain!");
					break;
			}
		else if (p1.getIsCaptain() == false){
			personLogBook.add(p);
			System.out.println("Welcome Captian " + p.getSecondName() + " to " + getName());
			}
		}
	}

	//Inheriting from the interface
	@Override
	public void accelerate() {
		this.speed++;
		if(getSpeed() > 0){
			System.out.println("Boat Speed: " + getSpeed() + " mph");
		}
		if (getSpeed() > 100){
			System.out.println("Slow down!");
		}
	}

	@Override
	public void deccelerate() {
		this.speed--;
		if(getSpeed() <= 0){
			System.out.println("Boat has stopped");
		}
	}
	
	//Assign Captain to the boat
	public void assignCaptain(PersonClass p){
		for (PersonClass p1 : personLogBook){
			if (p1 .equals(p)){
			System.out.print(p.getFirstName() + " " + p.getSecondName() + " sorry, you can't be both captain and crew!");
			}
			else{
			captain = p;
			}
		}
}
}

//I created the boat class with the assigned attributes, including the one inherited from the interface, as well as
//creating three new arrayLists. The first one simply represents how many people are on the boat, so that the boat
//can be docked in the marina or not. I then created the constructors of the attributes, of which I made two so that when 
//reading them in from the file, java wouldn't get upset about the fact that there is no speed included in the txt file.
//I'm assuming that the speed would have to be manually entered, either in the text file, or hard coded throughout the program.
//I then created the getters and setters. I didn't manage to get to the creation of the owner.
//Next I created a method that would allow me to add a person to a boat. Essentially, if the boat is empty, then
//any person could be added to the boat. If the person was not a captain (and thus a crew member) then they could be 
//added to the boat. If the person was a captain, then the program searches through the person records and if there
//is already a captain assigned to the boat then they can't be added, but if there isn't then they can be added.
//The last part is where I created methods for the implemented abstract Vehicle interface. This involved having
//to override the methods (same name and parameter, different methods).
//As I had already declared the isCaptain and isOwner in the PersonClass, I chose to assign the captain in this section
//by calling it from the PersonClass and creating a method to assign the captain to the boat, as there wasn't any need
//for an arraylist.
