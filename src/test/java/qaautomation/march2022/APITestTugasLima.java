package qaautomation.march2022;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class APITestTugasLima {

	String username, password, email, phonenumber;
	String messageCreated = "";

	@Test(priority = 1)
	public void testSuccessRegisterAPI() {
		
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		Faker faker = new Faker();
		username = faker.name().fullName(); 
		password = "testlabs";
		email = faker.name().username() + "@gmail.com";
		phonenumber = faker.phoneNumber().cellPhone();
		String registerPayload = "{\"username\":\""+username+"\", \"password\":\""+password+"\", \"email\":\""+email+"\", \"phonenumber\":\""+phonenumber+"\"}";
		//RestAssured.given().contentType("application/json").body(registerPayload).when().post("/register").then()
		//		.assertThat().statusCode(201);
		Response responseRegister = RestAssured.given().contentType("application/json").body(registerPayload).when().post("/register");
		ResponseBody<?> messageCreated = responseRegister.getBody();
		System.out.println(registerPayload);
		messageCreated.print();
		assertEquals(responseRegister.getStatusCode(), 201);
	}
	
	@Test(priority = 2)
	public void testRegisterAlreadyRegistered() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		//Register dengan Data yang sudah pernah terdaftar
		username = "alfifarikh";
	    password = "belajarapi";
	    email = "alfibelar@gmail.com";
	    phonenumber = "220796303";
		String registerPayload = "{\"username\":\""+username+"\", \"password\":\""+password+"\", \"email\":\""+email+"\", \"phonenumber\":\""+phonenumber+"\"}";
		Response responseRegister = RestAssured.given().contentType("application/json").body(registerPayload).when().post("/register");
		ResponseBody<?> messageCreated = responseRegister.getBody();
		System.out.println(registerPayload);
		messageCreated.print();
		assertEquals(responseRegister.getStatusCode(), 400);
	}

}
