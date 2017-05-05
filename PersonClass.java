import java.util.ArrayList;

public class PersonClass {

////////////////////Attributes////////////////////////
	private String firstName;
	//private String secondName;
	private String dob;
	private String nationality;
	private String visaInfo;
	//private String status; 
//	private ArrayList<BoatObject> boat = new ArrayList<BoatObject>();//to assign the boat to a person
	
////////////////////Constructors////////////////////////
	PersonClass(String firstName, String dob, String nationality, String visaInfo){
		this.firstName = firstName;
		//this.secondName = secondName;
		this.dob = dob;
		this.nationality = nationality;
		this.visaInfo = visaInfo;} 
	
////////////////////Methods////////////////////////
	public String getFirstName()
		{return this.firstName;}
	public void setFirstName(String newFirstName)
		{this.firstName = newFirstName;}
	
	//public String getSecondName()
	//	{return this.secondName;}
	//public void setSecondName(String newSecondName)
	//	{this.secondName = newSecondName;}

	public String getDob()
		{return this.dob;}
	public void setDob(String newDob)
		{this.dob = newDob;}

	public String getNationality()
		{return this.nationality;}
	public void setNationality(String newNationality)
		{this.nationality = newNationality;}

	public String getVisaInfo()
		{return this.visaInfo;}
	public void setVisaInfor(String newVisaInfo)
		{this.visaInfo = newVisaInfo;}
	
	//public String getStatus()
		//{return this.status;}
	//public void setStatus(String newStatus)
		//{this.status = newStatus;}
	
	//public void ownBoat(BoatObject b) {
	//	boat.add(b);
	//}

	//public ArrayList<BoatObject> getBoat() {
		//return boat;
	//}

	//public void setAnimals(ArrayList<BoatObject> boats) {
	//	this.boat = boat;
}
//}

//I created a person object, with attributes, constructors (to be used when I call the instance of the object in another class)
//and getters and setters as a means of encapsulation (as I've made the attributes private, they can only be accessed
//via getters and setters in public classes).
//I also added a status attribute, which, when called, will assign a person a status of Crew, Captain or Owner(until I do, they
//just need to be commented out.
//The array attribute was also added to help with assigning the boats to people. Because of this there is an ownBoat method
//included in this class which is called upon later. There are also getters and setters because of the fact that
//the ownership of the boat is a private attribute.