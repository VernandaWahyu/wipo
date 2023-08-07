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

public class MyRecyclerViewVacation extends AppCompatActivity {
    private String title = "Vacation";
    private RecyclerView rvHeroes;
    private ArrayList<Vacation> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view);
        setActionBarTitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);



        list.addAll(VacationData.getListData());
        showRecyclerGrid();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListVacationAdapter listVacationAdapter = new ListVacationAdapter(list);
        rvHeroes.setAdapter(listVacationAdapter);

        listVacationAdapter.setOnItemClickCallback(new ListVacationAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Vacation data) {
                showSelectedHero(data);
            }
        });
    }
    private void showRecyclerGrid() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridVacationAdapter gridVacationAdapter = new GridVacationAdapter(list);
        rvHeroes.setAdapter(gridVacationAdapter);

        gridVacationAdapter.setOnItemClickCallback(new GridVacationAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Vacation data) {
                showSelectedHero(data);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu);
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
    private void showSelectedHero(Vacation vacation) {
        Toast.makeText(this, "Kamu memilih " + vacation.getName(), Toast.LENGTH_SHORT).show();
        if (vacation.getName().equals("Ngebel")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.ngebel);
            intent.putExtra("Nama Vacation", "Telaga Ngebel");
            intent.putExtra("Detail Vacation", "Telaga Ngebel terletak di Desa Ngrogung, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Mloko Sewu")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.mloko);
            intent.putExtra("Nama Vacation", "Mloko Sewu");
            intent.putExtra("Detail Vacation", "Mloko Sewu terletak di Desa Pupus, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Alun Alun Ponorogo")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.alun_alun);
            intent.putExtra("Nama Vacation", "Alun Alun Ponorogo");
            intent.putExtra("Detail Vacation", "Alun-Alun Ponorogo adalah salah satu destinasi menarik yang ada di Ponorogo. Serta merupakan salah satu andalan wisata di kota yang terkenal dengan kesenian Reog-nya ini");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Air Terjun Coban Lawe")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.coban_lawe);
            intent.putExtra("Nama Vacation", "Air Terjun Coban Lawe");
            intent.putExtra("Detail Vacation", "Coban Lawe berlokasi di Krisik, Pudak, Kabupaten Ponorogo, Jawa Timur.");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Tanah Goyang")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.tanah_goyang);
            intent.putExtra("Nama Vacation", "Tanah Goyang");
            intent.putExtra("Detail Vacation", "Wisata Tanah Goyang Pudak di ponorogo adalah salah satu tempat wisata yang berada di desa pudak wetan , kecamatan pudak , kabupaten ponorogo , provinsi jawa timur , negara indonesia ");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Gunung Gajah")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.gunung_gajah);
            intent.putExtra("Nama Vacation", "Gunung Gajah");
            intent.putExtra("Detail Vacation", "Wisata Gunung Gajah di Ponorogo adalah salah satu tempat wisata yang berada di Desa Gajah, Kecamatan Sambit, kabupaten Ponorogo, Jawa Timur, Indonesia");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Gunung Beruk")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.beruk);
            intent.putExtra("Nama Vacation", "Gunung Beruk");
            intent.putExtra("Detail Vacation", "Gunung Beruk merupakan salah satu destinasi wisata alam yang ada di Ponorogo, tepatnya berada di Desa Karang Patihan, Kecamatan Balong, Kabupaten Ponorogo, Jawa Timur");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Air Terjun Sunggah")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.sunggah);
            intent.putExtra("Nama Vacation", "Air Terjun Sunggah");
            intent.putExtra("Detail Vacation", "Wisata Air Terjun Sunggah di ponorogo adalah salah satu tempat wisata yang berada di desa Selur Kecamatan Ngrayun Kabupaten Ponorogo, Jawa Timur, Indonesia");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Tumpak Lego")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.tumpak);
            intent.putExtra("Nama Vacation", "Tumpak Lego");
            intent.putExtra("Detail Vacation", "Tumpak Lego Hill berada di selatan Ponorogo tepatnya di Desa Ngrayun, Kecamatan Ngrayun, Kabupaten Ponorogo, Jawa Timur");
            this.startActivity(intent);
        }
        if (vacation.getName().equals("Wisata Ngembag Ponorogo")) {
            Intent intent = new Intent(this, DetailViewAdapterVacation.class);
            intent.putExtra("Gambar Vacation", R.drawable.ngembag);
            intent.putExtra("Nama Vacation", "Wisata Ngembag Ponorogo");
            intent.putExtra("Detail Vacation", "Wisata Taman Wisata Ngembag di ponorogo adalah salah satu tempat wisata yang berada di Desa Ronowijayan, Kecamatan Siman, Kabupaten Ponorogo, Jawa Timur, Indonesia");
            this.startActivity(intent);
    }
}
}
