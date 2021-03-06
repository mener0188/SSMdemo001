package com.bw.entity;

import java.io.Serializable;

public class Emp implements Serializable {


    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getShengname() {
        return shengname;
    }

    public void setShengname(String shengname) {
        this.shengname = shengname;
    }

    public String getShiname() {
        return shiname;
    }

    public void setShiname(String shiname) {
        this.shiname = shiname;
    }

    public String getXianname() {
        return xianname;
    }

    public void setXianname(String xianname) {
        this.xianname = xianname;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.empid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer empid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.empname
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private String empname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.empdesc
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private String empdesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.departid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer departid;
    private String departname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.jobid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer jobid;
    private String jobname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.shengid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer shengid;
    private String shengname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.shiid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer shiid;
    private String shiname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.xianid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer xianid;
    private String xianname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.age
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sex
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.birth
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private String birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.picName
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private String picname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emp
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.empid
     *
     * @return the value of emp.empid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getEmpid() {
        return empid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.empid
     *
     * @param empid the value for emp.empid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.empname
     *
     * @return the value of emp.empname
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.empname
     *
     * @param empname the value for emp.empname
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.empdesc
     *
     * @return the value of emp.empdesc
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public String getEmpdesc() {
        return empdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.empdesc
     *
     * @param empdesc the value for emp.empdesc
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setEmpdesc(String empdesc) {
        this.empdesc = empdesc == null ? null : empdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.departid
     *
     * @return the value of emp.departid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.departid
     *
     * @param departid the value for emp.departid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.jobid
     *
     * @return the value of emp.jobid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getJobid() {
        return jobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.jobid
     *
     * @param jobid the value for emp.jobid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.shengid
     *
     * @return the value of emp.shengid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getShengid() {
        return shengid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.shengid
     *
     * @param shengid the value for emp.shengid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setShengid(Integer shengid) {
        this.shengid = shengid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.shiid
     *
     * @return the value of emp.shiid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getShiid() {
        return shiid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.shiid
     *
     * @param shiid the value for emp.shiid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setShiid(Integer shiid) {
        this.shiid = shiid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.xianid
     *
     * @return the value of emp.xianid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getXianid() {
        return xianid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.xianid
     *
     * @param xianid the value for emp.xianid
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setXianid(Integer xianid) {
        this.xianid = xianid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.age
     *
     * @return the value of emp.age
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.age
     *
     * @param age the value for emp.age
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sex
     *
     * @return the value of emp.sex
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sex
     *
     * @param sex the value for emp.sex
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.birth
     *
     * @return the value of emp.birth
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public String getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.birth
     *
     * @param birth the value for emp.birth
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.picName
     *
     * @return the value of emp.picName
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public String getPicname() {
        return picname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.picName
     *
     * @param picname the value for emp.picName
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    public void setPicname(String picname) {
        this.picname = picname == null ? null : picname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Mon Nov 11 19:22:21 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empid=").append(empid);
        sb.append(", empname=").append(empname);
        sb.append(", empdesc=").append(empdesc);
        sb.append(", departid=").append(departid);
        sb.append(", jobid=").append(jobid);
        sb.append(", shengid=").append(shengid);
        sb.append(", shiid=").append(shiid);
        sb.append(", xianid=").append(xianid);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", birth=").append(birth);
        sb.append(", picname=").append(picname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}