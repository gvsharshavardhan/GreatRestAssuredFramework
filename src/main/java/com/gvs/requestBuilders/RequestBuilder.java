package com.gvs.requestBuilders;

import com.gvs.util.PropertyUtil;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class RequestBuilder {

    private RequestBuilder() {
    }

    public static RequestSpecification getRequestBuilder() {
        return given()
                .baseUri(PropertyUtil.getValue("baseurl"))
                .log()
                .all();
    }

    public static RequestSpecification postRequestBuilder() {
        return getRequestBuilder()
                .contentType(ContentType.JSON);
    }
}
