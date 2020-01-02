package com.thought.it.service;

import com.thought.it.dao.PersonDao;
import com.thought.it.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/10/15.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Person queryPersonById(int id){
        return personDao.queryPersonById(id);
    };

    public void insertPerson(Person person){
        personDao.insertPerson(person);
    };
}
