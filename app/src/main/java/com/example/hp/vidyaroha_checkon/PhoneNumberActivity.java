package com.example.hp.vidyaroha_checkon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lamudi.phonefield.PhoneInputLayout;

public class PhoneNumberActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);

        final PhoneInputLayout phoneInputLayout = (PhoneInputLayout) findViewById(R.id.phone_input_layout);

        final Button button = (Button) findViewById(R.id.phone_check_in);

        //cocphoneInputLayout.setHint();
        phoneInputLayout.setDefaultCountry("IN");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean valid = true;

                // checks if the field is valid
                if (phoneInputLayout.isValid()) {
                    phoneInputLayout.setError(null);
                } else {
                    // set error message
                    phoneInputLayout.setError("Invalid Phone Number");
                    valid = false;
                }
                if (valid) {
                    Intent i = new Intent(PhoneNumberActivity.this,VisitorDetailsActivity.class);
                    startActivity(i);
                    finish();


                } else {
                    Toast.makeText(PhoneNumberActivity.this, "Invalid Phone Number", Toast.LENGTH_LONG).show();
                }

                // Return the phone number as follows
                String phoneNumber = phoneInputLayout.getPhoneNumber();



            }
        });


    }
}
