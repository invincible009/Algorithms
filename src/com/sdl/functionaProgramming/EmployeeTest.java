package com.sdl.functionaProgramming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void employeeFullName(){
        Employee employee = new Employee();
        employee.setFirstName("Gabriel");
        employee.setLastName("Mbaiorga");

        String actual = employeeUtils.getFullName(employee);
       assertEquals("Gabriel Mbaiorga",actual);
    }
}