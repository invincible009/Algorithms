package com.sdl.functionaProgramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {
    public String getFullName(Employee employee){
        Function<Employee, String> fullName = (e)-> e.getFirstName() +" "+ e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagersLastName(Employee employee){
        Function<Employee, String> managersLastName =(m)-> m.getManager().getLastName();
        return managersLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee){
        Predicate<Employee> employeeLongerThanFiveYears = (e)-> e.getYearOfService() > 5;
        return employeeLongerThanFiveYears.test(employee);
    }
}
