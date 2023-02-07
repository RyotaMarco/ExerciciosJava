package Util;

import Entities.Products;

import java.util.function.Predicate;

public class ProductsPredicate implements Predicate<Products> {


    @Override
    public boolean test(Products products) {
        return products.getPrice() >= 100;
    }
}
