package org.sshTest.tool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建并获取、销毁Session等
 * @author stary
 * @date 2018/9/6 下午4:13
 */

@Component
public class SessionManager {

    //private SessionFactory sessionFactory;
    @Autowired
    private SessionFactory sessionFactory;

    private Session session;
    private Transaction transaction;

    public Session init() {
        //Configuration configuration = new Configuration().configure();//创建配置对象
        //sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        session = sessionFactory.openSession();//开启会话
        transaction = session.beginTransaction();//开启事务
        return session;
    }

    public void destory() {
        transaction.commit();//事务提交
        session.close();//关闭会话
        //sessionFactory.close();//关闭会话工厂
    }

}
