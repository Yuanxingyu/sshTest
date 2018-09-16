import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.sshTest.entity.Person;
import org.sshTest.service.impl.PersonServiceImpl;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/5 下午4:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class test {

    @Autowired
    PersonServiceImpl personService;


    @Test
    public void hibernateTest(){

        List<Person> list = personService.queryAll();
        //Person person = new Person(3,"王五","男",27);
        //session.save(person);

        for (Person person:list)
            System.out.println(person.toString());

    }
}
