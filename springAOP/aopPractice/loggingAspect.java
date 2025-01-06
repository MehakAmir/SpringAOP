package aopPractice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {
    @Before("execution(* aopPractice.ShopingCart.checkout(..))")
    public void Beforelogger(JoinPoint jp){

        Object arg= jp.getArgs()[0].toString();
        System.out.println("Beforeloggers with the arguments are :"+ arg);
        System.out.println("Beforeloggers");
    }

    @After("execution(* aopPractice.ShopingCart.checkout(..))")
    public void Afterlogger(){
        System.out.println("Afterloggers");
    }

@Pointcut("execution(* aopPractice.ShopingCart.quantity(..))")
    public void AfterReturningpointcut(){

    }

@AfterReturning(pointcut = "AfterReturningpointcut()",returning = "val")
    public void afterReturning(String val){
        System.out.println("Afterreturning"+ val);
    }



}
