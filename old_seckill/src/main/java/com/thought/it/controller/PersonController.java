package com.thought.it.controller;

import com.thought.it.entity.Person;
import com.thought.it.service.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2019/10/15.
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @Test
    public void testPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        PersonController personController = (PersonController) context.getBean("personController");
        Person person = new Person();
        person.setName("小明");
        person.setAge(22);
        person.setBirthday("02-05");
        person.setAddress("上海");
//        Person person = personController.personService.queryPersonById(3);
        personController.personService.insertPerson(person);
        System.out.println(person);
    }
}
