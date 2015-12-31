package com.example.annasblackhat.kisah25nabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class KisahDetail extends AppCompatActivity {

    public static final String KEY_NABI = "namaNabi";
    public static final String KEY_KISAH = "kisahNabi";
    public static final String KEY_IMAGE = "gambar";
    int x = R.drawable.background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_detail);

        String nama = getIntent().getStringExtra(KEY_NABI);
        String kisah = getIntent().getStringExtra(KEY_KISAH);
        int gambar = getIntent().getIntExtra(KEY_IMAGE, x);

        ((TextView)findViewById(R.id.nama_nabi)).setText(nama);
        ((TextView)findViewById(R.id.txt_kisah)).setText(Html.fromHtml(kisah));
        ((ImageView)findViewById(R.id.gbr)).setImageResource(gambar);
    }
}
