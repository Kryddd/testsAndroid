package com.example.couderc1.appy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_EXTRA_NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentBackToMain = getIntent();
        if(intentBackToMain != null && intentBackToMain.getStringExtra(OtherActivity.KEY_BACK_OTHER) != null) {
            String messageBack = intentBackToMain.getStringExtra(OtherActivity.KEY_BACK_OTHER);
            TextView viewBack = findViewById(R.id.textViewOK);
            viewBack.setText(messageBack);
            Toast.makeText(this, "Back!!!", Toast.LENGTH_LONG).show();
        }
    }

    public void otherActivityName(View view) {
        Intent intentOtherActiv = new Intent(this, OtherActivity.class);
        EditText textName = (EditText) findViewById(R.id.editTextName);
        intentOtherActiv.putExtra(KEY_EXTRA_NAME, textName.getText().toString());
        startActivity(intentOtherActiv);
    }

    public void otherActivity(View view) {
        Intent intentOtherActiv = new Intent(this, OtherActivity.class);
        startActivity(intentOtherActiv);
    }
}
