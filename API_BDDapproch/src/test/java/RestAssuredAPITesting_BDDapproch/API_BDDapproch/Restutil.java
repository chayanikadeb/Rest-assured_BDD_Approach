package RestAssuredAPITesting_BDDapproch.API_BDDapproch;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutil {
	
	public static String getfirstname() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("Kenedy" + generatedString);
	}
	public static String getLastname() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("John" + generatedString);
}
	public static String getUsername() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return("John" + generatedString);
}
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("Kenedy" + generatedString);
}
	public static String getemail() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return( generatedString +"gmail.com");
		
		
}

	public static String empName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return( "John" + generatedString);
}
	public static String empSal() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		return(generatedString);
	}
	public static String empAge() {
		String generatedString = RandomStringUtils.randomNumeric(2);
		return(generatedString);
	}
}