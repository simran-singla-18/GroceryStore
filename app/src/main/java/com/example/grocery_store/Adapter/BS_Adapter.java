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

public class BS_Adapter extends RecyclerView.Adapter<BS_Adapter.ViewModel> {
    MainActivity mainActivity;
    String[] bstitle;Integer[] bs;

    public BS_Adapter(MainActivity mainActivity, String[] bstitle, Integer[] bs) {
        this.mainActivity=mainActivity;
        this.bstitle=bstitle;
        this.bs=bs;

    }

    @NonNull
    @Override
    public BS_Adapter.ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.item_bs,parent,false);
        return new BS_Adapter.ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BS_Adapter.ViewModel holder, int position) {
        holder.imageView.setBackgroundResource(bs[position]);
        holder.name.setText(bstitle[position]);

    }

    @Override
    public int getItemCount() {
        return bs.length;
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        public ViewModel(@NonNull View itemView) {
            super(itemView);
            imageView=(itemView).findViewById(R.id.image1);
            name=(itemView).findViewById(R.id.text1);

        }
    }
}

