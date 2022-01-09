package com.gvs.pojos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EmployeePojo {

    private int id;
    private String FirstName;
    private String LastName;
    private String Email;
}
