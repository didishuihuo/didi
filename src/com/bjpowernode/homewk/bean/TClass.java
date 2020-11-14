package com.bjpowernode.homewk.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * t_class
 * @author 
 */
public class TClass implements Serializable {

    Teacher teacher;

    /**
     * 班级编号
     */
    private Integer cid;

    /**
     * 班级姓名
     */
    private String cname;

    /**
     * 开班日期
     */
    private Date ctime;

    /**
     * 班级人数
     */
    private Integer count;

    /**
     * 老师编号
     */
    private Integer cteacher;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCteacher() {
        return cteacher;
    }

    public void setCteacher(Integer cteacher) {
        this.cteacher = cteacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "TClass{" +
                "teacher=" + teacher +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                ", ctime=" + ctime +
                ", count=" + count +
                ", cteacher=" + cteacher +
                '}';
    }
}