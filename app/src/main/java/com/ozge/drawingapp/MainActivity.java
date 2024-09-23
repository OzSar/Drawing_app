package com.ozge.drawingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Animasyon için TextView'i al
        TextView appName = findViewById(R.id.app_name);
        ObjectAnimator animator = ObjectAnimator.ofFloat(appName, "translationX", 1000f);
        animator.setDuration(2000);  // 2 saniye süren bir animasyon
        animator.start();

        // İkinci Activity'e geçiş için buton
        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawingActivity.class);
                startActivity(intent);
            }
        });
    }
}
