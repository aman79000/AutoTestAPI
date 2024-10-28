package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.Response.ResponseLogin;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class EcomTest {
    ResponseLogin rs;
    loginPage loginPage = new loginPage();
    CreateProduct createProduct = new CreateProduct();

    RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();
    ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();


@BeforeTest
    public void login(){

    loginPage.setUserEmail("Tes1t@gmail.com");
    loginPage.setUserPassword("Qwertyuiop@1");


   rs = given().spec(requestSpecification).body(loginPage).when().post("/api/ecom/auth/login").then().extract().response().as(ResponseLogin.class);

   // requestSpecification.header("token",rs.getToken());
    }
@Test
    public void CreateProduct() throws IllegalAccessException {
    RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization",rs.getToken()).build();
    HashMap<String,String> hs = new HashMap<>();
        createProduct.setProductName("Tummler");
        createProduct.setProductAddedBy(rs.getUserId());
        createProduct.setProductCategory("fashion");
        createProduct.setProductDescription("It can be used to keep the water cold and hot");
        createProduct.setProductFor("Men");
        createProduct.setProductPrice(350);
        createProduct.setProductSubCategory("shirts");
        for(Field field:createProduct.getClass().getDeclaredFields()){
            field.setAccessible(true);
            hs.put(field.getName(),String.valueOf(field.get(createProduct)));
        }
        String product=given().spec(requestSpec).
                formParams(hs).multiPart("productImage", new File("C:/Users/aman.gupta/Desktop/Screenshot_10.png")).when().post("/api/ecom/product/add-product").then().extract().response().asString();

    JsonPath  js = new JsonPath(product);
List<orders> orderList = new ArrayList<>();
    String productId = js.get("productId");
    orders or = new orders();
    getOrderss go = new getOrderss();
    or.setCountry("British Indian Ocean Territory");
    or.setProductOrderedId(productId);
    orderList.add(or);
    go.setOrders(orderList);


    given().spec(requestSpecification).header("authorization",rs.getToken()).body(go).when().post("/api/ecom/order/create-order").then().log().all();


    }


}
