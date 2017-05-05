public class MarinaClass {
////////////////////Attributes////////////////////////
	private String name;
	private String address;
	public int space;
	
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

}
//I did the same here, I created the object class for the marina object with attributes, methods and constructors.