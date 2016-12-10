package com.pallefire.passobjintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.et1);
        tv2 = (TextView) findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.et3);
        b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                student s = new student();
                s.sno = Integer.parseInt(tv1.getText().toString());
                s.sname = tv2.getText().toString();
                s.scourse = tv3.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putSerializable("students", s);
                intent.putExtra("myobject",bundle);
                startActivity(intent);

            }
        });
    }
}
