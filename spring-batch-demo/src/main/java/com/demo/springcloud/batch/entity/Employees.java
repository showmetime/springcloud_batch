package com.demo.springcloud.batch.entity;

import java.util.Date;

public class Employees {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.emp_no
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.birth_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private Date birthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.first_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.last_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.gender
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employees.hire_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    private Date hireDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.emp_no
     *
     * @return the value of employees.emp_no
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.emp_no
     *
     * @param empNo the value for employees.emp_no
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.birth_date
     *
     * @return the value of employees.birth_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.birth_date
     *
     * @param birthDate the value for employees.birth_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.first_name
     *
     * @return the value of employees.first_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.first_name
     *
     * @param firstName the value for employees.first_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.last_name
     *
     * @return the value of employees.last_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.last_name
     *
     * @param lastName the value for employees.last_name
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.gender
     *
     * @return the value of employees.gender
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.gender
     *
     * @param gender the value for employees.gender
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employees.hire_date
     *
     * @return the value of employees.hire_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employees.hire_date
     *
     * @param hireDate the value for employees.hire_date
     *
     * @mbg.generated Sun Jul 05 13:32:59 CST 2020
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}