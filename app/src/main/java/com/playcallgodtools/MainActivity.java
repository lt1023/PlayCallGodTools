package com.playcallgodtools;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button mButton;
    private Context mContext = MainActivity.this;
    private String mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText = editText.getText().toString().trim();
                Intent intent = new Intent();
                intent.putExtra("text" , mText);
                intent.setClass(mContext , ShowActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        editText = (EditText) findViewById(R.id.et_text);
        mButton = (Button) findViewById(R.id.btn_ok);
    }
}
