package com.sun.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.dao.ProductDao;
import com.sun.pojo.Category;
import com.sun.pojo.Product;
import com.sun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author sunkai
 * @Date 2018/5/8 10:59
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findHotProductList() {
        int iDisplayStart=1;
        int iDisplayLength=10;
        PageHelper.startPage(iDisplayStart,iDisplayLength);
        List<Product> productList=productDao.findHotProductList();
        PageInfo pageInfo=new PageInfo(productList);
        List<Product> returnList=pageInfo.getList();
        return returnList;
    }

    @Override
    public List<Product> findNewProductList() {
        int iDisplayStart=1;
        int iDisplayLength=10;
        PageHelper.startPage(iDisplayStart,iDisplayLength);
        List<Product> productList=productDao.findNewProductList();
        PageInfo pageInfo=new PageInfo(productList);
        List<Product> returnList=pageInfo.getList();
        return returnList;
    }

    @Override
    public List<Category> findAllCategory() {
        return null;
    }

    @Override
    public Product findProductByPid(String pid) {
        return null;
    }
}
