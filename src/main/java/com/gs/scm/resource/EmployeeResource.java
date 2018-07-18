package com.gs.scm.resource;

import com.gs.scm.to.EmployeeTO;

public class EmployeeResource {

    private EmployeeTO employeeTO;

    public EmployeeResource() {}

    public EmployeeResource(EmployeeTO employeeTO) {
        this.employeeTO = employeeTO;
    }

    public EmployeeTO getEmployeeTO() {
        return employeeTO;
    }

    public void setEmployeeTO(EmployeeTO employeeTO) {
        this.employeeTO = employeeTO;
    }
}
