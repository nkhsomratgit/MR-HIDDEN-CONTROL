package com.mrhidden.control;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 50, 30, 30);
        layout.setBackgroundColor(Color.rgb(12, 12, 12));

        TextView title = new TextView(this);
        title.setText("MR HIDDEN CONTROL");
        title.setTextColor(Color.RED);
        title.setTextSize(25);
        title.setPadding(0, 20, 0, 30);

        TextView status = new TextView(this);
        status.setText(
            "● APPLICATION ONLINE\n\n" +
            "Device Status: Active\n" +
            "Connection: Not Connected\n\n" +
            "SECURE DEVICE COMPANION\n" +
            "Remote sessions require user consent."
        );
        status.setTextColor(Color.GREEN);
        status.setTextSize(16);

        layout.addView(title);
        layout.addView(status);

        setContentView(layout);
    }
}
