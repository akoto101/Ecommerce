package com.hci.ecommerce.Data_Manager;


import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hci.ecommerce.R;

import java.util.ArrayList;

public class Cart_Adapter extends ArrayAdapter<Model> {


    private ArrayList<Model> dataSet;
    Context mContext;

    static  class ViewHolder
    {
        ImageView cart_image,cart_inc,cart_dec,cart_delete;
        TextView cart_product_title,cart_product_price,cart_product_quantity;
    }
    public Cart_Adapter( Context context, ArrayList<Model> model) {
        super(context, R.layout.add_to_cart, model);

        dataSet = model;
        mContext = context;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Model model = getItem(position);
       final ViewHolder viewHolder;
       final View result;

        if(convertView == null)
        {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.add_to_cart, parent, false);

            viewHolder.cart_image = convertView.findViewById(R.id.cart_product_image);
            viewHolder.cart_product_title = convertView.findViewById(R.id.cart_product_name);
            viewHolder.cart_product_price = convertView.findViewById(R.id.cart_product_price);
            viewHolder.cart_product_quantity = convertView.findViewById(R.id.cart_product_quantity);

            viewHolder.cart_inc = convertView.findViewById(R.id.btn_quantity_inc);
            viewHolder.cart_dec = convertView.findViewById(R.id.btn_quantity_dec);

            viewHolder.cart_delete = convertView.findViewById(R.id.btn_product_delete);
            result = convertView;
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.cart_image.setImageResource(model.getCart_product_image());
        viewHolder.cart_product_title.setText(model.getCart_product_name());
        viewHolder.cart_product_price.setText(model.getCart_product_price());
        viewHolder.cart_product_quantity.setText(model.getCart_product_quantity());

        viewHolder.cart_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.cart_product_quantity.setText(String.valueOf(Integer.parseInt(viewHolder.cart_product_quantity.getText().toString())+ 1));
            }
        });

        viewHolder.cart_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int  cart_quantity = Integer.parseInt(viewHolder.cart_product_quantity.getText().toString());
              viewHolder.cart_product_quantity.setText(String.valueOf(cart_quantity > 0 ? cart_quantity - 1  : 0 ));

            }
        });
        viewHolder.cart_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(result,"Deleted Successfully",Snackbar.LENGTH_SHORT).show();
                Model model = getItem(position);
                remove(model);
            }
        });



        return convertView;
    }
}
