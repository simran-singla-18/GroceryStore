package com.example.grocery_store.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocery_store.Grocery_Activity;
import com.example.grocery_store.MainActivity;
import com.example.grocery_store.R;

public class Grocery_Adapter extends RecyclerView.Adapter<Grocery_Adapter.ViewModel> {
    MainActivity mainActivity;
    String[] groctitle;Integer[] groc;

    public Grocery_Adapter(MainActivity mainActivity, String[] groctitle, Integer[] groc) {
        this.mainActivity=mainActivity;
        this.groctitle=groctitle;
        this.groc=groc;

    }

    @NonNull
    @Override
    public Grocery_Adapter.ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.groc_item,parent,false);
        return new Grocery_Adapter.ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Grocery_Adapter.ViewModel holder, int position) {
        holder.imageView2.setBackgroundResource(groc[position]);
        holder.name2.setText(groctitle[position]);
        holder.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainActivity, Grocery_Activity.class);
                intent.putExtra("name",groctitle[position]);
                intent.putExtra("link",groc[position]);
                mainActivity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return groc.length;
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView name2;
        public ViewModel(@NonNull View itemView) {
            super(itemView);
            imageView2=(itemView).findViewById(R.id.image2);
            name2=(itemView).findViewById(R.id.text2);

        }
    }
}
