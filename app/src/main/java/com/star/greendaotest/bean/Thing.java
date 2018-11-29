package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

public class Thing {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb="message")
    @Index(unique = true)
    String message;

    String name;

    @Transient
    long time;
}
