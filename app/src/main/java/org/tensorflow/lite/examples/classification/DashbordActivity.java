package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashbordActivity extends AppCompatActivity {
    FloatingActionButton mAddFab, mAddAlarmFab, mAddPersonFab;

    // These are taken to make visible and invisible along
    // with FABs
    TextView addAlarmActionText, addPersonActionText;

    // to check whether sub FAB buttons are visible or not.
    Boolean isAllFabsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        mAddFab = findViewById(R.id.add_fab);

        mAddAlarmFab = findViewById(R.id.add_alarm_fab);
        mAddPersonFab = findViewById(R.id.add_person_fab);
        addAlarmActionText = findViewById(R.id.add_alarm_action_text);
        addPersonActionText = findViewById(R.id.add_person_action_text);

        mAddAlarmFab.setVisibility(View.GONE);
        mAddPersonFab.setVisibility(View.GONE);
        addAlarmActionText.setVisibility(View.GONE);
        addPersonActionText.setVisibility(View.GONE);

        isAllFabsVisible = false;

        mAddFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (!isAllFabsVisible) {


                            mAddAlarmFab.show();
                            mAddPersonFab.show();
                            addAlarmActionText.setVisibility(View.VISIBLE);
                            addPersonActionText.setVisibility(View.VISIBLE);
                            isAllFabsVisible = true;
                            mAddFab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_multiply));
                        } else {


                            mAddAlarmFab.hide();
                            mAddPersonFab.hide();
                            addAlarmActionText.setVisibility(View.GONE);
                            addPersonActionText.setVisibility(View.GONE);
                            isAllFabsVisible = false;
                            mAddFab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_add));

                        }
                    }
                });


        mAddPersonFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(DashbordActivity.this, "Person Added", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(DashbordActivity.this, ClassifierActivity.class);
                        startActivity(i);
                    }
                });


        mAddAlarmFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DashbordActivity.this, "This activity is not yet added", Toast.LENGTH_SHORT).show();

                    }
                });
    }
}