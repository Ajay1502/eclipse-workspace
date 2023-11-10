package APIAutomationProject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class body {
	@Test
	public void getMethod() {
	RestAssured.baseURI="http://localhost:3000";
	String response = given().contentType(ContentType.JSON)
	.when().get("/posts")
	.then().assertThat().statusCode(200).body("firstName[20]",equalTo("Pradip") )
	.extract().response().asString();
	System.out.println(response);
	JsonPath js = new JsonPath(response);
	 String firstName = js.getString("firstName[20]");
	
	 if (firstName.equals("Pradip")) 
		System.out.println("name matched");
	 else 
		System.out.println("name not matched");
	
	}
	@Test 
	public void postMethod() {
		
		RestAssured.baseURI = "http://localhost:3000";
		JSONObject obj = new JSONObject();
		obj.put("firstName", "Pavan");
		obj.put("lastName", "Pande");
		obj.put("age", "25");
		obj.put("address", "Aurangabad");
		obj.put("phone-Number", "8555489632");
		
		given().contentType(ContentType.JSON).body(obj.toString())
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201).body("firstName[21]",equalTo("Pavan") ).extract().response().asString();
	}

	
	
	
}
