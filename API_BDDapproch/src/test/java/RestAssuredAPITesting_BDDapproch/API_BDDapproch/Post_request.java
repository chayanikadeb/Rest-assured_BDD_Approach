package RestAssuredAPITesting_BDDapproch.API_BDDapproch;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class Post_request {
	
	public static HashMap map=new HashMap();
@BeforeClass
public void postdata() {
	map.put("FirstName",Restutil.getfirstname());
	map.put("LastName", Restutil.getLastname());
	map.put("Password", Restutil.getPassword());
	map.put("Email", Restutil.getemail());
	RestAssured.baseURI="http://restapi.demoqa.com/customer";
	RestAssured.basePath="/register";
	
	System.out.println(RestAssured.baseURI+RestAssured.basePath);
	}
		

@Test
private void Post() {
	
	
	given()
	 .contentType("application/json")
	 .body(map)
	    .when()
		.post()
		
	    .then()
	    .statusCode(400);
	   // .body("SuccessCode", equalTo("OPERATION_SUCCESS"));
	  
	   
	   
	
}


}





