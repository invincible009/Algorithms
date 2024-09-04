package com.sdl.employee.actors.dto;

import lombok.Builder;

@Builder
public class ContactInfoDto {
    private String email;
    private String phoneNo;
    private AddressDto address;
    private BasicInfoDto basicInfo;
}
