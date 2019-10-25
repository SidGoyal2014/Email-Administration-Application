import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class MAIN{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int x;
		String fname,lname,dpart;
		System.out.println("Enter 1 if want to add new entry\nOr\nEnter 2 if you want to see the details");
		x = s.nextInt();
		if(x==1){
			email obj = new email();

			System.out.print("Enter first name: ");
			fname = s.next();

			System.out.print("Enter last name:");
			lname = s.next();

			System.out.print("Enter department name: ");
			dpart = s.next();

			System.out.println("Official email address is: "+obj.email_syntax(fname,lname,dpart));

			System.out.println("The password is: "+obj.random_password());
			
			obj.append_in_file();

		}

		else{
			email obj = new email();
			obj.Readfile();
		}
	}
}