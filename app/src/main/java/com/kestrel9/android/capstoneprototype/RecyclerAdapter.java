package com.kestrel9.android.capstoneprototype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private List<RecyclerItem> mRecyclerItemList;

    public RecyclerAdapter(List<RecyclerItem> mRecyclerItemList){
        this.mRecyclerItemList = mRecyclerItemList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mNameTv.setText(mRecyclerItemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mRecyclerItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mNameTv;

        public ViewHolder(View itemView) {
            super(itemView);
            mNameTv = itemView.findViewById(R.id.itemNameTv);
        }
    }
}
