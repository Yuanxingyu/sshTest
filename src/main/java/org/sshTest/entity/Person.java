package org.sshTest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author stary
 * @date 2018/8/31 下午4:00
 */

@Getter
@Setter
@NoArgsConstructor

@Entity(name = "person")
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private int age;

    public Person(int id, String name, String sex, int age) {
        this.id=id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString() {
        return id+"  "+name+"  "+sex+"  "+age;
    }
}
