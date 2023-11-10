package APIAutomationProject;

import org.testng.Assert;
import org.testng.annotations.*;
import file.Data;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class EndToEndTest {

	@Test
	public void endToEndTestCase() {
		
		RestAssured.baseURI = "http://localhost:3000";
		given().contentType(ContentType.JSON)
		.when().get("/posts")
		.then().log().all().assertThat().statusCode(200);
		given().contentType(ContentType.JSON).body(Data.payloadDataEnd())
		.when().post("/posts")
		.then().log().all().assertThat().statusCode(201);
		String response = given().contentType(ContentType.JSON)
		.when().get("/posts")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		 String firstName = js.getString("firstName[22]");
		 Assert.assertEquals(firstName, "Sambhaji");
		given().contentType(ContentType.JSON)
		.when().delete("/posts/23")
		.then().log().all().assertThat().statusCode(200);
	}
}
