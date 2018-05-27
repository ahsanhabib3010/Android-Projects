package com.example.ahsanhabib.customlistview_25_01_18;

/**
 * Created by Ahsan Habib on 25-Jan-18.
 */

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {
        CustomAdapter(Context context,  String[] books) {
        super(context,R.layout.custom_row ,books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);
        String singleItem = getItem(position);

        TextView tv = (TextView)customView.findViewById(R.id.tv);
        ImageView img = (ImageView)customView.findViewById(R.id.imgView);

        tv.setText(singleItem);
        img.setImageResource(R.drawable.formal_dp);
        return customView;
    }
}
