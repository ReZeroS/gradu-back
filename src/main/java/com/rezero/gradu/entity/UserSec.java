package com.rezero.gradu.entity;

//import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSec implements Serializable {


    private static final long serialVersionUID = -7976027931753854501L;

    private String userName;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;


}
