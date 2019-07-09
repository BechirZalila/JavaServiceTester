package com.sofia.javeservicetester;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.sampservice.SampManager;

public class MainActivity extends Activity {

    public static String TAG = "JavaServiceTester";

    private Button boutonAdd;
    private Button boutonSub;
    private EditText textA;
    private EditText textB;
    private TextView textC;

    SampManager man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        man = SampManager.getInstance();

        boutonAdd = (Button) findViewById(R.id.buttonAdd);
        boutonSub = (Button) findViewById(R.id.buttonSub);
        textA = (EditText) findViewById(R.id.editTextA);
        textB = (EditText) findViewById(R.id.editTextB);
        textC = (TextView) findViewById(R.id.textViewC);

        boutonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(textA.getText().toString());
                int b = Integer.parseInt(textB.getText().toString());

                int c = man.add (a, b);

                Log.d (TAG, "Addition = " + c);
                textC.setText (String.valueOf(c));
            }
        });

        boutonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(textA.getText().toString());
                int b = Integer.parseInt(textB.getText().toString());

                int c = man.sub (a, b);

                Log.d (TAG, "Soustraction = " + c);
                textC.setText (String.valueOf(c));
            }
        });


    }
}
