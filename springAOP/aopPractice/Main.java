package aopPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
     public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    ShopingCart cart = context.getBean(ShopingCart.class);
    cart.checkout("cancle");
    }
}
