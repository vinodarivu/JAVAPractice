/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVA8;

/**
 *
 * @author U6032545
 */
import java.util.*;
import java.util.stream.Collectors;

class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
      public float getPrice() {  
        return price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
      
}

public class StreamFilter {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products  
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
         System.out.println("==================================================");
        List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 0000)// filtering data  
                .map(p -> p.price) // fetching price  
                .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);
         System.out.println("==================================================");
        
        

        /*Stream filter and Iterator both*/
        productsList.stream().filter(product -> product.price >= 30000).forEach(product -> System.out.println(product.name));
         System.out.println("==================================================");
        
        
        

        /*
         This method takes a sequence of input elements and combines them into a single summary result by repeated operation. For example, finding the sum of numbers, or accumulating elements into a list.

In the following example, we are using reduce() method, which is used to sum of all the product prices.
         */
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);   // accumulating price  
        System.out.println(totalPrice);
       
        
         System.out.println("==================================================");
        // More precise code   
        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);
        
        
         System.out.println("==================================================");
        
        /*sum by using collector method*/
         double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3); 
        
        
        System.out.println("==================================================");
       
           // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
         System.out.println("==================================================");
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
         System.out.println("========count==========================================");
         
            // count number of products based on the filter  
        long count = productsList.stream()
                    .filter(product->product.price<30000)  
                    .count(); 
         System.out.println("================================================== "+count);
                 // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println("=================================================="+productPriceList);
              // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name)); 
        System.out.println(productPriceMap);  
          System.out.println("==================================================");
                List<Float> productPriceLis =   
                productsList.stream()  
                            .filter(p -> p.price > 20000) // filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println("productPriceLis====>"+productPriceLis);  
         System.out.println("==================================================");
          
        
        
        
        
        

        /*my ruff*/
        List<String> productPriceList3 = productsList.stream().map(p -> p.name).collect(Collectors.toList());
        System.out.println(productPriceList3);

    }
}
