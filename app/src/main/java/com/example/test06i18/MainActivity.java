package com.example.test06i18;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView iVone;
    private Button nbgf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iVone = findViewById(R.id.iVone);
        nbgf = findViewById(R.id.nbgf);
    }

    int x = 1;

    public void clicked(View view) {
        x = (int) (Math.random() * 3 + 1);

        nbgf.setText("" + x);

        if (x == 1) {
            iVone.setImageResource(R.drawable.commitandpush);
        } else if (x == 2) {
            iVone.setImageResource(R.drawable.lil);
        } else {
            iVone.setImageResource(R.drawable.sum);
        }
    }

}