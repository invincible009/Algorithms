package com.sdl.employee.actors;

import com.sdl.employee.actors.dto.ContactInfoDto;
import lombok.Builder;

import java.util.Date;

@Builder
public class Employee {
    private ContactInfoDto contactInfo;
    private Date resumeDate;
    private String jobTitle;
}
