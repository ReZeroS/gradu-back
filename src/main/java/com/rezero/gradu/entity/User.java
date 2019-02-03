package com.rezero.gradu.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 3178543666298389805L;
    private Integer id;
    private String userName;
    private String password;
    private Date createTime;
    private String status;

}
