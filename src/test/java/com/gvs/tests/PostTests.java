package com.gvs.tests;

import com.gvs.pojos.EmployeePojo;
import com.gvs.util.ApiUtil;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static com.gvs.requestBuilders.RequestBuilder.postRequestBuilder;
import static com.gvs.util.RandomUtil.*;

public class PostTests {

    @Test
    public void postEmployeeUsingPojo() {

        EmployeePojo employee = EmployeePojo.builder().id(getId())
                .FirstName(getFirstName())
                .LastName(getLastName())
                .Email(getEmailId()).build();
        Response response = postRequestBuilder()
                .body(employee)
                .post("/Employees");
        response.prettyPrint();

    }

    @Test
    public void postEmployeeUsingJson() {

        String body = ApiUtil.readJsonFromAFileAsGetAsAString("/src/test/resources/jsons/employee.json")
                .replace("number", "346")
                .replace("fname", "sai madhav")
                .replace("lname", "burra");
        Response response = postRequestBuilder()
                .body(body)
                .post("/Employees");
        response.prettyPrint();
        ApiUtil.writeJsonResponseIntoAFile(response, Paths.get(System.getProperty("user.dir") + "/target/res.json"));
    }
}
