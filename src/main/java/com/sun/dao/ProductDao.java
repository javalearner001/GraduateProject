package com.sun.dao;

import com.sun.pojo.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findHotProductList();

    List<Product> findNewProductList();
}
