package RestAssuredAPITesting_BDDapproch.API_BDDapproch;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Get_Weatherreport {
	
	@Test(priority=1)
 public void getweatherDetails() {
		
	 given()
	    .when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
	    .then()
	    .statusCode(200)
       .assertThat().body("City", equalTo("Hyderabad"))
	   .header("Content-type", "application/json")
	    .log().all();
 }
	@Test(priority=2)
 public void singleuserDetails() {
		
	 given()
	    .when()
		.get("https://reqres.in/api/users/2")
	    .then()
	    .statusCode(200)
      .body("data.first_name", equalTo("Janet"))
	   .header("Content-type", "application/json; charset=utf-8");
	    //.log().all();
 }
	
	@Test(priority=3)
	 public void resourseDetails() {
			
		 given()
		    .when()
			.get("https://reqres.in/api/unknown")
		    .then()
		    .statusCode(200)
	    .body("data[2].name", equalTo("true red"))
		   .header("Content-type", "application/json; charset=utf-8")
		    .log().all();
	 }
	
	
}
