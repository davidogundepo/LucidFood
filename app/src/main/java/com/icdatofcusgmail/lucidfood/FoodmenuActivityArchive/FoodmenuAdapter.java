package com.icdatofcusgmail.lucidfood.FoodmenuActivityArchive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.icdatofcusgmail.lucidfood.R;
import com.icdatofcusgmail.lucidfood.VendorActivityArchive.Icdat;

import java.util.ArrayList;

/**
 * Created by DAVID OGUNDEPO on 03/27/2017.
 *
 */

class FoodmenuAdapter extends BaseAdapter {

    private Context d;
    private ArrayList<Icdat> icdats;

    FoodmenuAdapter(Context d, ArrayList<Icdat> icdats) {
        this.d = d;
        this.icdats = icdats;
    }


    @Override
    public int getCount() {
        return icdats.size();
    }

    @Override
    public Object getItem(int position) {
        return icdats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) d.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            if (inflater != null) {
                convertView = inflater.inflate(R.layout.fa_imagemodel, parent, false);
            }
        }

//        //Our Views
//        ImageView imageView2 = null;
//        if (convertView != null) {
//            imageView2 = convertView.findViewById(R.id.imagemodel2);
//        }
//        TextView textView2 = null;
//        if (convertView != null) {
//            textView2 = convertView.findViewById(R.id.textmodel2);
//        }
//
//
//        //Set Data
//        if (imageView2 != null) {
//            imageView2.setImageResource(icdats.get(position).getFoodimage());
//        }
//        if (textView2 != null) {
//            textView2.setText(icdats.get(position).getFoodname());
//        }


        //Our Views
        ImageView imageView2 = convertView.findViewById(R.id.imagemodel2);
        TextView textView2 = convertView.findViewById(R.id.textmodel2);


        //Set Data
        imageView2.setImageResource(icdats.get(position).getFoodimage());
        textView2.setText(icdats.get(position).getFoodname());


        return convertView;
    }
}
