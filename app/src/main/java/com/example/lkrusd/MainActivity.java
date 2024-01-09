package com.example.lkrusd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton1;
    TextView displayView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextID);
        radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        displayView = (TextView) findViewById(R.id.displayViewID);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton1 = (RadioButton) findViewById(i);

                switch(radioButton1.getId()){
                    case R.id.lkrID:{
                        Log.v("Checking","LKR Button Clicked");

                        Double usdAmount = 365.95;
                       String userinput = editText.getText().toString();
                      Double output = Double.parseDouble(userinput);
                      Double LKRAmount = usdAmount * output;
                      displayView.setText ("LKR is:" + ( String.valueOf(LKRAmount)));
                      break;

                    }

                    case R.id.usdID:{
                        Log.v("Checking","USD Button Clicked");

                        Double usdAmount = 365.95;
                        String userinput = editText.getText().toString();
                        Double output = Double.parseDouble(userinput);
                        Double USDAmount =  output / usdAmount;
                        displayView.setText("USD is:" + (String.valueOf(USDAmount)));
                        break;

                    }
                }
            }
        });


    }
}