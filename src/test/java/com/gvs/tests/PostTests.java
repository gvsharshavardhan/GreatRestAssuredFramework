package com.gvs.tests;

import com.gvs.pojos.EmployeePojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.gvs.requestBuilders.RequestBuilder.postRequestBuilder;
import static com.gvs.util.RandomUtil.*;

public class PostTests {

    @Test
    public void postEmployee() {

        EmployeePojo employee = EmployeePojo.builder().id(getId())
                .FirstName(getFirstName())
                .LastName(getLastName())
                .Email(getEmailId()).build();
        Response response = postRequestBuilder()
                .body(employee)
                .post("/Employees");
        response.prettyPrint();

    }
}
