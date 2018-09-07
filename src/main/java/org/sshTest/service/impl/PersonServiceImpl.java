package org.sshTest.service.impl;

import org.sshTest.dao.PersonDao;
import org.sshTest.dao.impl.PersonDaoImpl;
import org.sshTest.entity.Person;
import org.sshTest.service.PersonService;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/2 下午5:03
 */
public class PersonServiceImpl implements PersonService {

    PersonDao personDao = new PersonDaoImpl();

    public List<Person> queryAll() {

        List<Person> list=personDao.queryAll();
        return list;
    }
}
