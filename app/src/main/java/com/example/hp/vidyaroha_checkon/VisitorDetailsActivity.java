package com.example.hp.vidyaroha_checkon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisitorDetailsActivity extends AppCompatActivity {

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor_details);
        nextBtn = (Button) findViewById(R.id.visitor_next_btn);


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VisitorDetailsActivity.this,HostDetailsActivity.class);
                startActivity(i);
                finish();


            }
        });
    }
}
