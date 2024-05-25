package com.rishi.mvc.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController{


    @GetMapping("/getProduct")
    public String getProduct(
            @RequestParam("productName") String name,
            @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating,
            @RequestParam("productId") int id)
    {
        System.out.println("ProductName: "+name);
        System.out.println("ProductId: " +id);
        System.out.println("Product Rating: " + rating);
        return "This is testing product url";
    }


    @RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(
            @PathVariable("productId")int id, // we name difference
            @PathVariable String productName, //not need write
            @PathVariable int productRating
    ){
        System.out.println("ProductName " + productName);
        System.out.println("product Id " + id);
        System.out.println("product Rating " + productRating);
            return "this is checking the concept of path variable";
    }
}
