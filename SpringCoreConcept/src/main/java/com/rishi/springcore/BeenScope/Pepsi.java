package com.rishi.springcore.BeenScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")      // show all object in singleton
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //same
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)  //thease are same
public class Pepsi {

    @Autowired
    private Soda soda;
    public Pepsi(){
        System.out.println("Creating Pepsi");
    }
    public void drink(){
        System.out.println("Pepsi is very cool");
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }
}
