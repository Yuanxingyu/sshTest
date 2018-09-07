package org.sshTest.dao;

import org.sshTest.entity.Person;

import java.util.List;

/**
 * @author stary
 * @date 2018/8/31 下午4:14
 */
public interface PersonDao {

    //查询所有记录
    public List<Person> queryAll();

}
