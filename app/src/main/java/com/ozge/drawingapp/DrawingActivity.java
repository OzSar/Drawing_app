package com.ozge.drawingapp;


import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;

public class DrawingActivity extends AppCompatActivity {

    private DrawingView drawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        drawingView = findViewById(R.id.drawing_view);
    }

    public void setRedColor(View view) {
        if (drawingView != null) {
            drawingView.setColor(getResources().getColor(android.R.color.holo_red_dark));
        }
    }

    public void setBlueColor(View view) {
        if (drawingView != null) {
            drawingView.setColor(getResources().getColor(android.R.color.holo_blue_dark));
        }
    }

    public void setGreenColor(View view) {
        if (drawingView != null) {
            drawingView.setColor(Color.parseColor("#008000")); // Yeşil
        }
    }

    public void setYellowColor(View view) {
        if (drawingView != null) {
            drawingView.setColor(Color.parseColor("#FFFF00")); // Sarı
        }
    }

    public void setOrangeColor(View view) {
        if (drawingView != null) {
            drawingView.setColor(Color.parseColor("#FFA500")); // Turuncu
        }
    }

    public void setThinStroke(View view) {
        if (drawingView != null) {
            drawingView.setStrokeWidth(5f); // İnce
        }
    }

    public void setMediumStroke(View view) {
        if (drawingView != null) {
            drawingView.setStrokeWidth(15f); // Orta
        }
    }

    public void setThickStroke(View view) {
        if (drawingView != null) {
            drawingView.setStrokeWidth(25f); // Kalın
        }
    }


    public void clearCanvas(View view) {
        if (drawingView != null) {
            drawingView.clearCanvas();
        }
    }
}