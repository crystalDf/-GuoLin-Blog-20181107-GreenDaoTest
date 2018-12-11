package com.star.greendaotest;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.star.greendaotest.bean.CreditCard;
import com.star.greendaotest.bean.IdCard;
import com.star.greendaotest.db.DaoMaster;
import com.star.greendaotest.db.DaoSession;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DaoSession mDaoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void initGreenDao() {

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(
                this, "greendaotest.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public void addOtherData(Random random, DaoSession daoSession, String userName, Long id){

        IdCard idCard = new IdCard();
        idCard.setUserName(userName);
//        idCard.setIdNo(RandomValue.getRandomID());
        daoSession.insert(idCard);

        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setUserId(id);
            creditCard.setUserName(userName);
            creditCard.setCardNum(String.valueOf(random.nextInt(899999999) + 100000000) + String.valueOf(random.nextInt(899999999) + 100000000));
//            creditCard.setBank(RandomValue.getBankName());
            creditCard.setCardType(random.nextInt(10));

            daoSession.insert(creditCard);
        }
    }
}
