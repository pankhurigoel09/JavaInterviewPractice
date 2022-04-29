//package RestApi;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//
//import static io.restassured.RestAssured.given;
//
//public class RestAssuredRequest{
//
//    public static void setup()
//    {
//
//    }
//
//    public static void getRequest()
//    { RestAssured.baseURI("https://gorest.co.in/");
//
//        Reponse reponse=given().contentType(ContentType.JSON).when().
//                get("/public/v2/users/2713").then().extract().response();
//        Assertions.assertEquals(200, response.statusCode());
//        Assertions.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
//
//    }
//}
