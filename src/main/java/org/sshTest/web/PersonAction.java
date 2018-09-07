package org.sshTest.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.sshTest.entity.Person;
import org.sshTest.service.PersonService;
import org.sshTest.service.impl.PersonServiceImpl;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/6 下午10:31
 */
@Namespace("/namespaceTest")
public class PersonAction extends ActionSupport {

    PersonService personService = new PersonServiceImpl();

    private List<Person> list;

    @Action(value="test",results = {
            @Result(name = "success",location = "/WEB-INF/jsp/test.jsp")})
    public String test(){

        list = personService.queryAll();
        return SUCCESS;
    }

    //这个get会将list传递给响应的jsp文件，可以在jsp中使用el表达式或者ongl表达式接收
    public List<Person> getList(){
        return list;
    }

}
