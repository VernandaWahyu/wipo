package com.excursionx.wipo;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerViewKuliner extends AppCompatActivity {
    private String title = "Kuliner";
    private RecyclerView rvHeroes;
    private ArrayList<Kuliner> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view_kuliner);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(KulinerData.getListData());
        showRecyclerGrid();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(list);
        rvHeroes.setAdapter(listKulinerAdapter);

        listKulinerAdapter.setOnItemClickCallback(new ListKulinerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kuliner data) {
                showSelectedHero(data);
            }
        });
    }
    private void showRecyclerGrid() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridKulinerAdapter gridKulinerAdapter = new GridKulinerAdapter(list);
        rvHeroes.setAdapter(gridKulinerAdapter);

        gridKulinerAdapter.setOnItemClickCallback(new GridKulinerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kuliner data) {
                showSelectedHero(data);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        //super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showSelectedHero(Kuliner hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
        if (hero.getName().equals("Gogegog")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.gegog);
            intent.putExtra("Nama Culinery", "Gogegog");
            intent.putExtra("Detail Culinery", "Kuliner tradisional lain di Ponorogo adalah Sego Gegog. Konon, masakan ini merupakan makanan favorit para warok, yakni orang sakti dalam kesenian reog. Salah satu alasannya, kuliner ini memiliki rasa yang pedas.");
            this.startActivity(intent);
        }
        if (hero.getName().equals("Sate Ayam")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.sate);
            intent.putExtra("Nama Culinery", "Sate Ayam");
            intent.putExtra("Detail Culinery", "Sate ayam yang dikembangkan di Ponorogo memiliki ciri khas tersendiri. Salah satunya dari irisan dagingnya yang memanjang dan pipih. Dengan demikian, bentuknya pun berbeda dibandingkan dengan makanan serupa dari beberapa dari daerah. Sate ayam Madura, misalnya, memiliki irisan yang kotak-kotak dan menyerupai dadu.");
            this.startActivity(intent);
        }
        if (hero.getName().equals("Tiwul")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.tiwul);
            intent.putExtra("Nama Culinery", "Nasi Tiwul");
            intent.putExtra("Detail Culinery", "Saat ini, nasi tiwul sudah mulai sulit ditemukan. Namun, tidak di Ponorogo. Makanan khas Ponorogo ini akan memberikan kamu pengalaman kuliner yang tentu saja berbeda dengan kota lain");
            this.startActivity(intent);
        }
        if (hero.getName().equals("Gethuk")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.gethuk);
            intent.putExtra("Nama Culinery", "Gethuk");
            intent.putExtra("Detail Culinery", "Jajanan tradisional ini juga sudah dibuat dan dijual secara turun temurun. Saat ini, mayoritas warga yang masih memproduksinya merupakan generasi ketiga dari pembuat sebelumnya. Meski demikian, salah satu kuliner masih banyak diminati.");
            this.startActivity(intent);
        }
        if (hero.getName().equals("Dawet")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.dawet);
            intent.putExtra("Nama Culinery", "Dawet Jabung");
            intent.putExtra("Detail Culinery", "Minuman pelepas dahaga ini banyak dijual di wilayah Desa Jabung, Kecamatan Mlarak. Sejumlah lapak penjual kuliner ini banyak berdiri di kawasan perempatan yang tak jauh dari Pondok Modern Darussalam Gontor.");
            this.startActivity(intent);
        }
        if (hero.getName().equals("Jenang")) {
            Intent intent = new Intent(this, DetailViewAdapterKuliner.class);
            intent.putExtra("Gambar Culinery", R.drawable.jenang);
            intent.putExtra("Nama Culinery", "Jenang");
            intent.putExtra("Detail Culinery", "Jajanan ini merupakan salah satu komoditas legendaris di Ponorogo. Sebab, sudah ada sejak puluhan tahun lalu dan masih eksis hingga hari ini karena rasa, teksturnya yang legit banyak diminati pecinta kuliner. Maka tak heran, Jenang Mirah ini banyak digunakan sebagai oleh-oleh.");
            this.startActivity(intent);
        }
    }
}
