package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class IdCard {

    @Id
    private String mUserName;

    @Unique
    private String mIdNo;

    public IdCard(String userName, String idNo) {
        mUserName = userName;
        mIdNo = idNo;
    }

    public IdCard() {

    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getIdNo() {
        return mIdNo;
    }

    public void setIdNo(String idNo) {
        mIdNo = idNo;
    }
}
