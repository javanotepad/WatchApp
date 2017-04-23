package application.watch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void homeButton(View view){
        Intent i = new Intent(this,Home.class);
        startActivity(i);
    }
    public void profileButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void vitalSignsButton(View view){
        Intent i = new Intent(this,VitalSigns.class);
        startActivity(i);
    }
    public void medicationButton(View view){
        Intent i = new Intent(this,Medications.class);
        startActivity(i);
    }
    public void reportButton(View view){
        Intent i = new Intent(this,Report.class);
        startActivity(i);
    }
    public void aboutEpilepsyButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void aboutUSButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void contactUSButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void emergencyButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void appointmentButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void locationButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }

}
