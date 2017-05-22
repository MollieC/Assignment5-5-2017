package Assessment;

import java.util.ArrayList;

public class MarinaClass {
	
////////////////////Attributes////////////////////////
	private String name;
	private String address;
	public int space;
	public ArrayList<BoatClass> boatLog = new ArrayList<BoatClass>();
	
////////////////////Constructors////////////////////////
MarinaClass(String name, String address, int space){
	this.name = name;
	this.address = address;
	this.space = space;}

////////////////////Methods////////////////////////
	public String getName()
		{return this.name;}
	public void setName(String newName)
		{this.name = newName;}

	public String getAddress()
		{return this.address;}
	public void setAddress(String newAddress)
		{this.address = newAddress;}

	public int getSpace()
		{return this.space;}
	public void setSpace(int newSpace)
		{this.space = newSpace;}

	public ArrayList<BoatClass> getBoats() 
		{return boatLog;}
	public void setBoats(ArrayList<BoatClass> boats) 
		{this.boatLog = boats;}
	
	public void dockBoat(BoatClass b){
		if(boatLog.isEmpty()){
			if(b.getPersonLogBook().size() > 0){
			boatLog.add(b);
			System.out.println("Welcome to " + getName() + "!");
			}
		else if(b.getPersonLogBook().size() > 0){
			boatLog.add(b);
			System.out.println("Welcome to " + getName() + "!");
			}
		}
	}
}

//I created the object class for the Marina object with attributes, methods and constructors.
//But this time I also made another arrayList to hold the boat information, and subsequently made a method to 
//add boats to this arrayList depending on whether there were people in the boat. If the boat is empty, the 
//program will run through the personLogBook arrayList and check to see if the boat has more than 0 people in it- 
//if it does then it can enter the marina. The 'else if' statement does the same but even if the marina isn't empty
//I didn't quite have time to sort out the next part of Stage 4, where the boat can't enter if the marina is full.