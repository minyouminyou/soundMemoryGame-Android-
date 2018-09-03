package com.example.youm.porongporongpororo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class EasyGameActivity extends AppCompatActivity {
    Object gifView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easymode_game);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("다음중 캐릭터가 각각 몇번씩 소리를 외치는지 기억하세요! \n 예를 누르면" +
                "시작합니다!").setTitle("게임 안내");
        builder.setPositiveButton("예",null);
        builder.show();
        gifView = findViewById(R.id.gif);

    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
