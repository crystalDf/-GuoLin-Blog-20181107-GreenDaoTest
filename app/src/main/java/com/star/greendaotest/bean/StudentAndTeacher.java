package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class StudentAndTeacher {

    @Id(autoincrement = true)
    private Long mId;

    private Long mStudentId;
    private Long mTeacherId;

    public StudentAndTeacher(Long id, Long studentId, Long teacherId) {
        mId = id;
        mStudentId = studentId;
        mTeacherId = teacherId;
    }

    public StudentAndTeacher() {

    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getStudentId() {
        return mStudentId;
    }

    public void setStudentId(Long studentId) {
        mStudentId = studentId;
    }

    public Long getTeacherId() {
        return mTeacherId;
    }

    public void setTeacherId(Long teacherId) {
        mTeacherId = teacherId;
    }
}
