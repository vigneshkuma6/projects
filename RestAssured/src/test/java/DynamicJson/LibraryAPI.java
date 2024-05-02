package DynamicJson;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basic.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class LibraryAPI {

	@Test(dataProvider = "BooksData")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";

		String response = given().log().all().relaxedHTTPSValidation().header("Content-Type", "application/json")
				.body(Payload.addBook(isbn, aisle)).when().post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath js = new JsonPath(response);
		String id = js.get("ID");
		System.out.println(id);
	}

	@DataProvider(name = "BooksData")
	public Object[][] getData() {
		return new Object[][] { { "234", "abc" }, { "897", "oil" }, { "098", "fhj" } };
	}
}
