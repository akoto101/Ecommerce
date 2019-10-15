package com.hci.ecommerce.Data_Manager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hci.ecommerce.Item_Viewer;
import com.hci.ecommerce.R;

import java.util.ArrayList;
import java.util.List;

public class Product_Adapter extends ArrayAdapter<Model> {
    private ArrayList<Model> dataSet;
    Context mContext;

    static  class ViewHolder
    {
        CardView card_product1,card_product2;
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
        final Model dataModel = getItem(position);
        final ViewHolder viewHolder;
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

            viewHolder.card_product1 = convertView.findViewById(R.id.card_item1);
            viewHolder.card_product2 = convertView.findViewById(R.id.card_item2);




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

        viewHolder.card_product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,dataModel.getProduct_name_1().toString(),Toast.LENGTH_SHORT).show();
                mContext.startActivity(new Intent(mContext, Item_Viewer.class));
            }
        });

        viewHolder.card_product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,dataModel.getProduct_name_2().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.imgbtn_Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,dataModel.getProduct_name_1() + " successfully added",Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.imgbtn_Cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,dataModel.getProduct_name_2() + " successfully added",Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.imgBtn_fav.setOnClickListener(new View.OnClickListener() {
            boolean status = false;
            @Override
            public void onClick(View v) {

                if(!status)
                {
                    viewHolder.imgBtn_fav.setImageResource(R.drawable.fav_true);
                    status = true;

                }
                else
                    {
                        viewHolder.imgBtn_fav.setImageResource(R.drawable.fav_false);
                        status = false;

                    }
            }
        });

        viewHolder.imgBtn_fav2.setOnClickListener(new View.OnClickListener() {
            boolean status = false;
            @Override
            public void onClick(View v) {

                if(!status)
                {
                    viewHolder.imgBtn_fav2.setImageResource(R.drawable.fav_true);
                    status = true;
                }
                else
                {
                    viewHolder.imgBtn_fav2.setImageResource(R.drawable.fav_false);
                }
            }
        });
        return convertView;
    }
}
