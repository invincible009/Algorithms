package com.sdl.employee.actors;

import com.sdl.employee.actors.dto.AddressDto;
import com.sdl.employee.actors.dto.BasicInfoDto;
import com.sdl.employee.actors.dto.ContactInfoDto;
import org.junit.jupiter.api.Nested;

import java.time.Instant;
import java.util.Date;


class EmployeeTest {

    @Nested
    class build_Employee{

        BasicInfoDto basicInfo = BasicInfoDto.builder()
                .firstname("Gabriel")
                .lastname("Mbaiorga")
                .middlename("Simon")
                .build();
        AddressDto address = AddressDto.builder()
                .street("19 Folawiyo")
                .city("Surulere")
                .postalCode("4343")
                .build();
        ContactInfoDto contact = ContactInfoDto.builder()
                .email("gabrielMbaiorga@gmail.com")
                .phoneNo("09034879843")
                .address(address)
                .basicInfo(basicInfo)
                .build();
        Employee employee = Employee.builder()
                .contactInfo(contact)
                .jobTitle("software Engineer")
                .resumeDate(Date.from(Instant.now()))
                .build();


    }

}