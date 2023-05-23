package com.product.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class productController {
    
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> findAll() {
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product findName(@PathVariable String name){
        return service.getProductWithText(name);
    }

    @GetMapping("/product/place/{name}")
    public List<Product> findByPlace(@PathVariable String name) {
        return service.getPlace(name);
    }

    @GetMapping("/product/warranty")
    public List<Product> outOfWar() {
        return service.getOutOfWarrentyProduct();
    }

    @PostMapping("/product/add")
    public void addProduct(@RequestBody Product p) {
        service.addProduct(p);
    }
}
