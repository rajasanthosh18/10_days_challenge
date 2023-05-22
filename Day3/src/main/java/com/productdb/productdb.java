package com.productdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productdb {
    private int productNo = 1;
    Connection con = null;
    public productdb(){
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/productDB", "postgres", "0000");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void save(Product p) {
        String query = "insert into product (id,name,type,place,warranty) values (?,?,?,?,?)";
        try {
            PreparedStatement prepared =  con.prepareStatement(query);
            prepared.setInt(1, productNo);
            prepared.setString(2, p.getName());
            prepared.setString(3, p.getType());
            prepared.setString(4, p.getPlace());
            prepared.setInt(5,p.getWarranty());
            prepared.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        productNo++;
    }
    public List<Product> getAll() {
        List <Product> p = new ArrayList<>();
        String query = "select * from product";
        try {
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product ps = new Product();
                ps.setName(rs.getString(2));
                ps.setPlace(rs.getString(3));
                ps.setType(rs.getString(4));
                ps.setWarranty(rs.getInt(5));
                p.add(ps); 
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return p;
    }
    //Assignment 3
    public Product getProduct(String name) {
        Product p = new Product();
        String query = "select * from product where name = ?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,name);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                p.setName(name);
                p.setPlace(rs.getString(4));
                p.setType(rs.getString(3));
                p.setType(rs.getString(3));
                p.setWarranty(rs.getInt(5));
                break;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return p;
    }


}
