import java.io.*;
import java.util.Scanner;

class email{

	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String off_email;
	private String str;

	// email syntax generator

	String email_syntax(String firstname,String lastname,String department){
		this.off_email = firstname+"."+lastname+"@"+department+"."+"ebizeo.in";
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		return (this.off_email);
	}

	// generate random password

	String random_password(){
		String password_old;
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz"+"!@#$%^&*()_+"; 
  	
        	// create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(12); 
  
               	for (int i = 0; i < 12; i++) { 
  	        	// generate a random number between 
  	        	// 0 to AlphaNumericString variable length 
  	        	int index = (int)(AlphaNumericString.length() * Math.random()); 
  	
          		// add Character one by one in end of sb 
           		sb.append(AlphaNumericString .charAt(index)); 
        	}
		this.password = sb.toString();
        	return (this.password); 
	}

	// change of password

	String password_change(String new_password){
		this.password = new_password;
		return (this.password);
	}

	void append_in_file(){
		try{
			FileWriter email_writer = new FileWriter("emails.txt",true);
			str = ("\n"+(this.off_email));
			email_writer.write(str);
			email_writer.close();
			System.out.println("e-mail recorded successfully");
		}

		catch(IOException e){
			System.out.println("An error occured...please try again later");
			e.printStackTrace();
		}

		try{

			FileWriter password_writer = new FileWriter("passwords.txt",true);
			str = ("\n"+(this.password));
			password_writer.write(str);
			password_writer.close();
			System.out.println("password recorded successfully");
		}			
		catch(IOException e){
			System.out.println("An error occured...please try again later");
			e.printStackTrace();
		}

		try{

			FileWriter fname_writer = new FileWriter("firstnames.txt",true);
			str = ("\n" + (this.firstname));
			fname_writer.write(str);
			fname_writer.close();
			System.out.println("First name recorded successfully");
		}
		catch(IOException e){
			System.out.println("An error occured...please try again later");
			e.printStackTrace();
		}

		try{
	
			FileWriter lname_writer = new FileWriter("lastnames.txt",true);
			str = ("\n" + (this.lastname));
			lname_writer.write(str);
			lname_writer.close();
			System.out.println("last name recorded successfully");
		}
		catch(IOException e){
			System.out.println("An error occured...please try again later");
			e.printStackTrace();
		}

		try{

			FileWriter dpart_writer = new FileWriter("departments.txt",true);
			str = ("\n" + (this.department));
			dpart_writer.write(str);
			dpart_writer.close();
			System.out.println("department recorded successfully");
		}
		catch(IOException e){
			System.out.println("An error occured...please try again later");
			e.printStackTrace();
		}

	}

	// reading from the file

	void Readfile(){
			// Reading emails
		try {
			System.out.println("Emails: \n");

      			File myObj = new File("emails.txt");
	      		Scanner myReader = new Scanner(myObj);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
        			System.out.println(data);
      			}
	      		myReader.close();
    		}
		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

			// Reading firstnames

		try {
			System.out.println("Firstnames: \n");

      			File myObj = new File("firstnames.txt");
	      		Scanner myReader = new Scanner(myObj);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
        			System.out.println(data);
      			}
	      		myReader.close();
    		}
		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

			// Reading lastnames

		try {
			System.out.println("Lastnames:\n");

      			File myObj = new File("lastnames.txt");
	      		Scanner myReader = new Scanner(myObj);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
        			System.out.println(data);
      			}
	      		myReader.close();
    		}
		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

			// Reading departments

		try {
			System.out.println("departments: \n");

      			File myObj = new File("departments.txt");
	      		Scanner myReader = new Scanner(myObj);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
        			System.out.println(data);
      			}
	      		myReader.close();
    		}
		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

			// Reading passwords

		try {
			System.out.println("Passwords: \n");

      			File myObj = new File("passwords.txt");
	      		Scanner myReader = new Scanner(myObj);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
        			System.out.println(data);
      			}
	      		myReader.close();
    		}
		catch (FileNotFoundException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
	}
}