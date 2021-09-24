package com.example.grocery_store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grocery_store.Adapter.BS_Adapter;
import com.example.grocery_store.Adapter.Eo_Adapter;
import com.example.grocery_store.Adapter.Grocery_Adapter;

public class MainActivity extends AppCompatActivity {
   RecyclerView offers,groceries,selling;
   Eo_Adapter eo_adapter;
   BS_Adapter bs_adapter;
   Grocery_Adapter grocery_adapter;
   Integer eo[]={R.drawable.banana,R.drawable.apple};
   String title[]={"Organic Bananas","Red Apple"};
   String quant[]={"7pcs","1kg"};

    String groctitle[]={"Pulses","Rice"};
    Integer groc[]={R.drawable.pulses,R.drawable.rice};


    String bstitle[]={"Bell Pepper Red","Ginger"};
    Integer bs[]={R.drawable.capsicum,R.drawable.ginger};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        offers=(RecyclerView)findViewById(R.id.eo_rv);
        groceries=(RecyclerView)findViewById(R.id.groc_rv);
        selling=(RecyclerView)findViewById(R.id.bs_rv);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        offers.setLayoutManager(layoutManager);
        offers.setHasFixedSize(true);
        eo_adapter=new Eo_Adapter(MainActivity.this,title,eo,quant);
        offers.setAdapter(eo_adapter);

        LinearLayoutManager linearlayoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        groceries.setLayoutManager(linearlayoutManager2);
        groceries.setHasFixedSize(true);
        grocery_adapter=new Grocery_Adapter(MainActivity.this,groctitle,groc);
        groceries.setAdapter(grocery_adapter);



        LinearLayoutManager linearlayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        selling.setLayoutManager(linearlayoutManager);
        selling.setHasFixedSize(true);
        bs_adapter=new BS_Adapter(MainActivity.this,bstitle,bs);
        selling.setAdapter(bs_adapter);

    }
}