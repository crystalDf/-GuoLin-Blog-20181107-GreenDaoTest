package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class StudentAndTeacher {

    @Id(autoincrement = true)
    Long mId;

    Long mStudentId;
    Long mTeacherId;
}
