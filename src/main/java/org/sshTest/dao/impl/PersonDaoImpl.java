package org.sshTest.dao.impl;

import org.hibernate.Session;
import org.sshTest.dao.PersonDao;
import org.sshTest.entity.Person;
import org.sshTest.tool.SessionManager;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/7 下午2:55
 */
public class PersonDaoImpl implements PersonDao {



    public List<Person> queryAll() {
        List<Person> list;

        SessionManager sessionManager = new SessionManager();
        Session session = sessionManager.init();
        list = session.createQuery("from person").list();
        sessionManager.destory();

        return list;
    }
}
