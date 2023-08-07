package com.excursionx.wipo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView wisata, kuliner,ngebel,mloko,alun_alun,ngembag,sate,gegog,tiwul,dawet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility
                    (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        ngebel = findViewById(R.id.ngebel);
        mloko = findViewById(R.id.mloko);
        alun_alun = findViewById(R.id.alun_alun);
        ngembag = findViewById(R.id.ngembag);
        sate = findViewById(R.id.sate);
        gegog = findViewById(R.id.gegog);
        tiwul = findViewById(R.id.tiwul);
        dawet = findViewById(R.id.dawet);
        wisata = findViewById(R.id.wisata);
        kuliner = findViewById(R.id.kuliner);

        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyRecyclerViewVacation.class);
                startActivity(intent);

            }
        });
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyRecyclerViewKuliner.class);
                startActivity(intent);

            }
        });
        ngebel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterVacation.class);
                intent.putExtra("Gambar Vacation", R.drawable.ngebel);
                intent.putExtra("Nama Vacation", "Telaga Ngebel");
                intent.putExtra("Detail Vacation", "Telaga Ngebel terletak di Desa Ngrogung, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur");
                startActivity(intent);
            }
        });
        mloko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterVacation.class);
                intent.putExtra("Gambar Vacation", R.drawable.mloko);
                intent.putExtra("Nama Vacation", "Mloko Sewu");
                intent.putExtra("Detail Vacation", "Mloko Sewu terletak di Desa Pupus, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur");
                startActivity(intent);
            }
        });
        alun_alun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterVacation.class);
                intent.putExtra("Gambar Vacation", R.drawable.alun_alun);
                intent.putExtra("Nama Vacation", "Alun Alun Ponorogo");
                intent.putExtra("Detail Vacation", "Alun-Alun Ponorogo adalah salah satu destinasi menarik yang ada di Ponorogo. Serta merupakan salah satu andalan wisata di kota yang terkenal dengan kesenian Reog-nya ini");
                startActivity(intent);
            }
        });
        ngembag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterVacation.class);
                intent.putExtra("Gambar Vacation", R.drawable.ngembag);
                intent.putExtra("Nama Vacation", "Wisata Ngembag Ponorogo");
                intent.putExtra("Detail Vacation", "Wisata Taman Wisata Ngembag di ponorogo adalah salah satu tempat wisata yang berada di Desa Ronowijayan, Kecamatan Siman, Kabupaten Ponorogo, Jawa Timur, Indonesia");
                startActivity(intent);
            }
        });
        sate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterKuliner.class);
                intent.putExtra("Gambar Culinery", R.drawable.sate);
                intent.putExtra("Nama Culinery", "Sate Ayam");
                intent.putExtra("Detail Culinery", "Sate ayam yang dikembangkan di Ponorogo memiliki ciri khas tersendiri. Salah satunya dari irisan dagingnya yang memanjang dan pipih. Dengan demikian, bentuknya pun berbeda dibandingkan dengan makanan serupa dari beberapa dari daerah. Sate ayam Madura, misalnya, memiliki irisan yang kotak-kotak dan menyerupai dadu.");
                startActivity(intent);
            }
        });
        gegog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterKuliner.class);
                intent.putExtra("Gambar Culinery", R.drawable.gegog);
                intent.putExtra("Nama Culinery", "Gogegog");
                intent.putExtra("Detail Culinery", "Kuliner tradisional lain di Ponorogo adalah Sego Gegog. Konon, masakan ini merupakan makanan favorit para warok, yakni orang sakti dalam kesenian reog. Salah satu alasannya, kuliner ini memiliki rasa yang pedas.");
                startActivity(intent);
            }
        });
        tiwul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterKuliner.class);
                intent.putExtra("Gambar Culinery", R.drawable.tiwul);
                intent.putExtra("Nama Culinery", "Nasi Tiwul");
                intent.putExtra("Detail Culinery", "Saat ini, nasi tiwul sudah mulai sulit ditemukan. Namun, tidak di Ponorogo. Makanan khas Ponorogo ini akan memberikan kamu pengalaman kuliner yang tentu saja berbeda dengan kota lain");
                startActivity(intent);
            }
        });
        dawet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(MainActivity.this, DetailViewAdapterKuliner.class);
                intent.putExtra("Gambar Culinery", R.drawable.dawet);
                intent.putExtra("Nama Culinery", "Dawet Jabung");
                intent.putExtra("Detail Culinery", "Minuman pelepas dahaga ini banyak dijual di wilayah Desa Jabung, Kecamatan Mlarak. Sejumlah lapak penjual kuliner ini banyak berdiri di kawasan perempatan yang tak jauh dari Pondok Modern Darussalam Gontor.");
                startActivity(intent);
            }
        });
    }
    private void setWindowFlag(MainActivity mainActivity, final int flagTranslucentStatus, boolean on) {
        Window win = mainActivity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= flagTranslucentStatus;
        } else {
            winParams.flags &= ~flagTranslucentStatus;
        }
        win.setAttributes(winParams);
    }
}