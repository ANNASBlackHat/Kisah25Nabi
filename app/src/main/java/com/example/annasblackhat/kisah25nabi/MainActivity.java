package com.example.annasblackhat.kisah25nabi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(new AdapterListView(this, nabi));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, KisahDetail.class);
                intent.putExtra(KisahDetail.KEY_NABI, nabi[0][position]);
                intent.putExtra(KisahDetail.KEY_KISAH, nabi[1][position]);
                intent.putExtra(KisahDetail.KEY_IMAGE, gambar[position]);
                startActivity(intent);
            }
        });

    }

    int[] gambar = {R.drawable.steve};

    String[][] nabi = {
            {"Nabi Adam As.","Nabi Idris As.","Nabi Nuh As.","Nabi Hud As.","Nabi Sholeh As.",
                    "Nabi Ibrohim As.","Nabi Luth As.","Nabi Ismail As.","Nabi Ishak As.",
                    "Nabi Ya’kub As.","Nabi Yusuf As.","Nabi Ayub As.","Nabi Syu’aib As.",
                    "Nabi Musa As.","Nabi Harun As.","Nabi Dzulkifli As.","Nabi Daud As.",
                    "Nabi Sulaiman As.","Nabi Ilyas As.","Nabi Ilyasa As.","Nabi Yunus As.",
                    "Nabi Zakaria As.","Nabi Yahya As.","Nabi Isa As.","Nabi Muhammad Saw"
            },
            {"Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam ‘alaihis salam, Dia berfirman:<br/>" +
                    "<br/>" +
                    "<b>“Sesungguhnya aku hendak menjadikan seorang khalifah di muka bumi.”</b> (QS. Al Baqarah: 30)<br/><br/>" +
                    "<br/>" +
                    "Yakni makhluk yang satu dengan yang lain saling menggantikan. Demikianlah Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam sebagaimana Dia memberitahukan perkara besar sebelum terwujud.<br/>" +
                    "<br/>" +
                    "Kemudian para malaikat bertanya kepada Allah Subhanahu wa Ta’ala meminta diterangkan hikmah diciptakannya manusia, karena para malaikat mengetahui bahwa di antara manusia ada yang membuat kerusakan di bumi dan menumpahkan darah. Menurut Qatadah, mereka mengetahui demikian karena mereka melihat makhluk sebelum Adam, yaitu jin dan Hin (sekelompok jin atau golongan jin yang lemah). Menurut Ibnu Umar, dua ribu tahun sebelum Adam diciptakan, jin sudah ada (menempati bumi), lalu mereka menumpahkan darah, maka Allah Subhanahu wa Ta’ala mengutus satu pasukan malaikat, lalu mereka mengusirnya ke jazirah laut.”<br/>" +
                    "<br/>" +
                    "Menurut para malaikat, jika hikmah diciptakannya manusia adalah untuk beribadah kepada Allah, maka sesungguhnya mereka telah beribadah kepada-Nya, mereka berkata,<br/>" +
                    "<br/>" +
                    "“Mengapa Engkau hendak menjadikan (khalifah) di bumi itu orang yang akan membuat kerusakan padanya dan menumpahkan darah, padahal Kami senantiasa bertasbih dengan memuji Engkau dan mensucikan Engkau?” Allah Subhanahu wa Ta’ala berfirman, “Sesungguhnya Aku mengetahui apa yang tidak kamu ketahui.” (QS. Al Baqarah: 30)<br/>" +
                    "<br/>" +
                    "Dia mengetahui maslahat yang lebih kuat dengan menciptakan Adam dan keturunannya, karena akan ada di antara mereka yang menjadi para nabi dan rasul, para shiddiqin, para syuhada, para ulama dan orang-orang yang mengamalkan agama-Nya, yang mencintai-Nya, dan mengikuti para rasul-Nya.<br/>" +
                    "<br/>" +
                    "Allah Subhanahu wa Ta’ala menciptakan Adam ‘alaihis salam dari tanah di bumi dan airnya, lalu membentuknya dengan bentuk yang sebaik-baiknya, kemudian Dia tiupkan ruh ke dalamnya, maka jadilah dia sebagai manusia yang hidup yang terdiri dari daging, darah, dan tulang. Hari penciptaan Adam ‘alaihis salam adalah hari Jumat, Rasulullah shallallahu ‘alaihi wa sallam bersabda,",
                    "Ini Kisah Nabi Idris As.",
                    "Ini Kisah Nabi Nuh As.",
                    "Ini Kisah Nabi Hud As.",
                    "Ini Kisah Nabi Sholeh As.",
                    "Ini Kisah Nabi Ibrohim As.",
                    "Ini Kisah Nabi Luth As.",
                    "Ini Kisah Nabi Ismail As.",
                    "Ini Kisah Nabi Ishak As.",
                    "Ini Kisah Nabi Ya’kub As.",
                    "Ini Kisah Nabi Yusuf As.",
                    "Ini Kisah Nabi Ayub As.",
                    "Ini Kisah Nabi Syu’aib As.",
                    "Ini Kisah Nabi Musa As.",
                    "Ini Kisah Nabi Harun As.",
                    "Ini Kisah Nabi Dzulkifli As.",
                    "Ini Kisah Nabi Daud As.",
                    "Ini Kisah Nabi Sulaiman As.",
                    "Ini Kisah Nabi Ilyas As.","Ini Kisah Nabi Ilyasa As.","Ini Kisah Nabi Yunus As.",
                    "Ini Kisah Nabi Zakaria As.","Ini Kisah Nabi Yahya As.","Ini Kisah Nabi Isa As.","Ini Kisah Nabi Muhammad Saw"}
    };
}
