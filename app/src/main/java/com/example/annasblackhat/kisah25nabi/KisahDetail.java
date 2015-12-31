package com.example.annasblackhat.kisah25nabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KisahDetail extends AppCompatActivity {

    public static final String KEY_NABI = "namaNabi";
    public static final String KEY_KISAH = "kisahNabi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_detail);

        String nama = getIntent().getStringExtra(KEY_NABI);
        String kisah = getIntent().getStringExtra(KEY_KISAH);

        ((TextView)findViewById(R.id.nama_nabi)).setText(nama);
        ((TextView)findViewById(R.id.txt_kisah)).setText(kisah);
    }
}
