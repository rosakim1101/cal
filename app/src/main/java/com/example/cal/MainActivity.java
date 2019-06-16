package com.example.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num0, num1, num2, num3 ,num4 ,num5, num6, num7, num8, num9;
    Button ac, tot, plu, min, mul, div;
    TextView tv1, tv;

    int firstNum, secondNum;
    String how;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num0=findViewById(R.id.num0);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        ac=findViewById(R.id.ac);
        tot=findViewById(R.id.tot);
        plu=findViewById(R.id.plu);
        min=findViewById(R.id.min);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                tv.setText(before+"0");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        plu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                firstNum=Integer.parseInt(before);
                how = "＋";
                tv1.setText(before+how);
                tv.setText("");
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                firstNum=Integer.parseInt(before);
                how = "－";
                tv1.setText(before+how);
                tv.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                firstNum=Integer.parseInt(before);
                how = "×";
                tv1.setText(before+how);
                tv.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                firstNum=Integer.parseInt(before);
                how = "÷";
                tv1.setText(before+how);
                tv.setText("");
            }
        });
        tot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv.getText().toString();
                secondNum=Integer.parseInt(before);
                int result = 0;
                switch(how){
                    case "＋":
                        result = firstNum + secondNum;
                        break;
                    case "－":
                        result = firstNum - secondNum;
                        break;
                    case "×":
                        result = firstNum * secondNum;
                        break;
                    case "÷":
                        result = firstNum / secondNum;
                        break;
                }
                tv.setText(""+result);
                tv1.setText("");
            }
        });

    }
}
