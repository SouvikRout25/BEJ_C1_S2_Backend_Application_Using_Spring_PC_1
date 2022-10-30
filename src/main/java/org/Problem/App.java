package org.Problem;

import org.Problem.config.AppConfig;
import org.Problem.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product nescafe = context.getBean("Nescafe",Product.class);
        Product bru = context.getBean("Bru",Product.class);

        System.out.println(nescafe);
        System.out.println();
        System.out.println(bru);

    }
}