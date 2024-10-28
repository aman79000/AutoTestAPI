package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.Response.ResponseAddPlace;
import org.example.pojo.AddPlace;
import org.example.pojo.Jira.Fields;
import org.example.pojo.Jira.AddIssue;
import org.example.pojo.Jira.Issuetype;
import org.example.pojo.Jira.Project;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Unit test for simple App.
 */
public class AppTest {


    /**
     * @return the suite of tests being tested
     */


    /**
     * Rigourous Test :-)
     */

    @Test
    public void solution() {
        JsonPath js = new JsonPath(payload.mockJson());

        int len = js.getInt("courses.size()");

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += js.getInt("courses[" + i + "].price");

        }
        if (js.getInt("dashboard.purchaseAmount") == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    }


    @Test
    public void CreateABug() {
        RestAssured.baseURI = "https://gaman7900.atlassian.net";
        AddIssue gf = new AddIssue();
        Fields f = new Fields();
        Issuetype it = new Issuetype();
        Project p = new Project();
        it.setName("Bug");
        p.setKey("SCRUM");
        f.setProject(p);
        f.setSummary("Issue Created with POJO");
        f.setDescription("Issue Created with POJO");
        f.setIssuetype(it);
        gf.setFields(f);


        String s = given().body("{\n" +
                        "    \"fields\": {\n" +
                        "        \"project\": {\n" +
                        "            \"key\": \"SCRUM\"\n" +
                        "        },\n" +
                        "        \"summary\": \"Testing.\",\n" +
                        "        \"description\": \"Creating an issue using project keys and issue type names via the REST API\",\n" +
                        "        \"issuetype\": {\n" +
                        "            \"name\": \"Bug\"\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n").headers("Authorization", "Basic Z2FtYW43OTAwQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAwT1pCY01CcGs3MWZqMlVjU3QyQWRoY0RGbEJXbTVTM05TQXNPd0wyS1lFR2ZlLXdqU3h2cmNWbEJ4WGRmS1FkNTlIMmxxNTRwMThhS0h6NDNVTFpKMk8tWWJQM1J3aUN5dnJ0Sk5vaWEya3ZlUENlLXByMmdJU1ZSdURaam50am5UTmZ1Y2NoOW9xazlEazkzUWhvLWNpMkRyR2pUbThWUjBJbXBKd3UyMWs9MkUwNTZBMTQ=", "Content-Type", "application/json").
                when().post("/rest/api/2/issue/").then().statusCode(201).extract().response().asString();
        JsonPath js = new JsonPath(s);
        String issueId = js.getString("key");
        System.out.println(issueId);
    }

    @Test
    public void deleteAIssue() {
        RestAssured.baseURI = "https://gaman7900.atlassian.net";
        given().pathParam("issueIdOrKey", "SCRUM-3").headers("Authorization", "Basic Z2FtYW43OTAwQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAwT1pCY01CcGs3MWZqMlVjU3QyQWRoY0RGbEJXbTVTM05TQXNPd0wyS1lFR2ZlLXdqU3h2cmNWbEJ4WGRmS1FkNTlIMmxxNTRwMThhS0h6NDNVTFpKMk8tWWJQM1J3aUN5dnJ0Sk5vaWEya3ZlUENlLXByMmdJU1ZSdURaam50am5UTmZ1Y2NoOW9xazlEazkzUWhvLWNpMkRyR2pUbThWUjBJbXBKd3UyMWs9MkUwNTZBMTQ=").
                when().delete("/rest/api/2/issue/{issueIdOrKey}").then().log().all().statusCode(204);
    }

    @Test
    public void assignAnIssueToUser(){
        RestAssured.baseURI="https://gaman7900.atlassian.net";
        given().body("{\n" +
                        "   \"fields\": {\n" +
                        "       \"assignee\":{\"name\":\"Aman\"}\n" +
                        "   }\n" +
                        "}").pathParam("issueIdOrKey","SCRUM-2").headers("Content-Type","application/json","Authorization","gaman7900@gmail.com:Z2FtYW43OTAwQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAwT1pCY01CcGs3MWZqMlVjU3QyQWRoY0RGbEJXbTVTM05TQXNPd0wyS1lFR2ZlLXdqU3h2cmNWbEJ4WGRmS1FkNTlIMmxxNTRwMThhS0h6NDNVTFpKMk8tWWJQM1J3aUN5dnJ0Sk5vaWEya3ZlUENlLXByMmdJU1ZSdURaam50am5UTmZ1Y2NoOW9xazlEazkzUWhvLWNpMkRyR2pUbThWUjBJbXBKd3UyMWs9MkUwNTZBMTQ=").
                when().put("/rest/api/2/issue/{issueIdOrKey}").then().log().all().statusCode(204);
    }


    @Test
    public void attachScreenshotInJira() {
        RestAssured.baseURI = "https://gaman7900.atlassian.net";
        given().headers("X-Atlassian-Token", "no-check", "Authorization", "Basic Z2FtYW43OTAwQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAwT1pCY01CcGs3MWZqMlVjU3QyQWRoY0RGbEJXbTVTM05TQXNPd0wyS1lFR2ZlLXdqU3h2cmNWbEJ4WGRmS1FkNTlIMmxxNTRwMThhS0h6NDNVTFpKMk8tWWJQM1J3aUN5dnJ0Sk5vaWEya3ZlUENlLXByMmdJU1ZSdURaam50am5UTmZ1Y2NoOW9xazlEazkzUWhvLWNpMkRyR2pUbThWUjBJbXBKd3UyMWs9MkUwNTZBMTQ").
                multiPart("file", new File("C:/Users/aman.gupta/Documents/Aryan_Resume.docx")).pathParam("issue-key", "SCRUM-2")
                .when().post("/rest/api/2/issue/{issue-key}/attachments").
                then().log().all().assertThat().statusCode(200);

        //Below is the test to get the access token from outh and use it to get the course details

    }
@Test
        public void getAccessToken(){
        RestAssured.baseURI="https://rahulshettyacademy.com";
       String response= given().formParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com","client_secret","erZOWM9g3UtwNRj340YYaK_W","grant_type","client_credentials","scope","trust")
               .when().post("/oauthapi/oauth2/resourceOwner/token")
               .then().extract().response().asString();
       JsonPath js = new JsonPath(response);
       String auth=js.getString("access_token");

       given().queryParam("access_token",auth)
               .when().get("/oauthapi/getCourseDetails").then().log().all();


        }

        @Test
    public void pojoClassesDemo(){
            ParseMockJson ps = new ParseMockJson();
            ps.parseObject(payload.mockJson1());
        }
        @Test
    public void addPlace(){
        RestAssured.baseURI="https://rahulshettyacademy.com";
            AddPlace ad = new AddPlace();
            Location l = new Location();
            List<String> al = new ArrayList<String>();
            al.add("temp");
            al.add("temp2");
            l.setLat(11.22);
            l.setLng(44.22);
            ad.setAccuracy(60);
            ad.setAddress("402 gfgffgf");
            ad.setLanguage("Hindi");
            ad.setName("TEst");
            ad.setPhone_number("456789");
            ad.setWebsite("test---.com");
            ad.setLocation(l);
            ad.setTypes(al);

            ResponseAddPlace rsss=  given().queryParam("key","qaclick123").body(ad)
                .when().post("/maps/api/place/add/json").then().log().all().extract().as(ResponseAddPlace.class);
            System.out.println(rsss.getId());
    }




@Test
        public void buildSpec(){
        AddPlace ad = new AddPlace();
        Location l = new Location();
    List<String> al = new ArrayList<String>();
    al.add("temp");
    al.add("temp2");
        l.setLat(11.22);
        l.setLng(44.22);
        ad.setAccuracy(60);
        ad.setAddress("402 gfgffgf");
        ad.setLanguage("Hindi");
        ad.setName("TEst");
        ad.setPhone_number("456789");
        ad.setWebsite("test---.co");
        ad.setLocation(l);
        ad.setTypes(al);

   RequestSpecBuilder rs = new RequestSpecBuilder().
           setBaseUri("https://rahulshettyacademy.com")
           .addQueryParam("key","qaclick123");
   RequestSpecification t=rs.build();
 //ResponseSpecification rss =given().spec(t).body(ad).when().post("/maps/api/place/add/json").then().log().all();
    }
@Test
public void ResponseSpecBuilder(){
    AddPlace ad = new AddPlace();
    Location l = new Location();
    List<String> al = new ArrayList<String>();
    al.add("temp");
    al.add("temp2");
    l.setLat(11.22);
    l.setLng(44.22);
    ad.setAccuracy(60);
    ad.setAddress("402 gfgffgf");
    ad.setLanguage("Hindi");
    ad.setName("TEst");
    ad.setPhone_number("456789");
    ad.setWebsite("test---.co");
    ad.setLocation(l);
    ad.setTypes(al);

    RequestSpecification reqBuilder = new  RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123").setContentType(ContentType.JSON).build();
    ;
    ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).build();
   // RequestSpecification reqspec = reqBuilder.setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123").setContentType(ContentType.JSON).build();
    RequestSpecification  reqspec= given().spec(reqBuilder).body(ad);
    ResponseAddPlace resAddPlace= reqspec.when().post("/maps/api/place/add/json").then().log().all().spec(res).extract().response().as(ResponseAddPlace.class);

    System.out.println(resAddPlace.getId());
}





}







//@DataProvider
//public Object [][] getData(){
//    return new Object [][];
//}
