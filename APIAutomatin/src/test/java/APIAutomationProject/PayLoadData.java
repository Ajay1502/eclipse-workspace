package APIAutomationProject;

import org.testng.annotations.*;

import file.Data;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class PayLoadData {
	
	@Test
	public void createUser() {
		RestAssured.baseURI = "http://localhost:3000";
		given().header("content-type","application/json")
		.body("{\r\n"
				+ "        \"firstName\": \"Akash\",\r\n"
				+ "        \"lastName\": \"Sharma\",\r\n"
				+ "        \"age\": 20,\r\n"
				+ "        \"address\": \"Aurangabad\",\r\n"
				+ "        \"phone-Number\": \"7354455845\"\r\n"
				+ "    }")
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201);
	}
	@Test
	public void createUserWithPayload() {
		RestAssured.baseURI = "http://localhost:3000";
		given().header("content-type","application/json").body(Data.payloadData())
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201);
		given().contentType(ContentType.JSON).body(Data.payloadDataWithParameters("manoj", "pande"))
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201);
	}
}
