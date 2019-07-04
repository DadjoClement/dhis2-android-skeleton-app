package com.example.android.androidskeletonapp.ui.d2_errors;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;

import com.example.android.androidskeletonapp.ui.base.DiffByIdItemCallback;
import com.example.android.androidskeletonapp.ui.base.ListItemHolder;

import org.hisp.dhis.android.core.maintenance.D2Error;

public class D2errorAdapter extends PagedListAdapter<D2Error, ListItemHolder> {

    D2errorAdapter(){
        super(new DiffByIdItemCallback<>());
    }

    @NonNull
    @Override
    public  ListItemHolder onCreatViListItemHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ListItemHolder(itemView);
    }
    @Override
    public  void onBindViewHolder(@NonNull ListItemHolder holder, int position){

    }
}
