package Basic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		// Post Method
		String response = given().log().all().relaxedHTTPSValidation().queryParam("key ", "qaclick123")
				.header("Content-Type", "application/json").body(Payload.addPlace()).when()
				.post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).extract().response().asString();
		JsonPath js = new JsonPath(response);
		String placeId = js.getString("place_id");
		System.out.println(placeId);

		// PUT Method
		String addressupdate = "70 Summer walk, USA";
		given().log().all().relaxedHTTPSValidation().queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + addressupdate + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// GET Method
		String getResponse = given().log().all().relaxedHTTPSValidation().queryParam("key", "qaclick123")
				.queryParam("place_id", placeId).when().get("maps/api/place/get/json").then().log().all()
				.statusCode(200).extract().response().asString();
		JsonPath js1 = new JsonPath(getResponse);
		String newAddress = js1.getString("address");
		System.out.println(newAddress);
	}

}
