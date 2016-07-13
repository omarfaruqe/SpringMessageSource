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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println(this.messageSource.getMessage("alban", null, "Default greeting", Locale.CANADA));
=======
        
        System.out.println(this.messageSource.getMessage("vasyl", null, "Default greeting", Locale.CANADA));
>>>>>>> origin/Vasyl_msg_from_property
=======
        
        System.out.println(this.messageSource.getMessage("asad", null, "Default greeting", Locale.CANADA));
>>>>>>> origin/Asadkhalid_Msg
=======
        System.out.println(this.messageSource.getMessage("mathieu", null, "Default name", Locale.CANADA));
>>>>>>> origin/Legault_test
=======
        System.out.println(this.messageSource.getMessage("iurii", null, "Default greeting", Locale.CANADA));
>>>>>>> origin/Iurii_Moto
=======
        System.out.println(this.messageSource.getMessage("message.Oleksandr", null, "Default greeting", Locale.FRANCE));
>>>>>>> origin/Oleksandr_Msg
=======
        System.out.println(this.messageSource.getMessage("alban", null, "Default greeting", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("vasyl", null, "Default greeting", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("asad", null, "Default greeting", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("mathieu", null, "Default name", Locale.CANADA));
        System.out.println(this.messageSource.getMessage("iurii", null, "Default greeting", Locale.CANADA));
>>>>>>> origin/Nikolay
    }
    
}
