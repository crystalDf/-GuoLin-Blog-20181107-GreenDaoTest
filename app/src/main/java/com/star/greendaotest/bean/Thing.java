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
    private String message;

    private String name;

    @Transient
    private long time;

    public Thing(Long id, String message, String name) {
        this.id = id;
        this.message = message;
        this.name = name;
    }

    public Thing(Long id, String message, long time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Thing(String message, long time) {
        this.message = message;
        this.time = time;
    }

    public Thing() {

    }
}
