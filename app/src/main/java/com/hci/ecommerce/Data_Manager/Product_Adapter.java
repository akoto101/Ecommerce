package com.hci.ecommerce.Data_Manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.hci.ecommerce.R;

import java.util.ArrayList;
import java.util.List;

public class Product_Adapter extends ArrayAdapter<Model> {
    private ArrayList<Model> dataSet;
    Context mContext;

    static  class ViewHolder
    {
        ImageView img_product1,img_product2;
        TextView txt_product_name1,txt_product_name2,txt_product_price1,txt_product_price2;
        ImageView imgbtn_Cart,imgBtn_fav,imgbtn_Cart2,imgBtn_fav2;
    }

    public Product_Adapter(Context context, ArrayList<Model> model) {
        super(context, R.layout.product_item,  model);
        dataSet = model;
        mContext = context;
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        Model dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if(convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.product_item, parent, false);
            viewHolder.img_product1 = convertView.findViewById(R.id.img_Item1);
            viewHolder.img_product2 = convertView.findViewById(R.id.img_Item2);
            viewHolder.txt_product_name1 = convertView.findViewById(R.id.product_Title1);
            viewHolder.txt_product_name2 = convertView.findViewById(R.id.product_Title2);
            viewHolder.txt_product_price1 = convertView.findViewById(R.id.product_Price);
            viewHolder.txt_product_price2 = convertView.findViewById(R.id.product_Price2);

            viewHolder.imgbtn_Cart = convertView.findViewById(R.id.img_Cart);
            viewHolder.imgbtn_Cart2 = convertView.findViewById(R.id.img_Cart2);

            viewHolder.imgBtn_fav = convertView.findViewById(R.id.img_Fav);
            viewHolder.imgBtn_fav2 = convertView.findViewById(R.id.img_Fav2);

            result = convertView;
            convertView.setTag(viewHolder);
        }
        else
            {
                viewHolder = (ViewHolder) convertView.getTag();
                result = convertView;
            }
        viewHolder.img_product1.setImageResource(dataModel.getProduct1());
        viewHolder.img_product2.setImageResource(dataModel.getProduct2());
        viewHolder.txt_product_name1.setText(dataModel.getProduct_name_1());
                viewHolder.txt_product_name2 .setText(dataModel.getProduct_name_2());
                        viewHolder.txt_product_price1 .setText(dataModel.getProduct_price_1());
                                viewHolder.txt_product_price2 .setText(dataModel.getProduct_price_2());
        return convertView;
    }
}
