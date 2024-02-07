package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class ProductController {

    private ProductService service;

    public String createProductPage(Model model) {
        Product product = new Product();
        model.addAllAttributes("product", product);
        return "createProduct";
    }

    public String createProductPost(Product product, Model) {
        service.create(product);
        return "redirect:list";
    }

    public String productListPage(Model model) {
        List<Product> allProducts = service.findAll();
        model.addAllAttributes("products", allProducts);
        return "productList";
    }
}