package application.watch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText username ;
    EditText email ;
    EditText password ;
    EditText r_password ;
    Button signup ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username=(EditText) findViewById(R.id.username);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        r_password=(EditText) findViewById(R.id.r_password);
        signup=(Button) findViewById(R.id.login);

    }
    public void signupButton(View view){
        /* code of database */
        Intent i = new Intent(this,Home.class);
        startActivity(i);
    }
}
