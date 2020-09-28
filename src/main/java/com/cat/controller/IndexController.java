package com.cat.controller;

import com.cat.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(produces="text/html;charset=UTF-8")
public class IndexController {
    List<Person> PersonList  =new ArrayList<>();
//    @RequestMapping("/hello")
//    public ModelAndView hello(){
//
//        Person Person1 = new Person();
//        Person Person2 = new Person();
//        Person Person3 = new Person();
//        Person1.name ="张三";
//        Person2.name ="李四";
//        Person3.name ="王五";
//        Person1.age =12;
//        Person2.age =13;
//        Person3.age =15;
//        Person1.sex ="男";
//        Person2.sex ="女";
//        Person3.sex ="男";
//        PersonList.add(Person1);
//        PersonList.add(Person2);
//        PersonList.add(Person3);
//        System.out.println(PersonList);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("hello");
//        modelAndView.addObject("person",PersonList);
//        return modelAndView;
//    }


    //返回json格式
//    @RequestMapping(value = "/hello2" )
//    @ResponseBody
//    public Object hello2() throws IOException {
//        Person Person4 = new Person();
//        Person Person5 = new Person();
//        Person Person6 = new Person();
//        Person4.name ="王晓红";
//        Person5.name ="王晓绿";
//        Person6.name ="王晓蓝";
//        Person4.age =13;
//        Person5.age =14;
//        Person6.age =16;
//        Person4.sex ="男";
//        Person5.sex ="女";
//        Person6.sex ="男";
//        PersonList.add(Person4);
//        PersonList.add(Person5);
//        PersonList.add(Person6);
//        System.out.println(PersonList);
//        ObjectMapper mapper = new ObjectMapper();
//        String str = mapper.writeValueAsString(PersonList);
//        System.out.println(str);
//        return str;
//    }

        //传参参数
        @RequestMapping(value = "/hello3" )
        public String hello3(@RequestParam(value = "username", required = false) String username ){
            System.out.println("前台传递的参数是:" + username);
            return  "hello";
        }
        //传递对象
        @RequestMapping(value = "/hello4" )
        public String hello4( Person person ){
            System.out.println("前台传递的参数是:" + person);
            return  "hello";
        }
}
