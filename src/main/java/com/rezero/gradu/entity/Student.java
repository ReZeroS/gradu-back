package com.rezero.gradu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;
import java.rmi.server.UID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = -3968936246632542475L;

    private String sno;
    private String name;
    private String sex;

}
