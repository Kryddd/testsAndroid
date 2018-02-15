package com.example.couderc1.appy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String KEY_BACK_OTHER = "BACK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent intentMain = getIntent();
        String name = intentMain.getStringExtra(MainActivity.KEY_EXTRA_NAME);

        TextView textName = findViewById(R.id.textViewName);
        textName.setText(name);
    }

    public void goToMainActivity(View view) {
        Intent intentMainActiv = new Intent(this, MainActivity.class);
        intentMainActiv.putExtra(KEY_BACK_OTHER, "OK");
        startActivity(intentMainActiv);
    }
}
