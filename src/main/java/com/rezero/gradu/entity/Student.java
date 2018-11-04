package com.rezero.gradu.entity;

import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;
import java.rmi.server.UID;

public class Student implements Serializable {


    private static final long serialVersionUID = -3968936246632542475L;

    private String sno;
    private String name;
    private String sex;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
