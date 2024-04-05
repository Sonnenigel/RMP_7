package com.example.practice_7.UILayer.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.practice_7.DataLayer.Model.Tail;
import com.example.practice_7.Item;
import com.example.practice_7.R;
import java.util.List;

public class TailAdapter extends
        RecyclerView.Adapter<TailAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Tail> items;
    private Item ItemListener;

    public TailAdapter(Context context, List<Tail> items, Item ItemListener) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
        this.ItemListener = ItemListener;
    }

    @Override
    public TailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void
    onBindViewHolder(TailAdapter.ViewHolder holder, int position) {
        Tail item = items.get(position);
        holder.textView.setText(item.getName());
        holder.imageView.setImageResource(R.drawable.dog);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { ItemListener.onItemClicked(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        final ImageView imageView;
        ViewHolder(View view){
            super(view);
            textView = view.findViewById(R.id.textViewItemName);
            imageView = view.findViewById(R.id.imageViewItemImage);
        }
    }
}
