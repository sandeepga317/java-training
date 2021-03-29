package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"Apple Laptop",90000f));
        productsList.add(new Product(7,"Lenevo Laptop",28900f)); 
//        List<Float> productPriceList = new ArrayList<Float>();  
//        for(Product product: productsList){  
//              
//            // filtering data of list  
//            if(product.price<30000){  
//                productPriceList.add(product.price);    // adding price to a productPriceList  
//            }  
//        }  
//        System.out.println(productPriceList);   // displaying data  
        
//        for (Product product : productsList) {
//			System.out.println(product.id);
//		}
//        System.out.println("After Java 8");
//        productsList.forEach(product -> System.out.println( product.id));
        
//       List<Product> lenovoList=  productsList.stream().filter(product -> product.name.equals("Lenevo Laptop")).collect(Collectors.toList());
       
        Set<String> companies =  productsList.stream().map(Product::getName).collect(Collectors.toSet());

        companies.stream().sorted().forEach(System.out::println);
        
        Map<Integer, Product> productMap =  productsList.stream().collect(Collectors.toMap(product -> product.id, product-> product));
        

        
    }  
}  