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
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public int getStudentNo() {
        return mStudentNo;
    }

    public void setStudentNo(int studentNo) {
        mStudentNo = studentNo;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getPhoneNo() {
        return mPhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        mPhoneNo = phoneNo;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getSchoolName() {
        return mSchoolName;
    }

    public void setSchoolName(String schoolName) {
        mSchoolName = schoolName;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String grade) {
        mGrade = grade;
    }
}
