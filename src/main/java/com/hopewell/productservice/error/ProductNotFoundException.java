package com.hopewell.productservice.error;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException() {
        super("Product not found");
    }
}