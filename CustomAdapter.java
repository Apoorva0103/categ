package com.example.android.categ;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model> category_list;
    Context context;

    public CustomAdapter(List<Model> category_list, Context context) {
        this.category_list = category_list;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = category_list.get(position);
        holder.name.setText(model.getName());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        ArrayAdapter<String> myAdapter = new ArrayAdapter(context,
                android.R.layout.simple_list_item_1, context.getResources().getStringArray(R.array.Quantity));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        holder.spinner.setAdapter(myAdapter);

    }

    @Override
    public int getItemCount() {
        return category_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        Spinner spinner;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view);
            name = itemView.findViewById(R.id.name_text_view);
            spinner = itemView.findViewById(R.id.spinner);
        }
    }
}
