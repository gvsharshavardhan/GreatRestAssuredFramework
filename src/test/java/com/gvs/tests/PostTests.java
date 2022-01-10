package com.gvs.tests;

import com.gvs.constants.FrameworkConstants;
import com.gvs.constants.FrameworkConstantsSingleton;
import com.gvs.pojos.EmployeePojo;
import com.gvs.util.ApiUtil;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

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
    public void postEmployeeUsingJson(Method method) {

        String body = ApiUtil.readJsonFromAFileAsGetAsAString(FrameworkConstantsSingleton.getINSTANCE().getRequestJsonFolderPath() + "employee.json")
                .replace("number", Integer.toString(getId()))
                .replace("fname", getFirstName())
                .replace("lname", getLastName())
                .replace("emailid", getEmailId());
        Response response = postRequestBuilder()
                .body(body)
                .post("/Employees");
        response.prettyPrint();
        ApiUtil.writeJsonResponseIntoAFile(response, FrameworkConstants.getResponseJsonFolderPath() + "res.json");
    }
}
