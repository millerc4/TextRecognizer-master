package com.skyhope.textrecognizer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InstructionsActivity extends AppCompatActivity {

    TextView instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        instructions = findViewById(R.id.text_instructions);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        instructions.setText(str);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("message_return", "returned");
        setResult(RESULT_OK, intent);
        finish();
    }
}
