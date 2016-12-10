package com.pallefire.passobjintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView) findViewById(R.id.tv1);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("myobject");
        student s = (student) bundle.getSerializable("students");
        tv.setText(s.sno+"\n"+s.sname+"\n"+s.scourse);

    }
}
