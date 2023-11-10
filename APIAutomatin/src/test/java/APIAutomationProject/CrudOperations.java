package APIAutomationProject;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import APIAutomationProject.APIAutomatin.App;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CrudOperations extends App {
	
  @Test (priority = 1)
  public void getMethod() {
	  RestAssured.baseURI ="http://localhost:3000";
		given().contentType(ContentType.JSON).when()
		.get("/posts")
		.then().log().all().assertThat().statusCode(200);
  }
  @Test (priority = 2)
  public void postMethod() {
	  RestAssured.baseURI ="http://localhost:3000";
	  String data ="{\r\n"
  			+ "        \"firstName\": \"Ajay\",\r\n"
  			+ "        \"lastName\": \"Pande\",\r\n"
  			+ "        \"age\": 20,\r\n"
  			+ "        \"address\": \"Aurangabad\",\r\n"
  			+ "        \"phone-Number\": \"7354455845\"\r\n"
  			+ "    }";
	  
		given().contentType(ContentType.JSON).body(data)
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201);
  }
  @Test (priority = 3)
  public void getSinglePerson() {
	  RestAssured.baseURI ="http://localhost:3000";
		given().contentType(ContentType.JSON).when()
		.get("/posts/22")
		.then().log().all().assertThat().statusCode(200);
  }
 
  @Test (priority = 4)
  public void deletePerson() {
	  RestAssured.baseURI ="http://localhost:3000";
		given().contentType(ContentType.JSON).when()
		.delete("/posts/22")
		.then().log().all().assertThat().statusCode(200);
  }
}
