package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Gandalf;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        Gandalf myGandalf = context.getBean("gandalf", Gandalf.class);

        context.close();

        System.out.println();
        System.out.println("--------------");
        System.out.println(myGandalf.giveAdvice());
        System.out.println(myGandalf.changeDress());
        System.out.println("--------------");
    }
}
