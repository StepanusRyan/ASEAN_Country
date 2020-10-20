package com.stepanusryan.aseancountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Negara> negaras = new ArrayList<>();
    private ImageView ivAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvNegara);
        rv.setHasFixedSize(true);
        ivAbout = findViewById(R.id.imgAbout);
        ivAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });
        negaras.addAll(DataNegara.getdata());
        tampilDaftarNegara();
    }
    private void tampilDaftarNegara()
    {
        rv.setLayoutManager(new LinearLayoutManager(this));
        DaftarNegaraAdapter daftarNegaraAdapter = new DaftarNegaraAdapter(negaras);
        rv.setAdapter(daftarNegaraAdapter);
        daftarNegaraAdapter.setOnItemClickCallback(new DaftarNegaraAdapter.OnItemClickCallback() {
            @Override
            public void OnItemClicked(Negara negara) {
                DetailNegara(negara);
            }
        });
    }
    private void DetailNegara(Negara negara)
    {
        Intent detail = new Intent(MainActivity.this,DetailActivity.class);
        detail.putExtra(DetailActivity.NEGARA,negara.getNama());
        detail.putExtra(DetailActivity.FOTO,negara.getFoto());
        detail.putExtra(DetailActivity.IBUKOTA,negara.getIbukota());
        detail.putExtra(DetailActivity.DESKRIPSI,negara.getDeskripsi());
        detail.putExtra(DetailActivity.LAGUKEBANGSAAN,negara.getLagu());
        detail.putExtra(DetailActivity.PEMIMPIN,negara.getPemimpin());
        detail.putExtra(DetailActivity.SEMBOYAN,negara.getSemboyan());
        detail.putExtra(DetailActivity.ARTI,negara.getArti());
        startActivity(detail);
    }
}
