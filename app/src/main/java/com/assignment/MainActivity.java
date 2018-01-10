package com.assignment;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();
    private Button mViewContactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise layout
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        mViewContactBtn = (Button) findViewById(R.id.button_viewcontact);  // init Button view
        // adding onclick listener to view contact
        mViewContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent read=new Intent();
                read.setAction(android.content.Intent.ACTION_VIEW);
                read.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(read);
            }
        });
    }
}
