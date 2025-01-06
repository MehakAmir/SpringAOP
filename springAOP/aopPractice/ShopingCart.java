package aopPractice;

import org.springframework.stereotype.Component;

@Component
public class ShopingCart {
    public void checkout(String status){
        // Logging 
        // authentication and authorization
        // sanitize the data 
        System.out.println("checkout method for shoping cart called");
    }
    public int quantity(){
        return 2;  // we can access using after returning annotation
    }
}
