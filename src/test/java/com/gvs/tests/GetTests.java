package com.gvs.tests;

import com.github.javafaker.Faker;
import com.gvs.requestBuilders.RequestBuilder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.*;

public class GetTests {
    @Test
    public void getEmployees() {
        Response response = RequestBuilder.getRequestBuilder()
                .get("/employees");

        response.prettyPrint();
        assertThat(response.getStatusCode()).isEqualTo(200);
        assertThat(response.jsonPath().getList("$").size())
                .isGreaterThan(4);
    }

    @Test
    public void getEmployee(){
        Response response = RequestBuilder.getRequestBuilder()
                .pathParam("id",1)
                .get("/employees/{id}");
        response.prettyPrint();

    }
}
