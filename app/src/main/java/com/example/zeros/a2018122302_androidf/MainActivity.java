package com.example.zeros.a2018122302_androidf;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends baseActivity {

    private android.widget.Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bindViews();
        setEvent();
        setValues();
    }

    @Override
    public void setEvent() {
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(mComtext);

                alert.setTitle("로그아웃 확인");
                alert.setMessage("정말 로그아웃 하시겠어요" +
                        "");
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mComtext, "로그아웃되었습니다.", Toast.LENGTH_SHORT).show();
                    }
                });

                alert.setNegativeButton("취소",null);
                alert.show();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.logoutBtn = (Button) findViewById(R.id.logoutBtn);

    }
}
