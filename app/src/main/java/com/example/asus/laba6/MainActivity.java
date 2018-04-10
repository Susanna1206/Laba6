package com.example.asus.laba6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText2;
    private TextView textView;
    private TextView textView2;
    private Button button;

    int b;
    int m;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
//Объявим числовые переменные
                    m = 0 + (int) (Math.random() * 100);

//Считаем с editText и editText2 текстовые значения
                    String S2 = editText2.getText().toString();

//Преобразуем текстовые переменные в числовые значения
                    b = Integer.parseInt(S2);
                    textView2.setText("Ранд-е число: " + Integer.toString(m));

                    if (b > m) {
                        textView.setText("Перелет!");
//m = 1 + (int) Math.random()*100;
                    } else if (b < m) {
                        textView.setText("Недолет!");
//m = 1 + (int) Math.random()*100;
                    } else {
                        textView.setText("В точку!");
//m = 1 + (int) Math.random() * 100;
                    }
                    m = 0 + (int) (Math.random() * 100);
                } catch (Exception e) {
                    textView.setText("Введите число!");
                }
            }

        });
    }
}

