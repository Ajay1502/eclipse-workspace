package APIAutomationProject;
import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class CrudOperation {

	@Test(priority = 1)
	public void postRequest() {
		RestAssured.baseURI="http://localhost:3000";
		JSONObject obj = new JSONObject();
		obj.put("firstName", "Pavan");
		obj.put("lastName", "Pande");
		obj.put("age", "25");
		obj.put("address", "Aurangabad");
		obj.put("phone-Number", "8555489632");
		
		
		 given().contentType(ContentType.JSON).log().all().body(obj.toString())
		 .when().post("/posts")
		.then().assertThat().statusCode(201);
		
	}
	@Test(priority = 2)
	  public void getRequest() {
		  RestAssured.baseURI ="https://abhaypande123.s3.amazonaws.com";
			given().contentType(ContentType.JSON)
			.when().get("/db.json")
			.then().log().all().assertThat().statusCode(200);
	  }
	@Test(priority = 3)
	public void putRequest() {
		RestAssured.baseURI="http://localhost:3000";
		JSONObject js = new JSONObject();
		js.put("firstName", "Abhi");
		js.put("lastName", "Wagh");
		js.put("age", "25");
		js.put("address", "Aurangabad");
		js.put("phone-Number", "8555489632");
		given().contentType(ContentType.JSON).log().all().body(js.toString())
		 .when().put("/posts/22")
		.then().assertThat().statusCode(200);
	}
	@Test(priority = 4)
	public void patchMethod() {
		RestAssured.baseURI = "http://localhost:3000";
		JSONObject js = new JSONObject();
		js.put("firstName", "om");
		js.put("lastName", "Wagh");
		js.put("age", "25");
		js.put("address", "Aurangabad");
		js.put("phone-Number", "8555489632");
		given().contentType(ContentType.JSON).body(js.toString())
		.when().patch("/posts/22")
		.then().log().all().assertThat().statusCode(200);
	}
	@Test(priority = 5)
	public void deleteRequst() {
		RestAssured.baseURI="http://localhost:3000";
		given().contentType(ContentType.JSON)
		.when().delete("/posts/23")
		.then().log().all().assertThat().statusCode(200);
	}
	
	
	
	
}
