package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class PhoneActivity extends AppCompatActivity {
    ProgressBar progress_bar;
    Button generate_btn,verify_otp;
    EditText country_code_text,phone_number_text,phone_code;
    private String mVerificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

    }
}