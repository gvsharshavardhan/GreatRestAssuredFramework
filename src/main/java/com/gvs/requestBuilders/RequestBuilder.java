package com.gvs.requestBuilders;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class RequestBuilder {

    private RequestBuilder() {
    }

    public static RequestSpecification getRequestBuilder() {
        return given()
                .baseUri("http://localhost:3000")
                .log()
                .all();
    }

    public static RequestSpecification postRequestBuilder() {
        return given()
                .baseUri("http://localhost:3000")
                .log()
                .all()
                .contentType(ContentType.JSON);
    }
}
