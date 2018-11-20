package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class IdCard {

    @Id
    String mUserName;

    @Unique
    String mIdNo;
}
