package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("info: " + msg);
	}
	public static void error (String msg) {
		System.out.println("error: " + msg);
	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: " + num);
	}
	public static void info (int num) {
		System.out.println("info: " + num);
	}
	public static void error (int num) {
		System.out.println("error: " + num);
	}
	
	public static void main(String[] args) {
	debug("here is your debugged code");
		error("Incompatible types: Found 'int', required 'String'");
	info("Hey this id info message");
System.out.println();
	debug(12);
	error(896543);
info(45521577);
	}
}
