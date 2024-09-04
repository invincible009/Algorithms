package com.sdl.employee.actors.dto;

import lombok.Builder;

@Builder
public class AddressDto {
    private String street;
    private String postalCode;
    private String city;
}
