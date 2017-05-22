package Assessment;

public class PersonClass {

////////////////////Attributes////////////////////////
	private String firstName;
	private String secondName;
	private String dob;
	private String nationality;
	private String visaInfo;
	private boolean isCaptain;
	private boolean isOwner;
		
////////////////////Constructors////////////////////////
//For people with VisaInfo
PersonClass(String firstName, String secondName, String dob, String nationality, String visaInfo, boolean isOwner, boolean isCaptain){
	this.firstName = firstName;
	this.secondName = secondName;
	this.dob = dob;
	this.nationality = nationality;
	this.visaInfo = visaInfo;
	this.isCaptain = isCaptain;
	this.isOwner = isOwner;} 
	
//For people with no VisaInfo
PersonClass(String firstName, String secondName, String dob, String nationality, boolean isOwner, boolean isCaptain){
	this.firstName = firstName;
	this.secondName = secondName;
	this.dob = dob;
	this.nationality = nationality;
	this.isCaptain = isCaptain;
	this.isOwner = isOwner;}

//To be able to add to an array without the Boolean operators (no visa)
PersonClass(String firstName, String secondName, String dob, String nationality){
	this.firstName = firstName;
	this.secondName = secondName;
	this.dob = dob;
	this.nationality = nationality;}
	
//To be able to add to an array without the Boolean operators (with visa)
PersonClass(String firstName, String secondName, String dob, String nationality, String visaInfo){
	this.firstName = firstName;
	this.secondName = secondName;
	this.dob = dob;
	this.nationality = nationality;
	this.visaInfo = visaInfo;}

////////////////////Methods////////////////////////
	public String getFirstName()
		{return this.firstName;}
	public void setFirstName(String newFirstName)
		{this.firstName = newFirstName;}
	
	public String getSecondName()
		{return this.secondName;}
	public void setSecondName(String newSecondName)
		{this.secondName = newSecondName;}

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
	public void setVisaInfo(String newVisaInfo)
		{this.visaInfo = newVisaInfo;}
	
	public boolean getIsCaptain()
		{return this.isCaptain;}
	public void setIsCaptain(boolean newIsCaptain)
		{this.isCaptain = newIsCaptain;}

	public boolean getIsOwner()
		{return this.isOwner;}
	public void setIsOwner(boolean newIsOwner )
		{this.isOwner = newIsOwner;}

}

//I created a person object, with attributes, constructors (to be used when I call the instance of the object in another class)
//and getters and setters as a means of encapsulation (as I've made the attributes private, they can only be accessed
//via getters and setters in public classes). In order to create the crew/owner, I made the attributes of isOwner, and isCaptain
//boolean. I'm assuming that similarly to the 'speed' attribute of the boat, these would be entered in the text file
//or hard coded into the program later. 



