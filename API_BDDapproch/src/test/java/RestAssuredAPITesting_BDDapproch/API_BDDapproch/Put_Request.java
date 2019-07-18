package RestAssuredAPITesting_BDDapproch.API_BDDapproch;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.*;

public class Put_Request {
	
	public static HashMap map=new HashMap();
	
	String empName=Restutil.empName();
	String empSal=Restutil.empSal();
	String empAge=Restutil.empAge();
	int emp_Id=12279;
	
	
	@BeforeClass
	public void putData()
	{
	
	map.put("name",empName);
	map.put("salary",empSal);
	map.put("age",empAge);
	System.out.println("Hashmap"+map);
	
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/update/"+ emp_Id;
	System.out.println(RestAssured.baseURI+RestAssured.basePath);
	
}
	@Test
	private void Post() {
		
		
		given()
		 .contentType("application/json")
		 .body(map)
		    .when()
			.put()
			 .then()
		    .statusCode(200)
		    .log().all();
	}
	
	

}
