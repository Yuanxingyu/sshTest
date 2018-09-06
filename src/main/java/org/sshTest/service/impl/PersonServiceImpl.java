package org.sshTest.service.impl;

import org.hibernate.Session;
import org.sshTest.entity.Person;
import org.sshTest.service.PersonService;
import org.sshTest.tool.SessionManager;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/2 下午5:03
 */
public class PersonServiceImpl implements PersonService {

    public List<Person> queryAll() {
        List<Person> list;

        SessionManager sessionManager = new SessionManager();
        Session session = sessionManager.init();
        list = session.createQuery("from person").list();
        sessionManager.destory();

        return list;
    }
}
