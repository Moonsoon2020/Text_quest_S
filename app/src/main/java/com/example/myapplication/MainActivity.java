package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

;import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
     HashMap<String, String[]> que = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView2);
        que.put("Ясно", new String[]{"Привет как дела?", "Норм", "Я счастлив"});
        que.put("Норм", new String[]{"Ну после сессии это не удивительно. Много долгов?", "Да", "Слишком"});
        que.put("Да", new String[]{"ООо, моё почтение.", "Ясно", "Ясно"});
        que.put("Слишком", new String[]{"Ну, выживем", "Ясно", "Ясно"});
        que.put("Я счастлив", new String[]{"Эммм, ты уверен?", "Ну да, а что такого?", "Нет,я псих!"});
        que.put("Нет,я псих!", new String[]{"Не переживай, всё будет хорошо!", "Ясно", "Ясно"});
        que.put("Ну да, а что такого?", new String[]{"Ну так, ничего", "Ясно", "Ясно"});
        View.OnClickListener listener =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] answer = que.get(((Button )v).getText());
                textView.setText(answer[0]);
                button1.setText(answer[1]);
                button2.setText(answer[2]);
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
    }
}