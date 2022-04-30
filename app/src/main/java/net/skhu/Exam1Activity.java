package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        Button button1 = findViewById(R.id.btnUp);
        Button button2 = findViewById(R.id.btnDown);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s = Integer.valueOf(R.string.number);
                //String.format("%d", R.string.number);
                //int num = Integer.valueOf(s).intValue();
                int buttonId = view.getId();
                switch(buttonId) {
                    case R.id.btnUp:   s += 1; break;
                    case R.id.btnDown: s -= 1; break;
                }
                EditText e = findViewById(R.id.editText_number);
                e.setText(Integer.valueOf(s));
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
    }
}

