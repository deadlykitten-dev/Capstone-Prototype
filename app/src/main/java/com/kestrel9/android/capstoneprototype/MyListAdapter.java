package com.kestrel9.android.capstoneprototype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{

    private List<MyItem> myItemList;

    public MyListAdapter(List<MyItem> myItemList){
        this.myItemList = myItemList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_main, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyItem myItem = myItemList.get(position);
        holder.mIdTextView.setText(String.valueOf(position + 1 ));
        holder.mContent.setText(myItemList.toString());
    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public final View mView;
        public final TextView mIdTextView;
        public final TextView mContent;

        public ViewHolder(View view) {
            super(view);
            mView = view;

            mIdTextView = view.findViewById(R.id.tv_id);
            mContent = view.findViewById(R.id.tv_content);
        }
    }
}
