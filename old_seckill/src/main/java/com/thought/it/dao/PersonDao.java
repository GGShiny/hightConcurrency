package com.thought.it.dao;

import com.thought.it.entity.Person;

/**
 * Created by Administrator on 2019/10/15.
 */
public interface PersonDao {
    public Person queryPersonById(int id);

    public void insertPerson(Person person);
}
