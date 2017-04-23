package application.watch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ForgotPassword extends AppCompatActivity {
    Button email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        email = (Button) findViewById(R.id.send);
    }

    public void sendNewPassword(View view) {
        /* code database AND way sent password to email */
    }
}