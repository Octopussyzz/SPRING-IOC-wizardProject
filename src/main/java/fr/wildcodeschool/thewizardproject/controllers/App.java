package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myGandalf = context.getBean("gandalf", WizardInterface.class);
        context.close();
        System.out.println();
        System.out.println("----------------");
        System.out.println(myGandalf.giveAdvice());
        System.out.println(myGandalf.changeDress());
        System.out.println("----------------");
    }
}
