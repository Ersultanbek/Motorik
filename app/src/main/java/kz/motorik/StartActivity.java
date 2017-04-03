package kz.motorik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final Intent clientPage = new Intent(this, SignIn.class);
        Button clientButton = (Button)findViewById(R.id.ClientButton);
      ///TEXT HERE
        clientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(clientPage);
            }});


    }



}
