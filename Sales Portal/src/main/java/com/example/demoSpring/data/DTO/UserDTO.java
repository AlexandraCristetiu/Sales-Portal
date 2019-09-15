package com.example.demoSpring.data.DTO;

import com.example.demoSpring.data.DAO.User;
import lombok.Getter;

@Getter

public class UserDTO {
    private String name;
    private String email;

    public UserDTO (User u) {
        this.name = u.getName();
        this.email = u.getEmail();

    }

    /*public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }*/
}
