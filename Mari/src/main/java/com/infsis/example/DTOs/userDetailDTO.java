package com.infsis.example.DTOs;

public class userDetailDTO {
    private long id;
    private String firstName;
    private String lastName;

    public userDetailDTO(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
