package org.sshTest.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sshTest.dao.PersonDao;
import org.sshTest.entity.Person;
import org.sshTest.tool.SessionManager;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/7 下午2:55
 */
@Transactional
@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    HibernateTemplate hibernateTemplate;//可行

    //@Autowired
    //private SessionManager sessionManager;


//    @Autowired
//    SessionFactory sessionFactory;//可行

    public List<Person> queryAll() {
        List<Person> list;

//        SessionManager sessionManager = new SessionManager();
//        Session session = sessionManager.init();
//        list = session.createQuery("from person").list();
//        sessionManager.destory();

        list = hibernateTemplate.getSessionFactory().openSession().createQuery("from person").list();

//        list = sessionFactory.openSession().createQuery("from person").list();

        return list;
    }
}
