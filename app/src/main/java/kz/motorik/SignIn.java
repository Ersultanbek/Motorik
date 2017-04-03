package kz.motorik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SignIn extends Activity {


    private String login="";
    private String password="";
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signIn = (Button)findViewById(R.id.signIn);

        signIn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView loginField = (TextView)findViewById(R.id.EmailField);
                TextView passWordField = (TextView)findViewById(R.id.PasswordField);

            }
        });
    }




}
