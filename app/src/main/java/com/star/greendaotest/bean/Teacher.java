package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class Teacher {

    @Id(autoincrement = true)
    private Long mId;

    @Unique
    private int mTeacherNo;

    private int mAge;
    private String mPhoneNo;
    private String mGender;
    private String mName;
    private String mSchoolName;
    private String mSubject;
}
