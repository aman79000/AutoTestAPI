package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.Response.ResponseAddPlace;
import org.example.pojo.AddPlace;
import org.example.pojo.Jira.GetTestData;
import org.testng.Assert;
import resources.AllApis;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.*;

public class StepDefinationCommon extends Utils {
    Response response;

    ResponseSpecification respSpec;
    RequestSpecification reqSpec;

    @Given("User sets projects as {string} summary as {string} description as {string} issueType as {string}")
    public void user_sets_projects_as_summary_as_description_as_issue_type_as(String project, String summary, String description, String issueType) throws IOException {

        reqSpec = given().spec(RequestSpec()).body(GetTestData.addIssue(project, summary, description, issueType));

    }

    @Given("user sets the issueID")
    public void user_sets_the_issue_id() throws IOException {
        if (response == null) {
            StepDefinationCommon stepDefinationCommon = new StepDefinationCommon();
            user_sets_projects_as_summary_as_description_as_issue_type_as("SCRUM", "TestingEndToEnd", "EndToEndScenerios", "Bug");
            user_calls_with_post_http_request("AddJira", "Post");
        }
        JsonPath js = new JsonPath(response.asString());
        reqSpec = given().spec(RequestSpec()).pathParam("issueIdOrKey", js.get("id"));
    }

    @When("user calls {string} with {string} http request")
    public void user_calls_with_post_http_request(String endPointName, String requestType) {
        String endPoint = AllApis.valueOf(endPointName).getResources();
//        reqSpec=  given().queryParam("key","qaclick123").body(endPointName);
        // .when().post().then().log().all().extract().as(ResponseAddPlace.class);
        if (requestType.equalsIgnoreCase("post")) {
            response = reqSpec.when().post(endPoint).then().extract().response();
        } else if (requestType.equalsIgnoreCase("get")) {
            response = reqSpec.when().get(endPoint).then().extract().response();
        } else if (requestType.equalsIgnoreCase("put")) {
            response = reqSpec.when().put(endPoint).then().extract().response();
        } else if (requestType.equalsIgnoreCase("delete")) {
            response = reqSpec.when().delete(endPoint).then().extract().response();
        } else {
            System.out.println("The request Type is not supported yet");
        }


    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String field, String expected) {
        JsonPath js = new JsonPath(response.asString());
        Assert.assertEquals(js.get(field), expected);
    }

    @Then("the API call got success with status {int}")
    public void the_api_call_got_success_with_status(int expected) {
        Assert.assertEquals(response.getStatusCode(), expected);

    }


}
