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

    private int cart_product_image;

    private String cart_product_name;
    private  String cart_product_price;
    private  String cart_product_quantity;

    public Model(int ID, int cart_product_image, String cart_product_name, String cart_product_price, String cart_product_quantity) {
        this.ID = ID;
        this.cart_product_image = cart_product_image;
        this.cart_product_name = cart_product_name;
        this.cart_product_price = cart_product_price;
        this.cart_product_quantity = cart_product_quantity;
    }

    public Model(int cart_product_image, String cart_product_name, String cart_product_price, String cart_product_quantity) {
        this.cart_product_image = cart_product_image;
        this.cart_product_name = cart_product_name;
        this.cart_product_price = cart_product_price;
        this.cart_product_quantity = cart_product_quantity;
    }




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

    public int getCart_product_image() {
        return cart_product_image;
    }

    public void setCart_product_image(int cart_product_image) {
        this.cart_product_image = cart_product_image;
    }

    public String getCart_product_name() {
        return cart_product_name;
    }

    public void setCart_product_name(String cart_product_name) {
        this.cart_product_name = cart_product_name;
    }

    public String getCart_product_price() {
        return cart_product_price;
    }

    public void setCart_product_price(String cart_product_price) {
        this.cart_product_price = cart_product_price;
    }

    public String getCart_product_quantity() {
        return cart_product_quantity;
    }

    public void setCart_product_quantity(String cart_product_quantity) {
        this.cart_product_quantity = cart_product_quantity;
    }
}
