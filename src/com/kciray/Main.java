package com.kciray;

import org.springframework.beans.factory.BeanFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.instantiate("com.kciray");
        beanFactory.populateProperties();//без этого не получается бин

        ProductService productService = (ProductService) beanFactory.getBean("productService");
        System.out.println(productService);//ProductService@612
        System.out.println();
        System.out.println("productService.getPromotionsService():\n\t\t" + productService.getPromotionsService());


    }
}