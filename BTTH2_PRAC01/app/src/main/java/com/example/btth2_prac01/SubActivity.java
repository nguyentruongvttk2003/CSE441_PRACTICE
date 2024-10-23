package com.example.btth2_prac01;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    private EditText nameEditText;
    private EditText gpaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        nameEditText = findViewById(R.id.nameEditText);
        gpaEditText = findViewById(R.id.gpaEditText);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String gpa = gpaEditText.getText().toString();

            Intent resultIntent = new Intent();
            resultIntent.putExtra("name", name);
            resultIntent.putExtra("gpa", gpa);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}

