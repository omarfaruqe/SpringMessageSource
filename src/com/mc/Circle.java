/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 *
 * @author faruqe
 */
public class Circle implements Shape{
    private Point center;
    
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {        
        System.out.println("Circle Drawn: "+getCenter().getX()+", "+getCenter().getY());
        System.out.println(this.messageSource.getMessage("greeting", null, "Default greeting", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default greeting", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "Default point greeting", Locale.CANADA));
        
        System.out.println(this.messageSource.getMessage("shahar", null, "Default greeting", Locale.CANADA));
    }
    
}
