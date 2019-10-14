package de.htwberlin.prog2.ws1920;

public class Starter {

	public static void main(String[] args) {
		
		Address privateAdresse = new Address("10559", "Stephan Str.", "10A", "BERLIN");
		Guest matt = new Guest("Matt", privateAdresse );
		
	}
}
