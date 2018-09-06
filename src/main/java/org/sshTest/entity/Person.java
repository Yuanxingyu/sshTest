package org.sshTest.entity;

import javax.persistence.*;

/**
 * @author stary
 * @date 2018/8/31 下午4:00
 */

//@Getter
//@Setter
//@NoArgsConstructor
//hibernate似乎需要与lombok整合
@Entity(name = "person")
@Table(name = "person")
public class Person {

    private int id;
    private String name;
    private String sex;
    private int age;

    public Person(int id, String name, String sex, int age) {
        this.id=id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return id+"  "+name+"  "+sex+"  "+age;
    }
}
