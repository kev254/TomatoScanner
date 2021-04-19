package org.tensorflow.lite.examples.classification;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    TextView Register,forgot_pass;
    CardView card_phone, card_email;
    private static final int RC_SIGN_IN = 1001;
    Button login;
    EditText editTextEmail,editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Register=findViewById(R.id.txtsignup);
        login=findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(LoginActivity.this, DashbordActivity.class);
                startActivity(i);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });

    }
}