package com.Tests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


// OBS: Algumas APIs ficam saindo do ar.
public class TestRestAssured {

    @Test
    public void api_test_01(){

        Response response = RestAssured.get("http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/today");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println("====================================================================\n");

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
//        validate.statusCode(500);
        validate.contentType(ContentType.JSON);
    }

    @Test
    public void api_test_02(){
        Response response = RestAssured.get("https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println("====================================================================\n");

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
//        validate.statusCode(500);
        validate.time(Matchers.lessThanOrEqualTo(1500L));
        validate.contentType(ContentType.JSON);
    }

    @Test
    public void api_test_03() {

        Response response = RestAssured.get("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println("====================================================================\n");

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
//        validate.statusCode(500);
        validate.time(Matchers.lessThanOrEqualTo(1500L));
        validate.contentType(ContentType.JSON);
    }


    @Test
    public void valorant() {

        Response response = RestAssured.get("https://valorant-api.com/v1/agents/f94c3b30-42be-e959-889c-5aa313dba261");

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println("====================================================================\n");

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
//        validate.statusCode(500);
        validate.time(Matchers.lessThanOrEqualTo(1000L));
        validate.contentType(ContentType.JSON);
        validate.body(Matchers.containsString("displayName"));
        validate.body(Matchers.containsString("description"));
        validate.body(Matchers.containsString("abilities"));
        validate.body(Matchers.containsString("background"));
        validate.body(Matchers.containsString("assetPath"));

    }

}
