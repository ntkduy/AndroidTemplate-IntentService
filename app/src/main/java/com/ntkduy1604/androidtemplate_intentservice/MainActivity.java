package com.ntkduy1604.androidtemplate_intentservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ntkduy1604.androidtemplate_intentservice.services.MyService;

import static android.R.attr.start;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    TextView output;
    private static final String JSON_URL =
            "http://560057.youcanlearnit.net/services/json/itemsfeed.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView) findViewById(R.id.output);
    }

    public void runClickHandler(View view) {
        /**
         * Call the intent service
         */
        Intent intent = new Intent(this, MyService.class);
        intent.setData(Uri.parse(JSON_URL));
        startService(intent);
        startService(intent);
        startService(intent);
    }

    public void clearClickHandler(View view) {
        output.setText("");
    }
}
