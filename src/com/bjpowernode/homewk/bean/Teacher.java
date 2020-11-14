package com.bjpowernode.homewk.bean;

public class Teacher {


    String tname;
    Integer sex;
    Integer phone;

    @Override
    public String toString() {
        return "Teacher{" +
                "tname='" + tname + '\'' +
                ", sex=" + sex +
                ", phone=" + phone +
                '}';
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
