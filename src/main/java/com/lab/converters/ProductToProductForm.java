package com.lab.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.lab.commands.ProductForm;
import com.lab.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
