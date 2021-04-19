package org.tensorflow.lite.examples.classification;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SignupActivity extends AppCompatActivity {
    EditText editTextName,editTextEmail,editTextPassword,editTextConfirmPassword;
    TextView accountText;
    Button cirRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }
}