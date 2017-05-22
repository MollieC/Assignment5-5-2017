package Assessment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

static ArrayList<PersonClass> person = new ArrayList<PersonClass>();
static ArrayList<BoatClass> boat = new ArrayList<BoatClass>();
static ArrayList<MarinaClass> marina = new ArrayList<MarinaClass>();

	public static void main(String[] args) {
	
	String allData = readFile();
	//System.out.println(allData); this works, it prints the file thats been read in
	parseFile(allData);

	}

//////////////////////////Reading the File/////////////////////
	
public static String readFile(){
	BufferedReader br = null;
	String fileName = "stage_5_input.txt";


			try {
				br = new BufferedReader(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("File not found, please check it is in the right directory");
			}


			String allData = null;
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				allData = sb.toString();

			} catch (IOException e)
			{
				e.printStackTrace();

			} finally 

			{
				try {
					br.close(); 
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			return allData;
			}

//I created a method that would allow me to read the file. I used the buffered reader to look for information, transfer it
//and save it to a chunk of memory. Then I initiated the file I want to read in. Because of the try and catch for the 
//FileNotFound exception (which throws if the system can't find the file), I had to make the buffer null, and then create 
//a new instance and initialize it inside the curly braces. The FileReader inside the parenthesis is reading the file that 
//was assigned outside of the try and catch.
//Again, because of the input-output exception 'allData' had to be declared as null and later initialized.

///////////////////////////Parsing the File////////////////////////
public static void parseFile(String input){	
	
//Split the whole file into an array
String delim1 = "\\n[\\n]+";
String delim2 = "\\|"; 
String delim3 = "\\r?\\n";
String delim4 = "\n";
String delim5 = " ";

String[] initialSplit = input.split(delim1);

//Splitting the Marina and Populating the ArrayList
String [] marinaArray = initialSplit[1].split(delim2);
System.out.println("Marina Added");
	for(int x = 0; x < marinaArray.length; x++){
		String [] marinaData = marinaArray[x].trim().split(delim3);
		marina.add(new MarinaClass(marinaData[0].trim(), marinaData[1].trim(), Integer.parseInt(marinaData[2].trim())));
		System.out.println("\n" + "Name: " + marinaData[0] + "\n" + "Address: " + marinaData[1] + "\n" + "Space: " + marinaData[2] + " acres" + "\n");
		}

//Splitting the Boats and Populating the ArrayList
String [] boatArray = initialSplit[3].split(delim2);
System.out.println("Boat Added");
	for(int x = 0; x < boatArray.length; x++){
		String [] boatData = boatArray[x].trim().split(delim4);
		boat.add(new BoatClass(boatData[0].trim(), boatData[1].trim(), Double.parseDouble(boatData[2].trim())));
		System.out.println("\n" + "Name: "+ boatData[0] + "\n" + "Country of Origin: " + boatData[1] + "\n" + "Size: " + boatData[2] + "m\u00B2" + "\n");
		}

//Splitting the People and Populating the ArrayList
String [] personArray = initialSplit[5].split(delim2);
System.out.println("Person Added");
	for(int x = 0; x < personArray.length; x++){
		
		//Splitting the first and second name by the space
		String [] personData = personArray[x].trim().split(delim4);
		String firstName = personData[0].trim().split(delim5)[0];
		String secondName = personData[0].trim().split(delim5)[1];
		
		//Adding to the list via visa info
		if(personData[2].equals("British"))
		{
		person.add(new PersonClass(firstName, secondName ,personData[1].trim(),personData[2].trim()));
		System.out.println("\n" + "First Name: "+ firstName + "\n" + "Second Name: " + secondName + "\n" + "Date of Birth: " + personData[1] + "\n" + "Nationality: " + personData[2] + "\n");
		}
		else
		{
		person.add(new PersonClass(firstName, secondName ,personData[1].trim(),personData[2].trim(),personData[3].trim()));
		System.out.println("\n" + "First Name: "+ firstName + "\n" + "Second Name: " + secondName + "\n" + "Date of Birth: " + personData[1] + "\n" + "Nationality: " + personData[2] + "\n" + "Visa Details: " + personData[3] + "\n");
		}
}
}
}

//Apparently according to EclEmma, my coverage is at somewhere around 45%
//So in this section I began by defining the delimiters that I go on to use when parsing and splitting the files. Then 
//using the first delimiter, which splits the file by every new line and puts it into an arraylist. This then gave me
//an arraylist with 6 index points (the title marina, then the info for marina, then the title boat etc...). So 
//I had to specify that I wanted to split the index at point 1, which was the marina info. I used a for loop to go through
//the newly created marinaArray and add the objects to the arraylist. I did the same for the boats, but when it came to
//the people section, it had to be done a bit differently. I had to split the names up by the space section and add
//them to a new arrayList. Then I had to create the people arrayList, so if they were British, they would be put
//into the arrayList with the first PersonClass constructor without the visa info, but if not they would be put into
//the arraylist with the visa info. It all prints out fine.

