package com.example.pbuskell.widgetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class WidgetDemo extends AppCompatActivity {

    Switch swtchStatus1;
    TextView txtvwStatus1;
    String switchOn = "Switch is ON";
    String switchOff = "Switch is OFF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_demo);

        swtchStatus1 = (Switch) findViewById(R.id.swtchStatus1);
        txtvwStatus1 = (TextView) findViewById(R.id.txtvwStatus1);

        swtchStatus1.setChecked(true);
        swtchStatus1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    txtvwStatus1.setText(switchOn);
                } else {
                    txtvwStatus1.setText(switchOff);
                }
            }
        });
        if (swtchStatus1.isChecked()) {
            txtvwStatus1.setText(switchOn);
        } else {
            txtvwStatus1.setText(switchOff);
        }

    }
}
