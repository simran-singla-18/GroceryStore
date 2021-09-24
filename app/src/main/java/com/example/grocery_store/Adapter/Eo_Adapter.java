package com.example.grocery_store.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocery_store.MainActivity;
import com.example.grocery_store.R;

public class Eo_Adapter extends RecyclerView.Adapter<Eo_Adapter.ViewModel> {
    MainActivity mainActivity;
    String[] title;Integer[] eo;
    String[] quant;
    public Eo_Adapter(MainActivity mainActivity, String[] title, Integer[] eo,String[] quant) {
        this.mainActivity=mainActivity;
        this.title=title;
        this.eo=eo;
        this.quant=quant;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.item_eo,parent,false);
        return new ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        holder.imageView.setBackgroundResource(eo[position]);
        holder.name.setText(title[position]);
        holder.quantity.setText(quant[position]);
    }

    @Override
    public int getItemCount() {
        return eo.length;
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,quantity;
        public ViewModel(@NonNull View itemView) {
            super(itemView);
            imageView=(itemView).findViewById(R.id.image);
            name=(itemView).findViewById(R.id.text);
            quantity=(itemView).findViewById(R.id.smalltext);
        }
    }
}
