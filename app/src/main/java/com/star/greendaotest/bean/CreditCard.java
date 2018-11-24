package com.star.greendaotest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class CreditCard {

    @Id
    private Long mId;

    private Long mUserId;
    private String mUserName;
    private String mCardNum;
    private String mBank;
    private int mCardType;

    public CreditCard(Long id, Long userId, String userName, String cardNum, String bank, int cardType) {
        mId = id;
        mUserId = userId;
        mUserName = userName;
        mCardNum = cardNum;
        mBank = bank;
        mCardType = cardType;
    }

    public CreditCard() {

    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getCardNum() {
        return mCardNum;
    }

    public void setCardNum(String cardNum) {
        mCardNum = cardNum;
    }

    public String getBank() {
        return mBank;
    }

    public void setBank(String bank) {
        mBank = bank;
    }

    public int getCardType() {
        return mCardType;
    }

    public void setCardType(int cardType) {
        mCardType = cardType;
    }
}
