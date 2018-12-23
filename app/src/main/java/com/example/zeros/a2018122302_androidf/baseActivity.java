package com.example.zeros.a2018122302_androidf;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract class  baseActivity extends AppCompatActivity {
 public Context mComtext = this;

    public abstract void setEvent();
    public abstract void setValues();
    public abstract void bindViews();
}
