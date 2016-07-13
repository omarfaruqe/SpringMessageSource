/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import java.util.Locale;

/**
 *
 * @author faruqe
 */
public class SpringMessageSource {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Shape shape=(Shape)context.getBean("circleId");
        shape.draw();
        System.out.println("In Main: "+context.getMessage("greeting", null, "Default greeting", Locale.CANADA));
    }
    
}
