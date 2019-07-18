package RestAssuredAPITesting_BDDapproch.API_BDDapproch;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

public class validations_in_XML_Response {
	
	//Verifying Single content in XML Response
	
	@Test(priority=1)
	 public void singleContent() {
			
		 given()
		    .when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		    .then()
		    .body("CUSTOMER.ID", equalTo("15"))
		      .log().all();

}
	//Verifying Multiple contents in XML Response
	@Test(priority=2)
	 public void multipleContents() {
			
		 given()
		    .when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		    .then()
		    .body("CUSTOMER.ID", equalTo("15"))
		    .body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
		    .body("CUSTOMER.LASTNAME", equalTo("Clancy"))
		    .body("CUSTOMER.STREET", equalTo("319 Upland Pl."))
		    .body("CUSTOMER.CITY", equalTo("Seattle"))
		      .log().all();
}
	//Verifying all the content in XML response in one go and XPath with text() function
	@Test(priority=2)
	 public void onego() {
			
		 given()
		    .when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		    .then()
		    .body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"))
		    .log().all();
}
	//Find values using XML Path in XML response 

	@Test(priority=5)
	 public void XMLresponse () {
			
		 given()
		    .when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		    .then()
		    .body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Bill")));
		      

}

	
	@Test(priority=5)
	 public void response() {
			
		 given()
		    .when()
			.get("http://thomas-bayer.com/sqlrest/INVOICE/")
		    .then()
		    .body(hasXPath("/INVOICEList/INVOICE[text()='30']"))
		    .log().all();
		 
		      
}
	
	}
	