package sgt;

public class Main {
	public static void main(String [] args) {
		Logger log1 = Logger.getInstance();

		Logger log2 = Logger.getInstance();
		
		System.out.println(log1 == log2);
		
		log1.log("Application Started");

		log2.log("Student Registered");

		log1.log("Email Sent");
	}
	
	

}
