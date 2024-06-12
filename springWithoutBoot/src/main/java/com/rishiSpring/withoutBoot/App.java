package com.rishiSpring.withoutBoot;

import another.world.Repo;
import another.world.RepoConfig;
import com.rishiSpring.withoutBoot.Beans.CartService;
import com.rishiSpring.withoutBoot.Beans.OrderService;
import com.rishiSpring.withoutBoot.Beans.UserService;
import com.rishiSpring.withoutBoot.config.AppConfig;
import com.rishiSpring.withoutBoot.config.WebConfig;
import com.rishiSpring.withoutBoot.web.AuthController;
import com.rishiSpring.withoutBoot.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started" );
        /*we have to create object of application context
        //this is for annotation configuration*/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, RepoConfig.class, WebConfig.class);
        System.out.println(context);
        CartService cartService1 = context.getBean("cartService1", CartService.class);
        cartService1.createCart();

        UserService bean = context.getBean(UserService.class);
        bean.saveUser();

        OrderService bean1 = context.getBean(OrderService.class);
        bean1.createOrder();

        HomeController ho = context.getBean(HomeController.class);
        ho.homePage();

        //this is for xml based configuration
        //ApplicationContext context=new ClassPathXmlApplicationContext();

        AuthController au = context.getBean(AuthController.class);
        au.login();

        Repo re = context.getBean(Repo.class);
        re.getUser();
    }
}
