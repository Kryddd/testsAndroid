package com.example.couderc1.appy;

import android.content.Intent;
import android.net.Uri;
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

    public void goToMap(View view) {
        Uri mapIntentUri = Uri.parse("geo:0,0?q=IUT+Paris+Descartes");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void shareText(View view) {
        TextView shareView = findViewById(R.id.textViewName);
        String share = shareView.getText().toString();

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, share);
        shareIntent.setType("text/plain");
        startActivity(shareIntent);
    }
}
