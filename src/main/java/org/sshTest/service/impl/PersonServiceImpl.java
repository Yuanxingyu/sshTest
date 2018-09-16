package org.sshTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sshTest.dao.PersonDao;
import org.sshTest.dao.impl.PersonDaoImpl;
import org.sshTest.entity.Person;
import org.sshTest.service.PersonService;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/2 下午5:03
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    public List<Person> queryAll() {

        List<Person> list=personDao.queryAll();
        return list;
    }
}
