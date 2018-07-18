package com.gs.scm;

import com.gs.scm.resource.EmployeeResource;
import com.gs.scm.to.EmployeeTO;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface EmployeeClient {
    @RequestLine("GET /employee/{employeeid}/calender")
    EmployeeResource findByEmployeeId(@Param("employeeid") String employeeid);

    @RequestLine("GET")
    List<EmployeeResource> findAll();

    @RequestLine("POST /meeting")
    @Headers("Content-Type: application/json")
    void create(EmployeeTO employeeTO);
}
