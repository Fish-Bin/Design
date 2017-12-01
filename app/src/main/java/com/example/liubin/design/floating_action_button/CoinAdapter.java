package com.example.liubin.design.floating_action_button;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.liubin.design.R;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.ViewHolder> {
    private Context context;
    private String[] items;

    public CoinAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_view, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.tvName.setText(items[position]);
    }

    @Override
    public int getItemCount() {
        return items != null ? items.length : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv);
        }
    }
}

