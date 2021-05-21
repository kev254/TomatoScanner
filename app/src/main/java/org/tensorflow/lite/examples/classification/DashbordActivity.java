package org.tensorflow.lite.examples.classification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class DashbordActivity extends AppCompatActivity implements  View.OnClickListener {
    TextView community,usermail,scan, me, farmguide,calculator;
    FirebaseAuth firebaseAuth;
    Button btScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        Toolbar toolbar = findViewById(R.id.toolbar);
        community = findViewById(R.id.txtCommunity);
        scan=findViewById(R.id.scan);
        calculator=findViewById(R.id.calc);
        farmguide=findViewById(R.id.guide);
        btScan=findViewById(R.id.btnscan);
        me=findViewById(R.id.me);
        calculator.setOnClickListener(this);
        farmguide.setOnClickListener(this);
        community.setOnClickListener(this);
        scan.setOnClickListener(this);
        btScan.setOnClickListener(this);
        me.setOnClickListener(this);

        setSupportActionBar(toolbar);
        usermail=findViewById(R.id.login_title);
        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() !=null){

        }
        usermail.setText("Hi, "+firebaseAuth.getCurrentUser().getEmail());

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.scan){
            Intent i = new Intent(DashbordActivity.this, ClassifierActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.quickstart){
            Intent i= new Intent(DashbordActivity.this,IntroActivity.class);
            finish();
            startActivity(i);
        }

        if (item.getItemId() == R.id.btn_logout) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.tfe_ic_app_name);
            builder.setCancelable(true);
            builder.setMessage("Do you really want to logout?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    FirebaseAuth.getInstance().signOut();
                    finish();

                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();

        }
        if (item.getItemId() == R.id.vet) {
            Dexter.withActivity(DashbordActivity.this)
                    .withPermission(Manifest.permission.CALL_PHONE)
                    .withListener(new PermissionListener() {
                        @Override
                        public void onPermissionGranted(PermissionGrantedResponse response) {
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0792097883"));
                            startActivity(intent);
                        }

                        @Override
                        public void onPermissionDenied(PermissionDeniedResponse response) {
                            Toast.makeText(getApplicationContext(), "Permission Denied", Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                            token.continuePermissionRequest();

                        }
                    }).check();

        }

        if (item.getItemId() == R.id.agrovet) {
            Dexter.withActivity(DashbordActivity.this)
                    .withPermission(Manifest.permission.CALL_PHONE)
                    .withListener(new PermissionListener() {
                        @Override
                        public void onPermissionGranted(PermissionGrantedResponse response) {
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:0792097883"));
                            startActivity(intent);
                        }

                        @Override
                        public void onPermissionDenied(PermissionDeniedResponse response) {
                            Toast.makeText(getApplicationContext(), "Permission Denied", Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                            token.continuePermissionRequest();

                        }
                    }).check();

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == community) {

            startActivity(new Intent(this, MenuActivity.class));
        }
        if(v==scan){

            startActivity(new Intent(this,ClassifierActivity.class));
        }
        if(v==me){

        }
        if(v==btScan){
            startActivity(new Intent(this,ClassifierActivity.class));
        }
        if(v==farmguide){

            startActivity(new Intent(this,InformationActivity.class));
        }
        if(v==calculator){

            startActivity(new Intent(this,Calculator.class));
        }


    }
}