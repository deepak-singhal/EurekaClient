package com.gs.scm;

import com.gs.scm.resource.EmployeeResource;
import com.gs.scm.to.EmployeeTO;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeClientImpl {
    public static void main(String args[]){
        EmployeeClient employeeClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(EmployeeClient.class))
                .logLevel(Logger.Level.FULL)
                .target(EmployeeClient.class, "http://localhost:8080");

        EmployeeTO employee = employeeClient.findByEmployeeId("1").getEmployeeTO();

        System.out.println(employee);
    }
}
