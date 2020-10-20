package com.stepanusryan.aseancountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String NEGARA = "negara";
    public static final String FOTO = "foto";
    public static final String IBUKOTA = "ibukota";
    public static final String DESKRIPSI = "deskripsi";
    public static final String LAGUKEBANGSAAN = "lagukebangsaan";
    public static final String PEMIMPIN = "pemimpin";
    public static final String SEMBOYAN = "semboyan";
    public static final String ARTI = "arti";
    private TextView ng,ibk,des,lagu,pem,semboyan,arti;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ng = findViewById(R.id.getData);
        ibk = findViewById(R.id.setIbukota);
        des = findViewById(R.id.setDesc);
        lagu = findViewById(R.id.setLagu);
        pem = findViewById(R.id.setPemimpin);
        imageView = findViewById(R.id.gambarBendera);
        semboyan = findViewById(R.id.setSemboyan);
        arti = findViewById(R.id.setArti);
        final String negara = getIntent().getStringExtra(NEGARA);
        int bendera = getIntent().getIntExtra(FOTO,0);
        String ibu = getIntent().getStringExtra(IBUKOTA);
        String deskr = getIntent().getStringExtra(DESKRIPSI);
        String lag = getIntent().getStringExtra(LAGUKEBANGSAAN);
        String sem = getIntent().getStringExtra(SEMBOYAN);
        String art = getIntent().getStringExtra(ARTI);
        final String pemimp = getIntent().getStringExtra(PEMIMPIN);
        ng.setText(negara);
        imageView.setImageResource(bendera);
        ibk.setText(ibu);
        des.setText(deskr);
        lagu.setText(lag);
        pem.setText(pemimp);
        semboyan.setText(sem);
        arti.setText(art);
    }
}
