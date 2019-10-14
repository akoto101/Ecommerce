package com.hci.ecommerce.Data_Manager;

import android.graphics.Bitmap;

public class Model {
    private int ID;
    private int product1;
    private int product2;

    private String product_name_1;
    private String product_name_2;
    private String product_price_1;
    private String product_price_2;

    public Model()
    {


    }


    public Model(int ID, int product1, int product2, String product_name_1, String product_name_2, String product_price_1, String product_price_2) {
        this.ID = ID;
        this.product1 = product1;
        this.product2 = product2;
        this.product_name_1 = product_name_1;
        this.product_name_2 = product_name_2;
        this.product_price_1 = product_price_1;
        this.product_price_2 = product_price_2;
    }



    public int getProduct1() {
        return product1;
    }

    public void setProduct1(int product1) {
        this.product1 = product1;
    }

    public int getProduct2() {
        return product2;
    }

    public void setProduct2(int product2) {
        this.product2 = product2;
    }

    public String getProduct_name_1() {
        return product_name_1;
    }

    public void setProduct_name_1(String product_name_1) {
        this.product_name_1 = product_name_1;
    }

    public String getProduct_name_2() {
        return product_name_2;
    }

    public void setProduct_name_2(String product_name_2) {
        this.product_name_2 = product_name_2;
    }

    public String getProduct_price_1() {
        return product_price_1;
    }

    public void setProduct_price_1(String product_price_1) {
        this.product_price_1 = product_price_1;
    }

    public String getProduct_price_2() {
        return product_price_2;
    }

    public void setProduct_price_2(String product_price_2) {
        this.product_price_2 = product_price_2;
    }
}
