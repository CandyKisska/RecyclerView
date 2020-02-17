package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class PartyAdapter extends RecyclerView.Adapter<PartyAdapter.PartyViewHolder> {
    ArrayList<Party> data;

    PartyAdapter(ArrayList<Party> data) {
        this.data = data;
    }

    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public PartyAdapter.PartyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_party, parent, false);

        return new PartyViewHolder(view);
    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override
    public void onBindViewHolder(@NonNull PartyAdapter.PartyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    //Сколько предметов в списке
    @Override
    public int getItemCount() {
        return data.size();
    }

    class PartyViewHolder extends RecyclerView.ViewHolder {
        TextView address,name,time,rad,date;
       ImageView photo;
        public PartyViewHolder(@NonNull View itemView) {
            super(itemView);
            address = itemView.findViewById(R.id.address);
            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            date = itemView.findViewById(R.id.date);
            rad = itemView.findViewById(R.id.rad);
            photo = itemView.findViewById(R.id.imageView);

        }
        public void bind(Party party) {
            address.setText(party.address);
            name.setText(party.name);
            date.setText(party.date);
            time.setText(party.time);
            rad.setText(party.rad);
            photo.setImageDrawable(party.photo);
        }
    }
}