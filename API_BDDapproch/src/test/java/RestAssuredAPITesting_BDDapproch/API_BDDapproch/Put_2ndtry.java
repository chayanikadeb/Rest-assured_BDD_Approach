package RestAssuredAPITesting_BDDapproch.API_BDDapproch;


	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;

import java.util.HashMap;
	public class Put_2ndtry {
		public static HashMap map=new HashMap();
		
		String empName=Restutil.empName();
		String empSal=Restutil.empSal();
		String empAge=Restutil.empAge();
		int emp_Id=12260;

		@BeforeClass
		public void putData()
		{
		
		map.put("name",empName);
		map.put("salary",empSal);
		map.put("age",empAge);
		}
		
		@Test
	 public void getweatherDetails() {
			
		 given()
		    .when()
			.put(" http://dummy.restapiexample.com/api/v1/employee/12279")
		    .then()
		    .statusCode(200)
		    .header("Content-type", "application/json");
	 }
	}



