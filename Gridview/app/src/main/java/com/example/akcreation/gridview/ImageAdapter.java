package com.example.akcreation.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by Ankita Jounjal on 27-07-2016.
 */
public class ImageAdapter extends BaseAdapter {
   private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;

    }

    public int getCount(){
        return imgIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView iv;

        if(convertView == null){
            iv = new ImageView(mContext);
            iv.setLayoutParams(new GridView.LayoutParams(100,100));

            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iv.setPadding(8,8,8,8);
        }
        else {
            iv = (ImageView)convertView;
        }
        iv.setImageResource(imgIds[position]);
        return iv;

    }
    private Integer[] imgIds = {
            R.drawable.ic_accessibility_black_24dp, R.drawable.ic_accessible_black_24dp,
            R.drawable.ic_account_balance_black_24dp, R.drawable.ic_account_balance_wallet_black_24dp,
            R.drawable.ic_account_box_black_24dp, R.drawable.ic_account_circle_black_24dp,
    };


}

