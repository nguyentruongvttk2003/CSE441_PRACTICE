package com.example.ex05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {
    Button btnTieptuc, btnGiai, btnThoat;
    EditText edita, editb, editc;
    TextView txtkq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTieptuc = findViewById(R.id.btntieptuc);
        btnGiai = findViewById(R.id.btngiaipt);
        btnThoat = findViewById(R.id.btnthoat);
        edita = findViewById(R.id.edta);
        editb = findViewById(R.id.edtb);
        editc = findViewById(R.id.edtc);
        txtkq = findViewById(R.id.txtkq);

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input values
                String sa = edita.getText().toString();
                String sb = editb.getText().toString();
                String sc = editc.getText().toString();

                // Validate inputs
                if (sa.isEmpty() || sb.isEmpty() || sc.isEmpty()) {
                    txtkq.setText("Vui lòng nhập đủ các hệ số a, b, và c.");
                    return;
                }

                int a = Integer.parseInt(sa);
                int b = Integer.parseInt(sb);
                int c = Integer.parseInt(sc);

                String kq = "";
                DecimalFormat dcf = new DecimalFormat("0.00");

                // Solve the quadratic equation
                if (a == 0) {
                    if (b == 0) {
                        if (c == 0)
                            kq = "Phương trình vô số nghiệm";
                        else
                            kq = "Phương trình vô nghiệm";
                    } else {
                        kq = "Phương trình có 1 nghiệm: x = " + dcf.format(-c / (double) b);
                    }
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        kq = "Phương trình vô nghiệm";
                    } else if (delta == 0) {
                        kq = "Phương trình có nghiệm kép: x1 = x2 = " + dcf.format(-b / (2.0 * a));
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        kq = "Phương trình có 2 nghiệm: x1 = " + dcf.format(x1) + "; x2 = " + dcf.format(x2);
                    }
                }

                txtkq.setText(kq);
            }
        });

        btnTieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edita.setText("");
                editb.setText("");
                editc.setText("");
                txtkq.setText("");
                edita.requestFocus();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}