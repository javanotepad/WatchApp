package application.watch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Login extends AppCompatActivity {

    EditText username ;
    EditText password ;
    Button login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
    }
    public void loginButton(View view){
        /* code of database */
        Intent i = new Intent(this,Home.class);
        startActivity(i);
    }
    public void forgetPasswordButton(View view){
        Intent i = new Intent(this,ForgotPassword.class);
        startActivity(i);
    }
    public void signUpButton(View view){
        Intent i = new Intent(this,SignUp.class);
        startActivity(i);
    }}


