package EndToEnd;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Ecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();

		LoginRequest loginrequest = new LoginRequest();
		loginrequest.setUseremail("vicky@gmail.com");
		loginrequest.setPassword("vicky123");

		RequestSpecification reqLogin = given().relaxedHTTPSValidation().log().all().spec(req).body(loginrequest);
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract()
				.response().as(LoginResponse.class);

		String token = loginResponse.getToken();
		String userID = loginResponse.getUserId();
		// ADD Product

		RequestSpecification addProductBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).build();

		RequestSpecification reqAddProduct = given().relaxedHTTPSValidation().log().all().spec(addProductBaseReq)
				.param("productName", "laptop").param("productAddedBy", userID).param("productCategory", "fashion")
				.param("productSubCategory", "shirt").param("productPrice", "11500")
				.param("productDescription", "Lenova").param("productFor", "men")
				.multiPart("productImage", new File("file path"));

		String addProductres = reqAddProduct.when().post("/api/ecom/product/add-product").then().log().all().extract()
				.response().asString();
		JsonPath js = new JsonPath(addProductres);
		String productID = js.get("productId");

		// Create order
		RequestSpecification createOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).setContentType(ContentType.JSON).build();

		OrderDetails orderDetail = new OrderDetails();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderId(productID);

		List<OrderDetails> orderDetaiList = new ArrayList<OrderDetails>();
		orderDetaiList.add(orderDetail);
		Orders orders = new Orders();
		orders.setOrders(orderDetaiList);

		RequestSpecification createReq = given().relaxedHTTPSValidation().log().all().spec(createOrderBaseReq)
				.body(orders);
		String responseAddOrder = createReq.when().post("/api/ecom/order/create-order").then().log().all().extract()
				.response().asString();

		System.out.println(responseAddOrder);

		// Delete order

		RequestSpecification deleteOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token).setContentType(ContentType.JSON).build();
		RequestSpecification deleteProductReq = given().relaxedHTTPSValidation().log().all().spec(deleteOrderBaseReq)
				.pathParam("productId", productID);
		String deleteProductResponse = deleteProductReq.when().delete("/api/ecom/product/delete-product/{productId}")
				.then().log().all().extract().response().asString();

		JsonPath j = new JsonPath(deleteProductResponse);
		Assert.assertEquals("Product Deleted Successfully", j.get("message"));

	}

}
