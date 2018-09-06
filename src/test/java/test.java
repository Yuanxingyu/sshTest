import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.sshTest.entity.Person;
import org.sshTest.service.impl.PersonServiceImpl;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/5 下午4:40
 */
@RunWith(JUnit4.class)
public class test {

    PersonServiceImpl personService = new PersonServiceImpl();


    @Test
    public void hibernateTest(){

        List<Person> list = personService.queryAll();
        //Person person = new Person(3,"王五","男",27);
        //session.save(person);

        for (Person person:list)
            System.out.println(person.toString());

    }
}
