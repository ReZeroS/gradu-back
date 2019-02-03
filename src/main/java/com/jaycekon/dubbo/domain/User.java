package com.jaycekon.dubbo.domain;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private int id;
    private String username;
    private String password;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
