package sgt;

public class Logger {
	private Logger() {
		System.out.println("object created!");
	}
	private static Logger instance = new Logger();
	
	public static Logger getInstance() {
		return instance;
	}
	public void log(String message) {System.out.println("LOG: "+message);}
}
