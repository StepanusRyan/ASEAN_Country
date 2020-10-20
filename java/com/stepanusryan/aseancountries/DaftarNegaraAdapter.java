package com.stepanusryan.aseancountries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DaftarNegaraAdapter extends RecyclerView.Adapter<DaftarNegaraAdapter.DaftarViewHolder> {
    private ArrayList<Negara> daftarNegara;
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback)
    {
        this.onItemClickCallback = onItemClickCallback;
    }
    public DaftarNegaraAdapter(ArrayList<Negara> daftar) {
        this.daftarNegara = daftar;
    }
    @NonNull
    @Override
    public DaftarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_negara_asean,parent,false);
        return new DaftarViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final DaftarViewHolder holder, int position) {
        Negara negara = daftarNegara.get(position);
        Glide.with(holder.itemView.getContext())
                .load(negara.getFoto())
                .apply(new RequestOptions().override(60,60))
                .into(holder.img);
        holder.negara.setText(negara.getNama());
        holder.ibukota.setText(negara.getIbukota());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.OnItemClicked(daftarNegara.get(holder.getAdapterPosition()));
            }
        });
    }
    @Override
    public int getItemCount() {
        return daftarNegara.size();
    }

    public class DaftarViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView negara,ibukota;
        public DaftarViewHolder(@NonNull View view) {
            super(view);
            img = view.findViewById(R.id.img_bendera);
            negara = view.findViewById(R.id.txtNegara);
            ibukota = view.findViewById(R.id.txtIbuKota);
        }
    }
    public interface OnItemClickCallback
    {
        void OnItemClicked(Negara negara);
    }
}
