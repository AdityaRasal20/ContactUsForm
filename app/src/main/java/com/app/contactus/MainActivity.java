package com.app.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name, Email, Age, Address, Phonenumber, Course;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.PersonName);
        Email = (EditText) findViewById(R.id.EmailAddress);
        Age = (EditText) findViewById(R.id.age);
        Address = (EditText) findViewById(R.id.address);
        Phonenumber = (EditText) findViewById(R.id.Phone);
        Course = (EditText) findViewById(R.id.MultiLine2);
        Submit = (Button) findViewById(R.id.button);
        Submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Submit();
                break;
        }
    }

    public void Submit() {
        String PersonName = Name.getText().toString().trim();
        String EmailAddress = Email.getText().toString().trim();
        String age = Age.getText().toString().trim();
        String address = Address.getText().toString().trim();
        String Phone = Phonenumber.getText().toString().trim();
        String MultiLine2 = Course.getText().toString().trim();
        if (PersonName.isEmpty()) {
            Name.setError("Full name is required");
            Name.requestFocus();
            return;
        }
        if (EmailAddress.isEmpty()) {
            Email.setError("Mail-id is required");
            Email.requestFocus();
            return;
        }
        if (age.isEmpty()) {
            Age.setError("Age is required");
            Age.requestFocus();
            return;
        }
        if (address.isEmpty()) {
            Address.setError("Address  is required");
            Address.requestFocus();
            return;
        }

        if (Phone.isEmpty()) {
            Phonenumber.setError("Phone number is required");
            Phonenumber.requestFocus();
            return;
        }

        if (MultiLine2.isEmpty()) {
            Course.setError("Full name is required");
            Course.requestFocus();
            return;
        }

    }

}
