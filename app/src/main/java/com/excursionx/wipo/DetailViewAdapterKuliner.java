package com.excursionx.wipo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailViewAdapterKuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view_adapter_kuliner);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility
                    (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        ImageView ivdefaultfoto =findViewById(R.id.ivdefaultimage);
        TextView tvdefaultname=findViewById(R.id.ivdefaultname);
        TextView tvdefaultdetail=findViewById(R.id.ivdefaultdetail);

        Intent intent = getIntent();

        int imageCulinery = intent.getIntExtra("Gambar Culinery",0);
        String namaCulinery =intent.getStringExtra("Nama Culinery");
        String detailCulinery =intent.getStringExtra("Detail Culinery");

        ivdefaultfoto.setImageResource(imageCulinery);
        tvdefaultname.setText(namaCulinery);
        tvdefaultdetail.setText(detailCulinery);

    }
    private void setWindowFlag(DetailViewAdapterKuliner detailViewAdapterKuliner, final int flagTranslucentStatus, boolean on) {
        Window win = detailViewAdapterKuliner.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= flagTranslucentStatus;
        } else {
            winParams.flags &= ~flagTranslucentStatus;
        }
        win.setAttributes(winParams);
    }
}