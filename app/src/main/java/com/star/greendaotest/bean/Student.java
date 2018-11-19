package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class Student {

    @Id(autoincrement = true)
    private Long mId;

    @Unique
    private int mStudentNo;

    private int mAge;
    private String mPhoneNo;
    private String mGender;
    private String mName;
    private String mAddress;
    private String mSchoolName;
    private String mGrade;

    public Student(Long id, int studentNo, int age, String telPhone, String gender,
            String name, String address, String schoolName, String grade) {
        this.mId = id;
        this.mStudentNo = studentNo;
        this.mAge = age;
        this.mPhoneNo = telPhone;
        this.mGender = gender;
        this.mName = name;
        this.mAddress = address;
        this.mSchoolName = schoolName;
        this.mGrade = grade;
    }

    public Student() {

    }

    public Long getId() {
        return this.mId;
    }
    public void setId(Long id) {
        this.mId = id;
    }
    public int getStudentNo() {
        return this.mStudentNo;
    }
    public void setStudentNo(int studentNo) {
        this.mStudentNo = studentNo;
    }
    public int getAge() {
        return this.mAge;
    }
    public void setAge(int age) {
        this.mAge = age;
    }
    public String getPhoneNo() {
        return this.mPhoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.mPhoneNo = phoneNo;
    }
    public String getGender() {
        return this.mGender;
    }
    public void setGender(String gender) {
        this.mGender = gender;
    }
    public String getName() {
        return this.mName;
    }
    public void setName(String name) {
        this.mName = name;
    }
    public String getAddress() {
        return this.mAddress;
    }
    public void setAddress(String address) {
        this.mAddress = address;
    }
    public String getSchoolName() {
        return this.mSchoolName;
    }
    public void setSchoolName(String schoolName) {
        this.mSchoolName = schoolName;
    }
    public String getGrade() {
        return this.mGrade;
    }
    public void setGrade(String grade) {
        this.mGrade = grade;
    }
}
