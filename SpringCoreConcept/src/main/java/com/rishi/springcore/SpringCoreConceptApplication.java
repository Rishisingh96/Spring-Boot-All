package com.rishi.springcore;//package com.rishi.springcore;


import com.rishi.springcore.BeenScope.Pepsi;
import com.rishi.springcore.BeenScope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);

		//bean scope
		//first request for Pepsi bean
//		Pepsi bean = context.getBean(Pepsi.class);
//		System.out.println(bean);
		//bean.drink();

	/*	//second request for Pepsi bean
		Pepsi bean1 = context.getBean(Pepsi.class);
		System.out.println(bean1);

		//third request for Pepsi bean
		Pepsi bean2 = context.getBean(Pepsi.class);
		System.out.println(bean2);
*/

		// using Proxy Model for object same
		/*Pepsi pepsi = context.getBean(Pepsi.class);
        System.out.println(pepsi);
        Soda soda = pepsi.getSoda();
        System.out.println(soda);

        Pepsi pepsi1 = context.getBean(Pepsi.class);
        System.out.println(pepsi1);
        Soda soda1 = pepsi1.getSoda();
        System.out.println(soda1);

        Pepsi pepsi2 = context.getBean(Pepsi.class);
        System.out.println(pepsi2);
        System.out.println(pepsi2.getSoda());*/

        //Been Lifecycle


	}
}
