package com.productdb;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    productdb db = new productdb();
    public void addProduct(Product p){
        db.save(p);
    }

    public List<Product> getAllProducts(){
        return db.getAll();
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return db.getProduct(name);
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }

    public List<Product> getPlace(String place){
        // place = place.toLowerCase();
        // List<Product> p = new ArrayList<>();
        // for(Product prods : products){
        //     String pl = prods.getPlace().toLowerCase();
        //     if(pl.equals(place)){
        //         p.add(prods);
        //     }
        // }
        
        return null;
    }

    public List<Product> getOutOfWarrentyProduct(){
        // //System.out.println(Year.now().getValue());
        // List<Product> p = new ArrayList<>();
        // for(Product prods : products){
        //     //System.out.println(prods.getWarranty());
        //     if(prods.getWarranty() < Year.now().getValue()){
        //         p.add(prods);
        //     }
        // }
        return null;
        
    }

}
