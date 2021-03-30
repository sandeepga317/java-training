package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(6,"Apple Laptop",90000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(7,"Lenevo Laptop",28900f)); 
        productsList.add(new Product(2,"Dell Laptop",30000f)); 
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
       
//        Set<String> companies =  productsList.stream().map(Product::getName).collect(Collectors.toSet());
//
//        companies.stream().sorted().forEach(System.out::println);
//        
//        Map<Integer, Product> productMap =  productsList.stream().collect(Collectors.toMap(product -> product.id, product-> product));
//        
//        Optional<Product> productOptional = productsList.stream().filter(a-> a.getName().equals("Apple ")).findFirst();
//        if(productOptional.isPresent()) {
//        	Product product = productOptional.get();
//        	System.out.println(product.getId());
//        }else System.out.println("product not found");
//        
//        productsList.stream().toArray();
//        
//        List<List<String>> namesNested = Arrays.asList(  
//        	      Arrays.asList("Jeff", "Bezos"),  
//        	      Arrays.asList("Bill", "Gates"),  
//        	      Arrays.asList("Mark", "Zuckerberg")); 
//        	 
//        	    List<String> namesFlatStream = namesNested.stream() 
//        	      .flatMap(Collection::stream) 
//        	      .collect(Collectors.toList()); 
//        	    namesFlatStream.forEach(System.out::println);
        
//        Optional<Product> productSorted = productsList.stream().max((p1,p2)->p1.getId() - p2.getId());
//       if(productSorted.isPresent()) {
//    	   System.out.println(productSorted.get().getId());
//       }
        
//        Map<String, List<Product>> map = productsList.stream().collect(Collectors.groupingBy(p -> p.getName()));
//       for (String product : map.keySet()) {
//		System.out.println("Key: "+product);
//		System.out.println("Values: ");
//		map.get(product).forEach(value -> System.out.println(value.getId()));
//		System.out.println("----------------------------");
//	}
        productsList.stream().forEach(p->System.out.println(p.getId()));
        System.out.println("Parallel Stream");
        productsList.stream().parallel().forEach(p->System.out.println(p.getId()));
    }  
}  